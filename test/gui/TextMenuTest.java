/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author zyunl
 */
public class TextMenuTest {

    public static void main(String[] args) {
        TextMenu menu = new TextMenu();
        menu.addOption("Test 1");
        menu.addOption("Test 2");
        menu.addOption("Test 3");
        menu.addOption("Test 4");

        menu.display();
    }
}
