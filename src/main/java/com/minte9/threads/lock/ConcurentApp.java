/**
 * Threads have names (default or given by you).
 * We don't know how often the threads will switch.
 * 
 * Two or more threads may have access to a single object's data.
 * We need a lock for access.
 */

package com.minte9.threads.lock;

public class ConcurentApp {    
    public static void main(String[] args) {
    
        ConcurentRunner runner = new ConcurentRunner();
        Thread a = new Thread(runner, "Alpha");
        Thread b = new Thread(runner, "Beta");
        a.start();
        b.start();

        /* 
            Acc Balance: 20
            Beta is going to sleep
            Acc Balance: 20
            Alpha is going to sleep
            Beta --- withdraw --- 10
            Acc Balance: 0
            Alpha --- withdraw --- 10 // Not good! - Look Here
            Acc Balance: 0
        */
    }    
}

class ConcurentRunner implements Runnable {
    private int accountBalance = 20;

    @Override public void run() {
        System.out.println("Acc Balance: " + accountBalance); 
        withdraw(10);
        System.out.println("Acc Balance: " + accountBalance); 
        withdraw(10);
    }

    private void withdraw(int amount) {
        if (accountBalance >= amount) { 

            try {
                Thread.sleep(500); // sleep - threads take turns
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            }
            
            accountBalance = accountBalance - amount;
            System.out.println(
                Thread.currentThread().getName() + " --- withdraw --- 10"
            );
        }
    }
}