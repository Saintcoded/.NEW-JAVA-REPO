package macpackage2;

import java.util.Arrays;

public class Shuffle {
	static int[] arr = { 1, 2, 3, 4, 5, 8, 9, 3, 4 ,6};

	Shuffle(int a, int[] shuf) {
		System.out.println(Arrays.toString(shuf));
		for (int i = a; i < arr.length + a; i++) {
			if (a > arr.length) {
				System.err.println("OUT OF RANGE");
				break;
			} else {
				System.out.print(arr[i % arr.length] + " ");

			}
		}
	}

	public static void main(String[] args) {
		Shuffle call = new Shuffle(1, arr);
	}

}
