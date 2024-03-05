//WAP to find the Area of Circle , keep pi as static global final , create 2 methods 1 having r = 7 and another having r =14
package assignments;
public class Assign_33 
{
	final static double pi = 3.14;
	
	static void areaofcircle() 
	{
		double r=14;
		double area=pi*r*r;
		System.out.println("Area of Circle from method = "+area);
	}
	public static void main(String[] args) 
	{
		areaofcircle();
		double r=7;
		double area=pi*r*r;
		System.out.println("Area of Circle from main method = "+area);
		
	}

}
