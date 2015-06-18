package in.codekamp.wrestlingrepeat;

import java.util.*;

public class Game {

	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		
		
		while (choice != 7) {
			System.out.println("On what attribute you want to play?");
			System.out.println("1. Rank");
			System.out.println("2. Height");
			System.out.println("3. Weight");
			System.out.println("4. Matches Won");
			System.out.println("5. Matches Lost");
			System.out.println("6. Total Matches");
			System.out.println("7. I don't want to play");

			if (userInput.hasNextInt()) {
				choice = userInput.nextInt();
			}

			switch (choice) {
			case 1:
				System.out.println("User wants to play on Rank");
				break;
			case 2:
				System.out.println("User wants to play on Height");
				break;
			case 3:
				System.out.println("User wants to play on Matches Weight");
				break;
			case 4:
				System.out.println("User wants to play on Matches Won");
				break;
			case 5:
				System.out.println("User wants to play on Matches Lost");
				break;
			case 6:
				System.out.println("User wants to play on Total Matches");
				break;
			default:
				System.out.println("invalid input");
				break;

			}
		}
		
		Wrestler wrestler1 = new Wrestler("undertaker", 2, 6.5, 80.9, 20, 2);
		wrestler1.display();
	}

}
