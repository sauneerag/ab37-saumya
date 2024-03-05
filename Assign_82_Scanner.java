package assignments;

import java.util.Scanner;

public class Assign_82_Scanner 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		String input = s1.next();
		String reversedString= new StringBuilder(input).reverse().toString();
		System.out.println(reversedString);
	}
}
