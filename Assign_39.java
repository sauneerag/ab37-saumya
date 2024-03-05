//WAP by taking value of age from scanner class and if age is greater than 
//or equal to 18 then print " i am adult" else print " i am young"
package assignments;

import java.util.Scanner;

public class Assign_39
{

	public static void main(String[] args) 
	
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the age:");
		
		int age= s1.nextInt();
		if (age<18) {
			System.out.println("I am young");
		}
		else {
			System.out.println("I can vote");
		}
	}

}
