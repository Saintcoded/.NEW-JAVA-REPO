package macpackage2;

class Walking  {
	public final boolean goretex;

	Walking(boolean goretex) {
		this.goretex = goretex;
		System.out.println(this.goretex); 
		 

	}
}

class Running extends Walking{
	public final double weight;

	Running(double weight) {
		super(true);
		
		this.weight = weight;
		System.out.println(weight);

	}
}


public class Shoes extends Running {
	public final String brand;
	public final double size;

	Shoes(String brand, double size) {
		super(size);
		this.brand = brand;
		this.size = size;
		System.out.println(brand);
		System.out.println(size);

	}

	public static void main(String[] args) {
		Shoes call = new Shoes("Nike", 34.5);
		Shoes cal = new Shoes("puma", 33.5);
		Shoes ca = new Shoes("Addidas", 35);

	}

}
