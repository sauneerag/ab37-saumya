//WAP to create a Class with 2 static and 2 non static methods, perform add and sub in first two. 
//Multiply and divide in last two and call in main method.
package assignments;
public class Assign_10 {
	static void Add() {
		int a = 30;
		int b = 21;
		int sum=a+b;
		System.out.println(sum);
	}
	static void Subtract() {
		int a = 40;
		int b = 30;
		int Sub=a-b;
		System.out.println(Sub);
	}
	void Multiply() {
		int a=10;
		int b=10;
		int Multiply=a*b;
		System.out.println(Multiply);
	}
	void Division() {
		double a =8;
		double b =56;
		double div = a/b;
		System.out.println(div);
	}
	public static void main(String[] args) {
		Add();
		Subtract();
		Assign_10 a1=new Assign_10();
		a1.Multiply();
		a1.Division();
	}

}
