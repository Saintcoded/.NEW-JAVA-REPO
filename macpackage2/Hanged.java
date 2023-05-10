package macpackage2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hanged {

	String[] countries = { "mauritania", "nigeria", "malaysia", "israel", "iran", "brazil", "france", "england",
			"canada", "germany", "turkey" };

	String country, dashes, missedLetters = "";

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Hanged hg = new Hanged();

		for (int i = 0; i < 5; i++) {
			hg.generateCountry();
			hg.generateDashes();
			hg.processInput();
		}
	}

	String generateCountry() {
		int index = new Random().nextInt(countries.length);
		country = countries[index];
		return country;
	}

	String generateDashes() {
		dashes = "";
		for (int j = 0; j < country.length(); j++) {
			dashes += "-";
		}
		return dashes;
	}

	void processInput() {
		System.out.println(dashes);
		while (!country.equals(dashes)) {

			System.out.println(">>");
			char input = sc.nextLine().charAt(0); // come back to this

			String dash = "";

			if (country.contains(String.valueOf(input))) {
				for (int i = 0; i < country.length(); i++) {
					if (input == country.charAt(i))
						dash += input;
					else
						dash += dashes.charAt(i);
				}

				dashes = dash;
				System.out.println(dashes);
			} else {
				if (missedLetters.contains(String.valueOf(input)))
					continue;
				missedLetters += input;
			}
		}

		char[] wrongLetters = missedLetters.toCharArray();
		System.out.println("Wrong letters: " + Arrays.toString(wrongLetters));
	}
}
