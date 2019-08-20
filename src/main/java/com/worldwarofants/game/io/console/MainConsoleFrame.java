package com.worldwarofants.game.io.console;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * A class that acts as the frame of the user console
 */
public class MainConsoleFrame extends JFrame {
    private int rows, columns;
    private MainConsolePanel console;
    public MainConsoleFrame() {
        super("World War Ants");

        //Default values
        rows = 150;
        columns = 150;
        console = new MainConsolePanel(rows,columns);

        setSize(rows,columns);
        setContentPane(console);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentListener(
                new ComponentListener() {
                    public void componentMoved(ComponentEvent componentEvent) {}
                    @Override
                    public void componentResized(ComponentEvent componentEvent) {
                        //Adjusts row/col variables on resize, refreshes console
                        Dimension frameDimension = componentEvent.getComponent().getSize();
                        rows = frameDimension.height;
                        columns = frameDimension.width;
                        //TODO: Deal with console
                    }
                    public void componentHidden(ComponentEvent componentEvent) {}
                    public void componentShown(ComponentEvent componentEvent) {}
                }
        );

        setVisible(true);
    }

    /**
     * A method that refreshes the console
     * Called in tick()
     */
    public void refreshConsole() {

    }

}