package lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args){
        JFrame frame= new JFrame("My Window");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        //create button and add jframe

        JButton button = new JButton("Click me !!");


//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Click");
//                JOptionPane.showMessageDialog(null,"Hey,Button click");
//            }
//        });

//        or

        button.addActionListener((ActionEvent e) ->{
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null,"Hey, Button click");
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
