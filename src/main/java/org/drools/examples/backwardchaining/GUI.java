package org.drools.examples.backwardchaining;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class GUI extends JFrame implements ActionListener {

    public static JLabel lMessage;
    public static JButton yButton,nButton;
    public static String message="";
    public static JTextArea lAnswer;
    public static String selectedIssue="";
    public static JComboBox lComboBox;

    String[] issues = {"Zasilanie","Obraz","Dźwięk","Aplikacja"};
    //Scanner scanner = new Scanner(System.in);

    public GUI(){
        setTitle("System diagnostyczny");
        setSize(500, 300);
        setLayout(null);

        lMessage = new JLabel();
        lMessage.setBounds(10,10,480,60);
        add(lMessage);

        yButton = new JButton("Tak");
        yButton.setBounds(10,60,70,20);
        add(yButton);

        nButton = new JButton("Nie");
        nButton.setBounds(420,60,70,20);
        add(nButton);

        lAnswer = new JTextArea();
        lAnswer.setBounds(10,100,480,80);
        add(lAnswer);

        lComboBox = new JComboBox(issues);
        lComboBox.setEditable(true);
        lComboBox.setBounds(10,200,480,40);
        add(lComboBox);

        lComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == ItemEvent.SELECTED){
                    selectedIssue = lComboBox.getSelectedItem().toString();
                    System.out.println(selectedIssue);
                }
            }
        });



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
