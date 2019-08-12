import java.util.*;
import java.util.Scanner;

import java.io.*;

public class menu {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);

		System.out.println(
				" ###################\n#                   #\n# World War of Ants #\n#                   # \n ###################  \n ");

		System.out.println(" _________\n 1) Start \n _________\n 2) Load\n _________\n 3) Exit \n _________\n\n");
		int text;
		//
		try {
			text = Integer.parseInt(keyboard.next());
		} catch (NumberFormatException e) {
			System.out.println("invalid input");
		} finally {
			text = 0;
		}
		switch (text) {

		case 1:
			System.out.println("Game is loading...");
			break;
		case 2:
			System.out.println("Which state do you want to load?");
			break;
		case 3:
			System.out.println("Which state do you want to load?");
			break;

		default:
			System.out.println("Wrong input!");

		} // end of switch

	} // end of static void main

} // end of wwa
