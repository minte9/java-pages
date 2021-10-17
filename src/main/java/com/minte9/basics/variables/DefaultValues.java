/**
 * Class instance variables always have ...
 * a default value based on type.
 * 
 * Local variables (declared within a method) ...
 * must be initialized before use.
 */
package com.minte9.basics.variables;

class DefaultValues {
    public static void main(String[] args) {

        Values obj = new Values();  
        obj.showValues();
    }
}

class Values {
    
    int a;
    float b;
    boolean c;
    Values v;

    public void showValues() {
        System.out.println(a); // 0
        System.out.println(b); // 0.0
        System.out.println(c); // false
        System.out.println(v); // null

        //int x; //local variable not initialized (not 0)
    }
}
