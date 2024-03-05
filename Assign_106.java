// WAP for return keyword for int and double
package assignments;

public class Assign_106 
{
	int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	double subtract (int a, double b) 
	{
		double sub = a-b;
		return sub;	
	}

	public static void main(String[] args) 
	{
		Assign_106 a1 = new Assign_106();
		System.out.println(a1.add(1, 0));
		System.out.println(a1.subtract(1, 0.01));
		

	}

}
