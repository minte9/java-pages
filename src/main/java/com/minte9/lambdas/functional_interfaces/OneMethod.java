package com.minte9.lambdas.functional_interfaces;
import javax.swing.JButton;
import javax.swing.JFrame;
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/

public class OneMethod {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        /*
        button.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Button clicked");
                }
            }
        );
        */

        button.addActionListener(event -> { // Look Here
             System.out.println("Button clicked");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

/*
abstract interface ActionListener extends EventListener {
 
    public abstract void actionPerformed(ActionEvent arg0); 
}
*/