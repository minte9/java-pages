/**
 * With 'synchronized' method ...
 * only one thread at a time can access that method.
 */

package com.minte9.threads.lock;

public class SynchronizedApp {
    public static void main(String[] args) {
    
        SynchronizedRunner runner = new SynchronizedRunner();
        Thread a = new Thread(runner, "Alpha");
        Thread b = new Thread(runner, "Beta");
        a.start();
        b.start();

        /*
            Acc Balance: 20
            Acc Balance: 20
            Alpha --- withdraw --- 10
            Acc Balance: 10
            Beta --- withdraw --- 10
            Acc Balance: 0
        */
    }
}

class SynchronizedRunner implements Runnable {
    private int accountBalance = 20;

    @Override public void run() {

        System.out.println("Acc Balance: " + accountBalance); 
        withdraw(10);

        System.out.println("Acc Balance: " + accountBalance); 
        withdraw(10);
    }

    private synchronized void withdraw(int amount) { // Look Here

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