
import gui.TextMenu;

public class wwa {

    public static void main(String[] args) {
        TextMenu menu = new TextMenu();
        menu.addOption("New Game");
        menu.addOption("About");
        menu.addOption("Help");
        menu.addOption("Exit");
        
        System.out.println("World War of Ants");
        System.out.println();
        System.out.println("Main Menu");
        //I KNOW THIS IS NOT GOOD BUT IDK HOW ELSE TO DO IT!
        int selection = menu.display();
        switch(selection) {
            case 1:
                //New game
                break;
            case 2:
                //About
                break;
            case 3:
                //Helo
                break;
            case 4:
                //Exit
                System.exit(0);
                break;
        }
    }
}
