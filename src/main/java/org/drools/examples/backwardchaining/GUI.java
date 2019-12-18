package org.drools.examples.backwardchaining;

import org.kie.api.runtime.KieSession;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.Console;
import java.util.Scanner;


public class GUI extends JFrame implements ActionListener {

    public static JLabel lMessage;
    public static JButton yButton,nButton;
    public static String message="";
    public static JLabel LAnswer;

    //Scanner scanner = new Scanner(System.in);

    public GUI(){
        setTitle("System diagnostyczny");
        setSize(400, 400);
        setLayout(null);

        lMessage = new JLabel("test");
        lMessage.setBounds(10,10,380,20);
        add(lMessage);

        yButton = new JButton("Tak");
        yButton.setBounds(10,40,70,20);
        add(yButton);

        nButton = new JButton("Nie");
        nButton.setBounds(320,40,70,20);
        add(nButton);

        LAnswer = new JLabel("rozwiązanie");
        LAnswer.setBounds(10,100,380,30);
        add(LAnswer);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
