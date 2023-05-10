package macpackage2;

import java.util.Scanner;
import java.util.Random;

public class Gaming {
	static String user;

	void Promtname() {
		System.out.print("WHAT IS YOUR NAME: ");
		Scanner sc = new Scanner(System.in);
		this.user = sc.nextLine().toUpperCase();
		this.user = user;
		System.out.println("Hi " + user);
	}

	void Playing() {
		int marks[] = new int[] { 48, 2, 66, 78, 44, 12 };
		int valid;
		boolean done = false;
		Random shuffle = new Random();
		Scanner sc = new Scanner(System.in);
		for (int l = 3; l > -1; l--) {
			System.out.print("Would you like to play my game? ");
			String option = sc.next();

			if (option.equalsIgnoreCase("yes")) {
				int pick =  shuffle.nextInt(50); 
				System.out.println("LUCKY NUMBER IS: " + pick);
				System.out.println("Welcome to Guessorous " + user+ "\n");
				int count = 0;

				for (int y = 0; count < 5; y++) {
//					valid = marks[y];
					System.out.print("Your Guessed number is: ");
					int choose = sc.nextInt();//valid
					if (choose == pick) {
						done = true;
						break;

					} else if (choose > pick) {
						done = false;
						System.out.println("Guess a lower number!\n");
						count++;

					} else if (choose < pick) {
						done = false;
						System.out.println("Guess a higher number!\n ");
						count++;
					}
				}
				if (done == true) {
					System.out.println("you have chossen the corect number");
					break;
				} else {
					System.out.println("Game over");
					break;
				}
			}

			else if (option.equalsIgnoreCase("no")) {
				System.out.println("Good bye " + user);
				break;

			} else {
				System.out.println("Invalid input");
				System.out.println("YOU HAVE " + l + " MORE TRIES");
				if (l > -1) {
					System.out.println("DEAR " + user + "YOU ARE OUT OF TRIES");
				}
			}
		}

//		}
	}

	public static void main(String[] args) {
		Gaming use = new Gaming();
		use.Promtname();// players name

		use.Playing();

	}

}
