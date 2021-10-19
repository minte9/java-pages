/**
 * To pad a string use String.format()
 * 
 * "%ns" to pad LEFT
 * "%-ns" to pad RIGHT
 */
package com.minte9.basics.strings;

public class Padding {
    public static void main(String[] args) {
        
        // a...123
        System.out.println(
            "a" + String.format("%6s", "123") // LEFT
        );
            
        // 123...z
        System.out.println(
            String.format("%-6s", "123") + "z" // RIGHT
        ); 

        // 000123
        System.out.println(
            String.format("%6s", "123").replace(" ", "0") // LEFT
        ); 

        // 123000
        System.out.println(
            String.format("%-6s", "123").replace(" ", "0") // RIGHT
        );
    }
}
