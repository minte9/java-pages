/**
 * Anonymous inner classes make it easier to pass around code as data.
 * 
 * Example: 
 * Using an anonymous inner class to associate behavior with a button click.
 * 
 * There are four lines of boilerplate code in order to call ...
 * one line of important logic.
 */

package com.minte9.lambdas.lambdas_expressions;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonimous {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        button.addActionListener(
            new ActionListener() { // Look Here
                @Override 
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked");
                }
            }
        );
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frame.getContentPane().add(button); 
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}