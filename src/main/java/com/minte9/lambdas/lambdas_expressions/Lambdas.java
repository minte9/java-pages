/**
 * There are different ways of writing lambda expressions.
 * 
 * Lambda expression with no arguments.
 * Lambda expression in a full block.
 * Lambda expression with more arguments.
 * 
 * Method parameters require less boilerplate but still ...
 * they are still statically typed!
 *  
 */

package com.minte9.lambdas.lambdas_expressions;
import java.util.function.BinaryOperator;

public class Lambdas {
    public static void main(String[] args) {

        Runnable noArgs = () -> System.out.println("Hello World");
        new Thread(noArgs).run(); 
            // Hello World

        Runnable multiStatement = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };
        new Thread(multiStatement).run(); 
            // Hello 
            // World

        BinaryOperator<Integer> op = (x, y) -> x + y;
        System.out.println(op.apply(2, 3)); 
            // 5
    }
}