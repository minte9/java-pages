/**
 * If you do not use a package statement ...
 * your type (your class) goes in an unnamed package.
 * 
 * Java compiler automaticaly imports three packages:
 * 
 * (1) the package with no name
 * (2) the java.lang package
 * (3) the current package
 */

package com.minte9.oop.packages;

import java.util.ArrayList;

public class Import {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(list); // [1, 2]
    }
}
