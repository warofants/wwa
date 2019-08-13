package world.war.ants;

import world.war.ants.gui.TextMenu;

//Testing
public class WorldWarAnts {
    public static void main(String[] args) {
        final String NEW_GAME = "New Game";
        final String ABOUT = "About";
        final String HELP = "Help";
        final String EXIT = "Exit";
        TextMenu menu = new TextMenu();
        menu.addOption(NEW_GAME);
        menu.addOption(ABOUT);
        menu.addOption(HELP);
        menu.addOption(EXIT);
        
        System.out.println("World War of Ants");
        System.out.println();
        System.out.println("Main Menu");
        //I KNOW THIS IS NOT GOOD BUT IDK HOW ELSE TO DO IT!
        int selection = menu.display();
        switch(menu.getOption(selection)) {
            case NEW_GAME:
                //New game
                break;
            case ABOUT:
                //About
                break;
            case HELP:
                //Helo
                break;
            case EXIT:
                //Exit
                System.exit(0);
                break;
        }
    }
}
