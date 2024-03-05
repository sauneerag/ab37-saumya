//Create child class and 2 interfaces and create relation of child class with interface(1st)
//and relation of child class with interface(2nd) and achieve multiple level inheritance
package assignments;
interface Country_tax 
{
	void country_taxcollection();
	void country_ittax();
	}
interface State_tax 
{
	void state_taxcollection();
	void state_ittax();
	}
public class Assign_52 implements State_tax, Country_tax
{
	public static void main(String[] args) 
	{
	Assign_52 a1=new Assign_52();
	a1.country_ittax();
	a1.country_taxcollection();
	a1.state_taxcollection();
	a1.state_ittax();
	}
	public void country_taxcollection() {
		System.out.println("Logic1");
	}
	public void country_ittax() {
		System.out.println("Logic2");
	}
	public void state_taxcollection() {
	System.out.println("Logic3");
	}
	public void state_ittax() {
		System.out.println("Logic4");
	}
}
