//WAP with 4 constructors and 1 IIB
package assignments;
public class Assign_17 
{
	{
		System.out.println("IIB");
	}
	Assign_17()
	{
		System.out.println("Constructor1");
	}
	Assign_17(int a)
	{
		System.out.println("Constructor2");
	}
	Assign_17(int a, double b)
	{
		System.out.println("Constructor3");
	}
	Assign_17(int a, double b, String c)
	{
		System.out.println("Constructor4");
	}
	public static void main(String[] args) 
	{	
		new Assign_17();
		new Assign_17(21);
		new Assign_17(43,4.55);
		new Assign_17(34,5.88, "Saumya");
	}

}
