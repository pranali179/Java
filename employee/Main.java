package employee;

public class Main {
	public static void main(String [] args) {
	Employee e = new Employee();
	e.name = "abc";
	e.age = 23;
	e.city = "chennai";
	Employee e1 = new Employee();
	e1.name = "xyz";
	e1.age = 25;
	e1.city = "pune";
	e.display();
	e1.display();
	}
}
