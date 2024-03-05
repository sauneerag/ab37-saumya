//WAP with combination of SIB, IIB, main method, constructor
package assignments;
public class Assign_15 
{	static 
	{
	System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	Assign_15()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) 
	{	
		System.out.println("Main method");

		new Assign_15();	
	}

}
