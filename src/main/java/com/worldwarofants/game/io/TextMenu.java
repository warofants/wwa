package com.worldwarofants.game.io;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class TextMenu {

    private ArrayList<String> items;

    public TextMenu() {
        items = new ArrayList<>();
    }

    /**
     * Adds an option to the menu
     * @param string the text you want
     */
    public void addOption(String string) {
        items.add(string);
    }

    /**
     * Displays the menu and gets the option.
     * @return index of the thing the user selected, whatever the user typed in. If you want the index, subtract 1.
     */
    public int display() {
        int code = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + " - " + items.get(i));
            }
            try {
                code = scanner.nextInt();
            } catch (Exception e) {
                //Clear scanner
                scanner.nextLine();
            }
        } while (code <= 0 || code > items.size());
        return code;
    }
    
    /**
     * In case you forgot what each option does...
     * @param id the id of the option. 
     * @return 
     */
    public String getOption(int id) {
        return items.get(id);
    }
}
