// Special thanks to Bro Code for helping me relearn Java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * logical operators = used to connect two or more expressions
		 * 
		 * && = (AND) both conditions must be true
		 * || = (OR) either condition must be true
		 * ! = (NOT) reverses boolean value of condition
		 */

		int temp = 25;
		
		if(temp > 30) {
			System.out.println("It is hot outside");
		} else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm outside");
		} else {
			System.out.println("It's cold outside");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = in.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You are still playing the game *pew pew*");
		}
		
//		if(!response.equals("q") || !response.equals("Q")) {
//			System.out.println("You are still playing the game *pew pew*");
//		} else {
//			System.out.println("You quit the game");
//		}
		in.close();
		
		

	}

}
