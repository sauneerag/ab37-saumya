//WAP where in a class, there are 5 methods(3static, 2non static) with same name....first method argument is int a, 
//second method argument is double a,third method argument is char a, fourth method argument is boolean a and fifth method argument is String a
package assignments;
public class Assign_11 
{
	static void method_1(int a) {	
		System.out.println(a);
	}
	static void method_2(double a) {
		System.out.println(a);
	}
	static void method_3(char a) {
		System.out.println(a);	
	}
	void method_4(boolean a) {
		System.out.println(a);
	}
	void method_5(String a) {
		System.out.println(a);
	}
	public static void main(String[] args) 
	{	
		method_1(25);
		method_2(3.343);
		method_3('B');
		Assign_11 a1= new Assign_11();
		a1.method_4(true);
		a1.method_5("I am a String");
	}
}