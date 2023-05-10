package macpackage2;

import java.util.Scanner;

class Student_details  {
	private String firstname, lastname;
	private int age,id;
	private Object  Course;
	Student_details(String firstname, String lastname, int age, Object Course, int id) {
		this.age = age;
		this.Course = Course;
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}
	@Override
	public String toString() {
		return "MY NAME IS "+firstname+"\nI AM "+age+ " YRS OLD \n"+"I STUDY "+Course+"\nMY ID:"+id+"\n";
	
		
	}
}

class Employee_details extends Student_details {
	private String firstname, lastname, dept_name, Designation;
	private int age, id,salary;
//	private Object salary;

	Employee_details(String firstname, String lastname, int age, int salary, String dept_name, int id,
			String Designation) {
		super(firstname,lastname, 24,"", 234);
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.age = age;
		this.salary=salary;
		this.Designation = Designation;
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "MY NAME IS "+firstname+"\nI AM "+age+ " YRS OLD "+"\nI EARN "+salary+"\nMY DEPATMENT IS: "+dept_name+"\nI LIVE AT "+ Designation+"\nMY ID:"+id+"\n";
	
		
	}

}

public class Details extends Employee_details {

	Details() {
		super("", "", 79, 76,"" , 75 ,"" );
		Scanner scan = new Scanner(System.in);
		System.out.print("HOW MANY PEOPLE ARE YOU ACCEPTING? ");
		int input = scan.nextInt();
		for (int i = 0; i < input; ) {

			System.out.print("WHOSE DETAIL WOULD YOU LIKE TO INPUT (STUDENT OR EMPLOYEE) ? ");
			String choice = scan.next();
				
			
			if (choice.equalsIgnoreCase("Student")) {
				i++;
		
				System.out.print("ENTER FIRSTNAME: ");
				String firstname = scan.next();

				System.out.print("ENTER LASTNAME: ");
				String lastname = scan.next();

				System.out.print("HOW OLD ARE YOU? ");
				int age = scan.nextInt();

				System.out.print("WHAT COURSE DO YOU OFFER? ");
				String Course = scan.next();

				System.out.print("ENTER YOUR ID: ");
				int id = scan.nextInt();
				
				System.out.println();
				Student_details call = new Student_details(firstname,lastname, age ,Course, id);
				System.out.print(call.toString()	);
				


			} else if (choice.equalsIgnoreCase("Employee")) {
				i++;
				System.out.print("ENTER FIRSTNAME: ");
				String firstname = scan.next();

				System.out.print("ENTER LASTNAME: ");
				String lastname = scan.next();
			
				System.out.print("HOW OLD ARE YOU? ");
				int age = scan.nextInt();

				System.out.print("HOW MUCH IS YOUR SALARY? ");
				int salary = scan.nextInt();

				System.out.print("WHATS YOUR DEPARTMENT? ");
				String dept_name = scan.next();

				System.out.print("WHATS YOUR ADDRESS? ");
				String Designation = scan.next();

				System.out.print("ENTER YOUR ID: ");
				int id = scan.nextInt();
				System.out.println();
				
				Employee_details cal = new Employee_details(firstname, lastname, age, salary,dept_name , id ,Designation );
				System.out.print(cal);
				
			} else {
				System.err.print("INVALID OPTION"+"\n");
//				continue;
		}

		}
	}

	public static void main(String[] args) {
		Details ca = new Details();

	}
}
