package macpackage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Countries {
	String countri[];
	int index;
	String co;
	Random obj;
	String Dashes;
	String Letter;
	int len;

	public Countries() {
		obj = new Random();
		countri = new String[] { "Nigeria", "Ghana", "mexico", "japan", "America" };
	}

	void getcountri() {
		index = obj.nextInt(countri.length);
		co = countri[index].toUpperCase();
		System.out.println(co + " at index " + index);
	}

	void GenerateDashes() {
		getcountri();
		len = co.length();
		Dashes = "";
		for (int i = 0; i <= len; i++)
			Dashes += "-";
		System.out.println(Dashes);

	}

	void check() {
		for (int l = 0; l <= 4; l++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("ACCEPT INPUT:");
			Letter = String.valueOf(scan.nextLine().charAt(0)).toUpperCase();

			for (int i = 0; i <= len - 1; i++)
				if (String.valueOf(co.charAt(i)).equalsIgnoreCase(Letter))
					System.out.print(Letter);
				else
					System.out.print("-");
			System.out.println();

		}
	}

	void calling() {
		System.out.println(Arrays.toString(countri));
	}

	public static void main(String[] args) {
		Countries call = new Countries();
		call.calling();
		call.GenerateDashes();
		call.check();
	}

}
