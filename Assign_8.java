//Create few constructor and call it in main method
package assignments;

public class Assign_8 
{
Assign_8()
{
	System.out.println("I am a non para constructor");
}
Assign_8(int a)
{
	System.out.println("I am a para constructor");
}
	public static void main(String[] args) 
	{
		new Assign_8();
		new Assign_8(300);
	}
}
