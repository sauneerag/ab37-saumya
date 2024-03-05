//Create many static method and call in inside a main method
package assignments;
public class Assign_4 {
static void add() {
	int a=23;
	int b=37;
	int sum =a+b;
	System.out.println(sum);
}	
static void sub() {
	int a=30;
	int b=20;
	int result=a-b;
	System.out.println(result);		
}
public static void main(String[] args) {
		add();
		sub();
	}
}