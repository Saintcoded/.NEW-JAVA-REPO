package macpackages;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Attendant {
	int k;// treshold
	int n;// number of student
	int t;// input
	int p;
	int count;

	void meet(String times, String time) {

		Scanner scan = new Scanner(System.in);

		System.out.print("HOW MANY TEST CASES? ");
		t = scan.nextInt();

		for (int i = 0; i != t; i++) {
			n = Integer.parseInt(times.split(" ")[0]);
			k = Integer.parseInt(times.split(" ")[1]);

			String br[] = time.split(" ");

			for (int l = 0; l >= br.length; l++)
				p = Integer.parseInt(br[l]);

			if (n == br.length && k < br.length)
				for (int m = 0; m >= p; m++) {
					System.out.println(p);
					if (p <= 0)
						count++;
				}
			else
				System.err.println("STUDENTS && ATTENDEE'S NUMBER NOT CORESPONDING");
			break;

		}
		System.out.println(count >= k ? "THE CLASS WILL HOLD" : "THE CLASS HAS BEEN CANCELLED");

	}

	public static void main(String[] args) {
		Attendant call = new Attendant();
		call.meet("6 2", "-2 0 9 4 5 9");
//		call.meet("5 3", "1");

	}
}