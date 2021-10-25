/**
 * With synchronized method ...
 * only one thread at a time can access that method.
 */

package com.minte9.threads.lock;

public class Synchronized implements Runnable {
    
    private Acc acc = new Acc();
    
    public static void main(String[] args) {
    
        Synchronized runner = new Synchronized();
        
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("Alpha");
        beta.setName("Beta");

        alpha.start();
        beta.start();

        /*
            Account balance: 20
            Account balance: 20
            Alpha is going to sleep
            Alpha --- withdraw --- 10
            Account balance: 10
            Beta is going to sleep

            Beta --- withdraw --- 10 // Correct - Look Here
            Account balance: 0
        */
    }
    
    @Override public void run() {

        for (int i=0; i<2; i++) {

            System.out.println(
                "Account balance: " + acc.getBalance()
            );

            makeWithdraw(10);
        }
    }
    
    private synchronized void makeWithdraw(int amount) { // Look Here

        if (acc.getBalance() >= amount) {

            try {
                System.out.println(
                    Thread.currentThread().getName() 
                        + " is going to sleep"
                );
                Thread.sleep(500); 

            } catch (InterruptedException e) { 
                e.printStackTrace();
            }

            acc.withdraw(amount);
        }
    }
}

class Acc {
    private int balance = 20;
    
    public int getBalance() {
        return balance;
    }
    
    public void withdraw(int amount) {
        balance = balance - amount;
        System.out.println(
            Thread.currentThread().getName() + " --- withdraw --- 10"
        );
    }
}