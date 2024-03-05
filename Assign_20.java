// WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables and initialize then in 
// each method perform addition and subtraction
package assignments;

public class Assign_20 
{	static int a;
	static int b;
	
	static void add() 
	{
		a=34;
		b=78;
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub() 
	{
		a=79;
		b=780;
		int result=b-a;
		System.out.println(result);
	}
	public static void main(String[] args) {
		add();
		sub();
	}
}