package DesktopApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyWindow {
    public static void main(String[] args) {

        //window: object Jframe
        JFrame frame = new JFrame("MY Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        //create button and add jframe

        JButton button = new JButton("Click me !! ");
        frame.add(button);

/*

    button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Click");
                JOptionPane.showMessageDialog(null,"Entered");
            }
        });

 */

        button.addActionListener((ActionEvent e) -> {  // we can also remove Action event (type of e)
            System.out.println("Button clicked");
            JOptionPane.showMessageDialog(null,"Entered");
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        // Action listener

    }
}
