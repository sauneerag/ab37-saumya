package assignments;

public class Assign_85 
{

	public static void main(String[] args) 
	{
		String a = "saumya";
		String input = "I love my India";
		
		boolean a1 = a.matches("......");
		System.out.println(a1);
		boolean a2 = a.matches(".....");
		System.out.println(a2);
		boolean a3 = a.matches("s.....");
		System.out.println(a3);
		boolean a4 = a.matches("s(.*)");
		System.out.println(a4);
		boolean a5 = input.matches("(.*)world(.*)");
		System.out.println(a5);
	}

}