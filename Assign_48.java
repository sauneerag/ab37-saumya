//create a class and create two concrete methods inside a class(static add, non static sub), create abstract class and 
//create two abstract methods (multiplication, division), create two concrete methods inside main method 
package assignments;
class Concrete_1 {
	static void add() 
	{
		
	}
	void subtract() 
	{
		
	}
}
abstract class Abstract_Class2 extends Concrete_1 {
	abstract void multiply();

	abstract void division();
}

public class Assign_48 extends Abstract_Class2 {
	static void calculation() {
	}

	void manage() {	
	}

	public static void main(String[] args) {
		calculation();
		Assign_48 a1 = new Assign_48();
		a1.manage();
		a1.subtract();
		a1.multiply();
		a1.division();
	}

	void multiply() {

	}

	void division() {

	}

}
