//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as global variables
package assignments;

import java.util.Scanner;

public class Assign_37 
{	Scanner s1 = new Scanner(System.in);
	int a = s1.nextInt();
	int b = s1.nextInt();
	
	void addition()
	{	
		int c = a+b;
		System.out.println(c);
	}
	void sub()
	{	
		int d = a-b;
		System.out.println(d);
	}
	void multiply()
	{	
		int e = a*b;
		System.out.println(e);
	}
	void division()
	{	
		int f = a/b;
		System.out.println(f);
	}
	public static void main(String[] args) 
	{
		Assign_37 a1=new Assign_37();
		a1.addition();
		a1.sub();
		a1.multiply();
		a1.division();
	}
}
 