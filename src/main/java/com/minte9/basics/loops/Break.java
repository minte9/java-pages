/**
 * Break statement, to exit from a loop
 * For multiple loops use labels 
 */

package com.minte9.basics.loops;

public class Break {            
    public static void main(String[] args) {
        
        int[][] numbers = { 
            {1,2,8}, 
            {4,5,6}, 
            {7,8,9},
        };

        A: for (int i=0; i<numbers.length; i++) {
            B: for (int j=0; j<numbers[i].length; j++) {

                System.out.print(i + ":" + j + " ");
                
                if (numbers[i][j] == 4) {
                    System.out.println("Break from B");
                    break B;
                }

                if (numbers[i][j] == 7) {
                    System.out.println("Break from A");
                    break A;
                }
                
                // 0:0 0:1 0:2 1:0 Break from B 
                // 2:0 Break from A
            }    
        }
    }
}