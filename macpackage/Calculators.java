package macpackage;

abstract class simple{
	
	void subtract(){}
		abstract void add();
	
}

class Aritimetical {
//	this is the super class or parent class
	int x;
	int y;
	
	int add(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("From calculator");
		return x + y;

	}

	void addition() {
		System.out.println("Add from Parent");
		String fmt= String.format("%d + %d =%d",x,y);
		System.out.println(fmt);

	}
}

public class Calculators  extends Aritimetical  {
//	THIS IS THE CHILD CLASS

	int add(int x, int y) {
		System.out.println("From Aritimetics");
		return x + y;
	}
	
//	@Override is used to override the exact same method in the superclass if the same method is not there i flags as error.
	void addition() {
		super.addition();

	}


	public static void main(String[] args) {
		Aritimetical calc = new Calculators();// can only call members in the parent&child class or parent class
		Aritimetical cac = new Aritimetical();// only members in parent class
		Calculator cal = new Calculator();// only members in child class
		calc.add(6, 5);
		calc.addition();

	}

}

