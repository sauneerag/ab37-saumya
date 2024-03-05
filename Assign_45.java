//WAP for multilevel inheritance in a single program and make all the methods are non static
package assignments;
class three 
{
	void add() 
	{
		System.out.println("add");
	}
}
class two extends three 
{
	void subtraction() 
	{
		System.out.println("subtract");
	}
}
public class Assign_45 extends two 
{
	void multiplication() 
	{
		System.out.println("multiply");
	}
	public static void main(String[] args) 
	{
		Assign_45 a1 = new Assign_45();
		a1.multiplication();
		a1.subtraction();
		a1.add();
	}
}
