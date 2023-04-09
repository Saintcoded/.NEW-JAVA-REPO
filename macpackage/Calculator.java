package macpackage;

public class Calculator extends Aritimetics {
	int d;
	int add(int x,int y) {
		System.out.println("From calculator");
		return x+y;
		
	}
//	void greet(){
//	
//}
	public static void main(String[] args) {
		Aritimetics calc=new Calculator();//can only call members in the parent&child class or parent class
		Aritimetics cac=new Aritimetics();//only members in parent class
		Calculator cal=new Calculator();//only members in child class
		calc.add(6, 5);
		calc.greet();
		
	}

}

class Aritimetics{
	int add(int x,int y) {
		System.out.println("From Aritimetics");
		return x+y;
		}
	void greet(){
	
}
	
}
