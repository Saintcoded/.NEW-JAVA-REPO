package macpackage;

import java.util.Arrays;
import java.util.Scanner;

public class Attendant {
	int k;// Threshold
	int n;// number of student
	int t;// input
	int p;
	int count;
	int tryal=0;

	void meet(String times, String time) {

		Scanner scan = new Scanner(System.in);
		
			System.out.print("HOW MANY TEST CASES? ");
			t = scan.nextInt();
			
		for (int i = 0; i != t; i++) {
			n = Integer.parseInt(times.split(" ")[0]);
			k = Integer.parseInt(times.split(" ")[1]);

			String br[] = time.split(" ");
			System.out.println(Arrays.toString(br));

			int go = 0;
			while (go <= br.length) {
				p = Integer.parseInt(br[go]);

				if (p <= 0)
					count++;

				go++;

				if (go == br.length)
					break;
			}
			if (n != br.length || k > br.length)
				System.err.println("STUDENTS && ATTENDEE'S NUMBER NOT CORESPONDING");
			else
				System.out.println(count >= k ? "THE CLASS WILL HOLD" : "THE CLASS HAS BEEN CANCELLED");

		}
	}

	public static void main(String[] args) {
		Attendant call = new Attendant();
		call.meet("5 2", "-2 0 5 4 8");
//		call.meet("5 3", "1");

	}

}
