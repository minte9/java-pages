/**
 * To exit a for loop use break statement.
 * 
 * For multiple loops use labels 
 */

package com.minte9.basics.loops;

public class Break {            
    public static void main(String[] args) {
        
        int[][] numbers = { 
            {1,2,8}, 
            {4,5,6}, 
            {7,8,9} 
        };

        a: for (int i=0; i<numbers.length; i++) {
            b: for (int j=0; j<numbers[i].length; j++) {

                System.out.println("i=" + i + " / j=" + j);
                
                if (numbers[i][j] == 4) {
                    System.out.println("Found 4 at " + i + ":" + j);
                    System.out.println("Break from b loop");
                    break b;
                }

                if (numbers[i][j] == 7) {
                    System.out.println("Found 7 at " + i + ":" + j);
                    System.out.println("Break from a loop");
                    break a;
                }
            }    
        }
    }
}

/*
    i=0 / j=0
    i=0 / j=1
    i=0 / j=2
    i=1 / j=0
    Found 4 at 1:0
    Break from b loop
    i=2 / j=0
    Found 7 at 2:0
    Break from a loop
*/