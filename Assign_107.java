// WAP for return keyword for float , double , string , boolean using scanner class
package assignments;
import java.util.Scanner;
public class Assign_107 
{
	public static float decimalfloat()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a small decimal number:");
		float a=s1.nextFloat();
		return a;
	}
	public static double decimaldouble()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a big decimal number:");
		double b=s1.nextFloat();
		return b;
	}
	public static String string_value()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter letters:");
		String c=s1.next();
		return c;
	}
	public static boolean boolean_value()
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter boolean value:");
		boolean d=s1.nextBoolean();
		return d;
	}
	public static void main(String[] args) 
	{
		System.out.println(decimalfloat());
		System.out.println(decimaldouble());
		System.out.println(string_value());
		System.out.println(boolean_value());
	}	
}
