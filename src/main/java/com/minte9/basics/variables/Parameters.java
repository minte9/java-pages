/**
 * The variables passed as method's parameters ...
 * has to match the type
 */

package com.minte9.basics.variables;

public class Parameters {
    public static void main(String[] args) {
    
        Math math = new Math();

        int sum = math.sum(1,2);
        System.out.println(sum); // 3

        //int sum2 = math.sum(3, "1"); // compile error
    }
}

class Math {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}