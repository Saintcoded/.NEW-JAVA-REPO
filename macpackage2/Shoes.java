package macpackage2;

class Running {
	public final double weight;

	Running(double weight) {
		this.weight = weight;
	}
}

class Walking extends Running {
	public final boolean goretex;

	Walking(boolean goretex) {
		super(3.5);
		this.goretex = goretex;
	}
}

public class Shoes extends Walking {
	public final String brand;
	public final double size;

	Shoes(String brand, double size) {
		super(true);

		this.brand = brand;
		this.size = size;
		System.out.print(brand + " " + "size: " + size + " ");

		if (brand == "Nike") {
			Walking call = new Walking(false);
			if (call.goretex == call.goretex) {
				System.out.print("   " + " ");
			}
			Running cal = new Running(250);
			System.out.println(cal.weight);
		}

		if (brand == "Hanwag") {
			Walking call = new Walking(true);
			if (call.goretex == call.goretex) {
				System.out.print("Gore-Tex" + " \n");
			}
			Running cal = new Running(250);
		}

		if (brand == "Merrel") {
			Walking call = new Walking(false);
			if (call.goretex == call.goretex) {
				System.out.print("No Gore-Tex" + " \n");
			}
			Running cal = new Running(250);
		}

	}

	public static void main(String[] args) {
		String sho;
		double si;
		for (int i = 0; i < 3; i++) {
			String shh[] = { "Nike", "Hanwag", "Merrel" };
			double siz[] = { 43, 43.5, 42 };
			si = siz[i];
			sho = shh[i];
			Shoes call = new Shoes(sho, si);

//			Walking wk = new Walking(true);
			
//		 Shoes	arr [] = {wk};
			
		}
	}

}
