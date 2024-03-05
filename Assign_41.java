// WAP a program using  Switch(a) keyword case1:addition, case2:subtraction, case3:multiplication, 
// case4:Division And fetch the value of 'a' with scanner class using nextInt() method."
package assignments;
import java.util.Scanner;
public class Assign_41
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