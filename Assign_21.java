//WAP with 3 methods main,static add and static subtract. 
//Declare and initialize a and b global variables as non- static in nature and then perform addition and subtraction with static methods
package assignments;

public class Assign_21 
{	int a=21;
	int b=34;
	int sum=a+b;
	int sub=b-a;
	
	static void add() 
	{	Assign_21 a1= new Assign_21();
		System.out.println(a1.sum);
		
	}
	static void sub() 
	{
		Assign_21 a1= new Assign_21();
		System.out.println(a1.sub);
	}
	public static void main(String[] args) {
		add();
		sub();
	}
}
