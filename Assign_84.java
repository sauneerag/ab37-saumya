//Check if 2 given strings are anagram of each other or not
package assignments;
import java.util.Arrays;
public class Assign_84 
{
	public static void main(String[] args) 
	{
		String a1 = "calm";
		String a2 = "clam";
		
		if(a1.length() != a2.length())
		{
			System.out.println("This is not anagram");
		}
		else 
		{
			char[] c1 = a1.toCharArray();
			Arrays.sort(c1);
			char[] c2 = a2.toCharArray();
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)==true) 
				{
				System.out.println("This is an anagram");
				}
		}
	}
}