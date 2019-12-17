package org.drools.examples.backwardchaining;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    public static JLabel lMessage;
    JButton yButton,nButton;
    public static String message;

    public GUI(){
        setTitle("System diagnostyczny");
        setSize(400, 400);
        setLayout(null);

        lMessage = new JLabel("test");
        lMessage.setBounds(10,10,380,20);
        add(lMessage);




    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
