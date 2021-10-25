/**
 * Threads have names (default or given by you).
 * We don't know how often the threads will switch.
 * 
 * Two or more threads may have access to a single object's data.
 * We need a lock for access.
 */

package com.minte9.threads.syncronized;

public class Concurrancy implements Runnable {

    private BankAccount account = new BankAccount();
    
    public static void main(String[] args) {
    
        Concurrancy runner = new Concurrancy();
        
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);

        alpha.setName("Alpha");
        beta.setName("Beta");

        alpha.start();
        beta.start();

        /* 
            Account balance: 20
            Account balance: 20
            Beta is going to sleep
            Alpha is going to sleep
            Beta withdraw 10
            Alpha withdraw 10
            Account balance: 0
            Account balance: 0

            OR

            Account balance: 20
            Alpha is going to sleep
            Account balance: 20
            Beta is going to sleep
            Alpha withdraw 10
            Account balance: 0
            Beta withdraw 10
            Account balance: 0
        */
    }
    
    @Override public void run() {

        for (int i=0; i<2; i++) {
            
            System.out.println(
                "Account balance: " + account.getBalance()
            );            
            makeWithdraw(10);
        }
    }
    
    private void makeWithdraw(int amount) {

        if (account.getBalance() >= amount) { 

            try {
                System.out.println(
                    Thread.currentThread().getName() + 
                        " is going to sleep"
                );
                Thread.sleep(500); // sleep for account lock

            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            }
            
            account.withdraw(amount);
        }
    }
}

class BankAccount {
    private int balance = 20;
    
    public int getBalance() { // current account balance
        return balance;
    }
    
    public void withdraw(int amount) { // withdraw from account
        balance = balance - amount;
        System.out.println(
            Thread.currentThread().getName() + " withdraw 10"
        );
    }
}


