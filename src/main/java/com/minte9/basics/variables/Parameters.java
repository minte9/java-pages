/**
 * The variables passed as method's parameters has to match the type.
 * For example, if we pass a string as math.sum() param we get compile error.
 */

package com.minte9.basics.variables;

public class Parameters {
    public static void main(String[] args) {
    
        Math math = new Math();
        int sum = math.sum(1,2); 
               // math.sum(1, "2"); // compile error

        System.out.println(
            "Sum(1,2) = " + sum
        );
    }
}

class Math {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}

// Output: Sum(1,2) = 3