//Check if the String is Palindrome
package assignments;
public class Assign_83 
{
	public static void main(String[] args) 
	{
		String input = "Manish";
		String output = "";
		
		for(int i = input.length()-1; i>=0;i--)
		{
			char reverse = input.charAt(i);
			output = output+reverse;
		}
	System.out.println(output);
	if (input.equals(output))
	{
		System.out.println("The given string is a Palindrome");
	}
	else 
	{
		System.out.println("The given string is not a Palindrome");
	}
	}
	

}
