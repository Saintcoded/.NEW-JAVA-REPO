package macpackage2;

import java.util.Scanner;

public class Curency {

	Curency() {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		String US = "$";
		String India = "#";
		String China = "%";
		String France = "!";
		System.out.print("CREDIT ME: ");
		double credit = scan.nextDouble();

		for (int i = 0; i <= 3; i++) {
			System.out.println("WHICH CONTRY ARE YOU FROM ? ");
			String comp = sc.next();
			if (comp.equalsIgnoreCase("UNITED STATES")) {
				System.out.println("US: " + US + credit);
				break;
			}
			if (comp.equalsIgnoreCase("INDIA")) {
				System.out.println("India: " + India + credit);
				break;
			}
			if (comp.equalsIgnoreCase("FRANCE")) {
				System.out.println("France: " + France + credit);
				break;
			}
			if (comp.equalsIgnoreCase("CHINA")) {
				System.out.println("China: " + China + credit);
				break;
			} else
				System.out.println("TRY AGAIN!");
		}

	}

	public static void main(String[] args) {
		Curency call = new Curency();
	}

}
