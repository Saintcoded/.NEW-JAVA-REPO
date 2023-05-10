package macpackage2;

import java.util.Arrays;

public class Twice {
	String[] Word;
	String next;
//	boolean print;

	void repeat(String Input) {

		String[] Words = Input.split(" ");
		System.out.println(Arrays.toString(Words));

		for (int i = 0; i < Words.length; i++) {
			next = Words[i];

			for (int l = 0; l < Word.length; l++) {

				if (next.equalsIgnoreCase(Word[l])) {
					
				}
			}
		}

	}
	public static void main(String[] args) {
		Twice call = new Twice();
		call.repeat("i lOve LoVe you Love");
	}

}
