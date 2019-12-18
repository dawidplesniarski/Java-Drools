package org.drools.examples.backwardchaining;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GUI extends JFrame implements ActionListener {

    public static JLabel lMessage;
    public static JButton yButton,nButton;
    public static String message="";

    Scanner scanner = new Scanner(System.in);

    public GUI(){
        setTitle("System diagnostyczny");
        setSize(400, 400);
        setLayout(null);

        lMessage = new JLabel("test");
        lMessage.setBounds(10,10,380,20);
        add(lMessage);

        yButton = new JButton("Tak");
        yButton.setBounds(10,40,50,20);
        add(yButton);

        nButton = new JButton("Nie");
        nButton.setBounds(340,40,50,20);
        add(nButton);

//        yButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                message = "t";
//                System.out.println("t");
//            }
//        });
//        nButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                message = "n";
//                System.out.println("n");
//            }
//        });



    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
