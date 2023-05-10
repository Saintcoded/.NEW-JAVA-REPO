package macpackage2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangmaned {
	String[] countries = { "Muritania", "Nigeria", "Malaysia", "Iseral", "Iran", "France", "England", "Argentina",
			"Barcelona", "Ireland", "America", "Austrailia", "Japan", "United Kingdom" };

	String country, dashes, missedletters = "";

	Scanner scan = new Scanner(System.in);

	String generateDashes() {
		dashes = "";
		for (int i = 0; i < country.length(); i++) {
			dashes += "-";
		}
		return dashes;
	}

	String generatecountries() {
		int index = new Random().nextInt(countries.length);
		country = countries[13].toUpperCase();
		return country;
	}

	void processes() {
		System.out.println(country);
		System.out.println(dashes);
		if (country.contains(" ")) {
			for (int o = 0; o < country.length(); o++) {
				if (country.charAt(o)==" ".charAt(0)) {
					country.replace(" ","");
				}	
			}	
		}
		while (!country.equals(dashes)) {
			System.out.println(">> ");
			char input = scan.nextLine().toUpperCase().charAt(0);

			String dash = "";

			if (country.contains(String.valueOf(input))) {
				for (int o = 0; o < country.length(); o++) {
					if (input == country.charAt(o)) {
						dash += input;

					} else {
						dash += dashes.charAt(o);
					}
				}
				dashes = dash;
				System.out.println(dashes);

			} else {
				if (missedletters.contains(String.valueOf(input)))
					continue;
				missedletters += input;

			}

		}
		char[] wrongletters = missedletters.toCharArray();
		System.out.println("Wrong Letter: " + Arrays.toString(wrongletters));
	}

	public static void main(String[] args) {
		Hangmaned call = new Hangmaned();
		for (int l = 0; l < 5; l++) {
			call.generatecountries();
			call.generateDashes();
			call.processes();

		}

	}

}
