package assignments;

public class GlobalVariable1 
{
	static int a;
	static int b;
	static void add()
	{
		a=1100;
		b=900;
		int sum = a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		a =100;
		b = 20;
		int sub = a-b;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		add();
		GlobalVariable1 g1=new GlobalVariable1();
		g1.subtract();
	

	}

}
