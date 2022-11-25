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

                System.out.println("i=" + i + " / j=" + j);
                
                if (numbers[i][j] == 4) {
                    System.out.println("Break from B \n");
                    break B;
                }

                if (numbers[i][j] == 7) {
                    System.out.println("Break from A");
                    break A;
                }


            }    
        }
    }
}

/**
i=0 / j=0
i=0 / j=1
i=0 / j=2
i=1 / j=0
Break from B 

i=2 / j=0
Break from A
*/