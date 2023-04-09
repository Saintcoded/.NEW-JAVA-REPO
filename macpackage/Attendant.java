package macpackage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Attendant {
	int k;
	int n;
	int t;
	String move;

	int count;

	void meet(String times, String time) {

		Scanner scan = new Scanner(System.in);

		System.out.print("HOW MANY TEST CASES? ");
		t = scan.nextInt();
		for (int i = 0; i != t; i++) {
			String[] kk = times.split(" ");
			n = Integer.parseInt(kk[0]);
			String br[] = time.split(" ");
			k = Integer.parseInt(br[0]);
			System.out.println(k);

//			String input[] = new String[] { times + "" };
//			System.out.println(Arrays.toString(input));

			for (int p = 0; p <= times.length(); p++) {

//				if (br[p] <= 0)
//					count++;

			}
			System.out.println(count);

			if (count >= times.toString().charAt(1))
				move = "CLASS WILL HOLD";
			else if (count <= times.toString().charAt(1))
				move = "CLASS CANCELLED";
			System.out.println(move.toString());
		}

	}

	public static void main(String[] args) {
		Attendant call = new Attendant();
		call.meet("5 4", "-2 0 9 4 8");


	}

}
