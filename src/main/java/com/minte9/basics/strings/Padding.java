/**
 * To pad a string use String.format()
 * 
 * "%ns" to pad LEFT
 * "%-ns" to pad RIGHT
 */
package com.minte9.basics.strings;

public class Padding {
    public static void main(String[] args) {
        
        // a...123 (L)
        System.out.println(
            "a" + String.format("%6s", "123")
        );
            
        // 123...z (R)
        System.out.println(
            String.format("%-6s", "123") + "z"  
        ); 

        // 000123 (L)
        System.out.println(
            String.format("%6s", "123").replace(" ", "0")
        ); 

        // 123000 (R)
        System.out.println(
            String.format("%-6s", "123").replace(" ", "0")
        );
    }
}
