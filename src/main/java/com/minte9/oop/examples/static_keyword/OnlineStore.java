package com.minte9.oop.examples.static_keyword;

public class OnlineStore {
    public static void main(String[] args) {
        double total = PriceCalculator.finalPrice(100);
        System.out.println(total);  // 110.0
    }

    // 1. Static variable - shared by the whole store
    static double TAX_RATE = 0.10;

    // 2. Static inner class - a helper that belongs to the store
    static class PriceCalculator {

        // 3. Static method - a shared rule for calculation
        static double finalPrice(double price) {
            return price + (price * TAX_RATE); 
        }
    }
}
