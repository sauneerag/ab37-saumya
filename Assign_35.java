//WAP to get inputmismatch exception using scanner class for all the data types
package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assign_35
{

	public static void main(String[] args) 
	{
		try {
		Scanner s1=new Scanner(System.in);
		byte a=		s1.nextByte();
		/*short b = 	s1.nextShort();
		int c=		s1.nextInt();
		long d=		s1.nextLong();
		float e=	s1.nextFloat();
		double f=	s1.nextDouble();
		boolean g=	s1.nextBoolean();
		String h=	s1.next();	*/
		System.out.println("this is correct");
		}
		catch(InputMismatchException e1)
		{
			System.out.println(" i am an exception");
		}
	}

}
