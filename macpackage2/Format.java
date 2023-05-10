package macpackage2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Format {
	Scanner scan = new Scanner(System.in);
	 int getnum(String promt) {
		System.out.println(promt+" >>");
		return scan.nextInt();
	}

	public static void main(String[] args) {
		
		try {
		System.out.print("ACCEPT NUMBER: ");
		int num1 = scan.nextInt();
		
		System.out.print("ACCEPT NUMBER: ");
		int num2 = scan.nextInt();
		System.out.format("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.format("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.format("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.format("%d * %d = %d\n", num1, num2, num1 * num2);
		}catch (InputMismatchException ac) {
			System.out.println("InputMismatchException ERROR OCCURRED");
		}
		catch (ArithmeticException ac) {
			System.out.println("ArithmeticException ERROR OCCURRED");
		}System.out.println("END");

	}

}
