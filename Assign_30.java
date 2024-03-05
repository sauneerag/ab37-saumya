package assignments;
public class Assign_30 
{
	final double pi = 3.14;
	int r = 3;
	double area;
	
	public void areaofcircle() 
	{
		area = pi*r*r;
	}	
	public static void main(String[] args) 
	{
		Assign_30 a1= new Assign_30();
		a1.areaofcircle();
		System.out.println(a1.area);
	}
}