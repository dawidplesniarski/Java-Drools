package org.drools.examples.backwardchaining;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame implements ActionListener {

    public static JLabel lMessage;
    public static JButton yButton,nButton;
    public static String message="";
    public static JTextArea lAnswer;

    //Scanner scanner = new Scanner(System.in);

    public GUI(){
        setTitle("System diagnostyczny");
        setSize(400, 400);
        setLayout(null);

        lMessage = new JLabel();
        lMessage.setBounds(10,10,380,60);
        add(lMessage);

        yButton = new JButton("Tak");
        yButton.setBounds(10,60,70,20);
        add(yButton);

        nButton = new JButton("Nie");
        nButton.setBounds(320,60,70,20);
        add(nButton);

        lAnswer = new JTextArea();
        lAnswer.setBounds(10,100,380,80);
        add(lAnswer);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
