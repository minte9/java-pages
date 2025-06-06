/**
 * Instead of passing an object we are passing a block of code.
 * 
 * We pass a function without a name. 
 * Javac is inferring the type of event from its context.
 */

package com.minte9.lambdas.expressions;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Behavior {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        button.addActionListener(
            event -> System.out.println("Button clicked") // Look Here
        );
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.getContentPane().add(button); 
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}