//WAP to find area of triangle by taking values of b and h from scanner class
package assignments;

import java.util.Scanner;

public class Assign_38 
{

	public static void main(String[] args) 
	{System.out.println("Area of Triangle");
		Scanner s1=new Scanner(System.in);
		System.out.println("Base=");
		double b =s1.nextDouble();
		System.out.println("Height=");
		double h = s1.nextDouble();
		System.out.println("Area of Triangle="+ (b*h)/2);
	}

}
