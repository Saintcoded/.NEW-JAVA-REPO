package macpackages;

import java.util.Scanner;
import java.util.Random;

public class Attendant {
	int c;
	int k;
	int n;
	int t;
	String move;
	int time[];
	int count;
	
	void meet() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("HOW MANY TEST CASES? ");
		t=scan.nextInt();
		
		Random obj=new Random();
		int rd = 0;
		
		for(int l=0;l>=5;l++)
			rd= obj.nextInt(-2,5);
			time = new int[] { rd };
			System.out.println(time);
		
		for(int i=0;i==t;i++) {
			System.out.println("INPUT TIME? ");
		c=scan.nextInt();
		for (int p=0;p>=time.length-1;p++) {
			if (time[p]<=0)
				count++;
			else
				count--;}
		
//		if (count<=c[1])
//			move="CLASS WILL HOLD";
//		else
//			move="CLASS CANCELLED";
//		System.out.println(move);
		}
		
	}
	public static void main(String[] args) {
		Attendant call=new Attendant();
		call.meet();
//		Random obj=new Random();
//		int rd = 0;
//		for(int l=0;l>=5;l++)
//			rd= obj.nextInt(15);
//			System.out.println(rd);
			
	}

}
