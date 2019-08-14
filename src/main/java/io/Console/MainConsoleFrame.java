import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
/**
 * Class that forms the frame of the user console
 * @version 1.1
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

        /* Adds a listener that detects when user resizes the console
         * window. Adjusts size of console, and then refreshes all
         * console components */
        addComponentListener(
                new ComponentListener() {
                    public void componentMoved(ComponentEvent componentEvent) {}
                    public void componentResized(ComponentEvent componentEvent) {
                        Dimension frameDimension = componentEvent.getComponent().getSize();
                        rows = frameDimension.height;
                        columns = frameDimension.width;
                        console.adjustSize(rows,columns);
                        refresh();
                    }
                    public void componentHidden(ComponentEvent componentEvent) {}
                    public void componentShown(ComponentEvent componentEvent) {}
                }
        );

        setVisible(true);
    }

    /**
     * Method that updates console components when called
     */
    public void refresh() {
        //Call each tick()
    }

}