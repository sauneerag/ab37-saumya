//Write a non static method and call it inside the main method
package assignments;
public class Assign_5 {
void add() {
	int a = 12;
	int b = 18;
	int sum = a+b;
	System.out.println(sum);
}
	public static void main(String[] args) {	
	Assign_5 a1=new Assign_5();
	a1. add();
	System.out.println("I like to add");
}
}

