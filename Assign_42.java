//WAP using switch(a) keyword case1: addition of b&c, case2: subtraction of b&c, case3: multiplication of b&C, case4: division of b&c. 
//Fetch the value of a, b &c from scanner class using nextint() method. And print the output individually for all cases.
package assignments;
import java.util.Scanner;
public class Assign_42 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		System.out.println("Enter the value of c");
		int c = s1.nextInt();
		System.out.println("Enter the value of a (1-sum/2-subtraction/3-multiplication/4-division)");
		int a = s1.nextInt();
		
		switch(a)
		{
		case 1:	System.out.println((b+c));
		break;
		case 2: System.out.println((b-c));
		break;
		case 3: System.out.println((b*c));
		break;
		case 4: System.out.println((b/c));
		break;
		default: System.out.println("Iam default line");
		}
	}
}
