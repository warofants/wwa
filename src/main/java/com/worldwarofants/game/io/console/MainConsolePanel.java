package com.worldwarofants.game.io.console;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MainConsolePanel extends JPanel {
    private JLabel header;
    private JTextArea gameText;
    private JTextField userInputField;
    MainConsolePanel(int rows, int columns) {
        super(new BorderLayout());

        gameText = new JTextArea();
        gameText.setRows(rows);
        gameText.setColumns(columns);
        gameText.setEditable(false);

        userInputField = new JTextField();
        userInputField.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Do Something
                    }
                }
        );

        header = new JLabel("Header");

        add(header,BorderLayout.PAGE_START);
        add(gameText,BorderLayout.CENTER);
        add(userInputField,BorderLayout.PAGE_END);
    }
    void adjustSize(int rows, int columns) {
        gameText.setRows(rows);
        gameText.setColumns(columns);
    }
}