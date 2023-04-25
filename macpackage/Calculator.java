package macpackage;

class Arithmetic{
	int x = 2, y = 3;
	
	Arithmetic(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Parent constructor with arghument");
	}
	
	void add() {
		System.out.println("Add from Parent");
		String fmt = String.format("%d + %d = %d", x, y, x + y);
		System.out.println(fmt);
	}
	
	public Arithmetic() {
		System.out.println("Parent constructor with no argument");
	}
}
public class Calculator extends Arithmetic{
	
	Calculator(){
		new Arithmetic(7, 8);
		System.out.println("Constructor from parent called successfully");
	}
	
	Calculator(int a, int b){
		super(a, b); // making a constructor call to parent
		System.out.println("Child constructor");
	}
	
	void add() {
		super.add();
		System.out.println("Add from child");
	}
	
	public static void main(String[] args) {
		Calculator calc1 = new Calculator(2, 8);
		calc1.add();
	}
}

/*
 
 Whenever child constructor is called, parent constructor is also called
 automatically.
 
 super passes values to the parent class while constructor of parent just
 makes reference.
 
 When inheriting, the child constructor must match at least one constructor
 from parents. Accurately and precisely, the child constructor must make a
 constructor call to parent constructor.
 
 Method signatures - return type, method name and argument
 
 Polymorphism is about creating objects, how they are called, how constructors
 are called.
 
 Method overloading, constructor overloading is static polymorphism...
 
	
*/
