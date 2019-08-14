import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Class that acts as the main pane of the user console. Responsible
 * for gathering user input and displaying the game map
 * @version 1.1
 */
class MainConsolePanel extends JPanel {
    private JLabel header;//Most likely, will display resources + stats
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
                /* Adds an action listener that detects user input and
                 * passes it to BIOS */
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        BIOS.passInput(userInputField.getText());
                    }
                }
        );

        header = new JLabel("Header");

        add(header,BorderLayout.PAGE_START);
        add(gameText,BorderLayout.CENTER);
        add(userInputField,BorderLayout.PAGE_END);
    }

    /**
     * Method that adjusts the scale of output after console is resized
     * @param rows
     * @param columns
     */
    void adjustSize(int rows, int columns) {
        gameText.setRows(rows);
        gameText.setColumns(columns);
    }
}