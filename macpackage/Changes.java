package macpackage;

import java.util.Scanner;

public class Changes {
	void accept() {
		Scanner scan = new Scanner(System.in);
		String input;
		String inp=null;
		String done;

		System.out.println("KEY WORDS-- U-L-R-C-Z -- \n");
		System.out.print("INPUT A SENTENCE: ");
		input = scan.nextLine();
		

		System.out.print("INPUT KEY WORD: ");
		done = scan.next().toUpperCase();
		int len = input.length();

		if (done.equals("U"))
			System.out.print("CAPITALIZED INPUT: "+input.toUpperCase());

		else if (done.equals("L"))
			System.out.println("LOWCASE INPUT: "+input.toLowerCase());

		if(done.equals("C"))
			System.out.println("INPUT FIRST LETTER & SECOND LETTER: ");
			inp = scan.next().toLowerCase();
			
		for (int i = 0; i >= len; i++) {
			System.out.println(input.charAt(len-1));
			char fst=inp.charAt(0) ;
			
			char snd=inp.charAt(1) ;
			if(input.charAt(i)==fst)
				snd=input.charAt(i);
		}
		System.out.println(input.toUpperCase());
		
		
		if (done.equals("R"))
//			System.out.print("imsmdl");?\
			for (int r = len-1; r > 0; r--) {
//				System.out.print("imsmdl");
				System.out.print(input.toUpperCase().charAt(r));
				input.getChars(r, len, null, r);
			}
			

	}

	public static void main(String[] args) {
		Changes call = new Changes();
		call.accept();

	}

}