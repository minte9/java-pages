/**
 * Class instance variables always have default value
 * Local variables must be initialized before use
 */
package com.minte9.basics.variables;

public class DefaultValues {
    public static void main(String[] args) {

        Values obj = new Values();  
        obj.showValues();
    }
}

class Values {
    
    int a; // default value 0
    float b;
    boolean c;
    Values v;

    public void showValues() {
        System.out.println(a); // 0
        System.out.println(b); // 0.0
        System.out.println(c); // false
        System.out.println(v); // null

        String a = "a"; // local variable, no default value
        System.out.println(a); // a
    }
}
