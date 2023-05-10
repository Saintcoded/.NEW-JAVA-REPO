package macpackage2;

public class FizzBuzz {

	FizzBuzz() {
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");//it breaks out off that loop

			} else if (i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");

			} else if (i % 3 == 0) {
				System.out.println("Fizz");

			} else {
				System.out.println(i);
				
			}
		}
	}

	public static void main(String[] args) {
		FizzBuzz call = new FizzBuzz();

	}

}
