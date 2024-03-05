//write a program for hierarchical inheritance and create a three classes(son, daughter, parent) in a single program
package assignments;
class son extends parent
{
	void multi() 
	{
		System.out.println("multiply numbers");
	}
	}
class parent
{
	void sub() 
	{
		System.out.println("subtract numbers");
	}
	}
public class Assign_46_Daughter extends parent
{
static void add() {
	System.out.println("adding numbers");
}
	public static void main(String[] args) 
	{
		add();
		Assign_46_Daughter a1=new Assign_46_Daughter();
		a1.sub();
	}

}
