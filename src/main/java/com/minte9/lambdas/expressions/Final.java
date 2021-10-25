/**
 * To use a variable from outside an anonymous inner class the variable ...
 * must be final (or effective final).
 * 
 * The Holder variable is effective final,
 * even if the final keyword it is not required (Java 8)
 */

package com.minte9.lambdas.expressions;
import java.util.Arrays;
import javax.xml.ws.Holder;

public class Final {
    public static void main(String[] args) {

        Holder<Integer> holder = new Holder<>(0);
        Arrays.asList("a", "b", "c").forEach((x) -> {
            holder.value ++;
        });
        System.out.println(holder.value); 
            // 3
        
        final String str = "A";
        Arrays.asList("a", "b", "c").forEach((x) -> {
            // str = str + x; 
            // Error: final local variable cannot be assigned
        }); 
        System.out.println(str);
            // A
    }
}