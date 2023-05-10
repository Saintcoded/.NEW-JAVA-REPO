package macpackage2;

interface Jide {
	public void add();
}

interface me {
	public void div();
}

interface eni {
	public void minus();
}

interface you {
	public void multi();
}

class Aritimetics implements Jide, me, eni, you {
	int x, y;

	Aritimetics(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public void add() {
		int resu = x + y;
		String res = String.format("%d + %d = %d", x, y, resu);
//		System.out.format("%d + %d = %d",x, y, res);
		System.out.println(res);

	}

	@Override
	public void div() {
		int resu = x / y;
		String res = String.format("%d / %d = %d", x, y, resu);
//		System.out.format("%d / %d = %d",x, y, res);
		System.out.println(res);

	}

	@Override
	public void minus() {
		int resu = x - y;
		String res = String.format("%d - %d = %d", x, y, resu);
//		System.out.format("%d - %d = %d",x, y, res);
		System.out.println(res);

	}

	@Override
	public void multi() {
		int resu = x * y;
		String res = String.format("%d + %d = %d", x, y, resu);
//		System.out.format("%d * %d = %d",x, y, res);
		System.out.println(res);

	}
}

public class Calc {
	int x, y;

	void add(Jide pide) {
		pide.add();// calls add method from Aritimetics.
	}

	void addes(Jide jide) {
		System.out.println();

	}

	void eni(me me) {
		me.div();
	}

	void you(you you) {
		you.multi();
	}

	void me(eni eni) {
		eni.minus();
	}

	Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {

		Calc cal = new Calc(2, 3);
		Aritimetics jide = new Aritimetics(2, 3);// calls the Aritimetics constructor
//		Aritimetics jide1=new Aritimetics(1,3);
		cal.add(new Aritimetics(2, 3));// call add in Calc class and pass the constructor values
		cal.add(jide);

	}

}
