//WAP to do addition, subtraction,multiplication, division by using scanner class and  a and b as local variables
package assignments;
import java.util.Scanner;
public class Assign_36 
{
	static void add() 
	{	
		System.out.println("Addition");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		System.out.println("Sum="+(a+b));
	}
	static void sub() 
	{
		System.out.println("Subtraction");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		System.out.println("Total="+(a-b));		
	}
	static void multi() 
	{
		System.out.println("Multiplication");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		System.out.println("Total="+(a*b));
	}
	static void Div()
	{
		System.out.println("Division");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		System.out.println("Total="+(a/b));
	}
	public static void main(String[] args) 
	{		
		add();
		sub();
		multi();
		Div();
	}
}