package com.worldwarofants.game.io.console;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

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
                    public void componentResized(ComponentEvent componentEvent) {
                        Dimension frameDimension = componentEvent.getComponent().getSize();
                        rows = frameDimension.height;
                        columns = frameDimension.width;
                    }
                    public void componentHidden(ComponentEvent componentEvent) {}
                    public void componentShown(ComponentEvent componentEvent) {}
                }
        );

        setVisible(true);
    }
    public void refreshConsole() {
        console.adjustSize(rows,columns);
    }

}