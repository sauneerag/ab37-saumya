//Write many non static method and call it inside the main method
package assignments;

public class Assign_6 
{
void add() {
	int a = 30;
	int b = 40;
	int sum = a+b;
	System.out.println(sum);
}
void sub() {
	int a = 40;
	int b = 60;
	int result = a-b;
	System.out.println(result);
}
	public static void main(String[] args) 
	{
		Assign_6 a1=new Assign_6();
		a1.add();
		a1.sub();

	}

}
