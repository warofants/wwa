package com.worldwarofants.game.io.console;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * A class that acts as the content pane for
 * MainConsoleFrame and displays the game state to the user
 */
class MainConsolePanel extends JPanel {
    private JLabel header;
    private JTextPane gameText;
    private JTextField userInputField;

    MainConsolePanel(int rows, int columns) {
        super(new BorderLayout());

        //TODO: Set gameText line wrap to max col len
        gameText = new JTextPane();
        gameText.setBackground(Color.BLACK);
        gameText.setForeground(Color.GREEN);
        gameText.setEditable(false);

        userInputField = new JTextField();
        userInputField.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Handles user input
                        //TODO: Implement when input handler created
                        gameText.setText(userInputField.getText());
                    }
                }
        );

        header = new JLabel(getHeaderText());

        add(header, BorderLayout.PAGE_START);
        add(gameText, BorderLayout.CENTER);
        add(userInputField, BorderLayout.PAGE_END);
    }
    String getHeaderText() {
        //TODO: Grab these values via getter
        String headerText = String.format(
                "Prestige: %d, Resources: %d",
                null,null
        );
        return headerText;
    }
}