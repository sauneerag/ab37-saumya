//Create a class and in this create interface as Amazon with login and logout methods also create child class and create relation between them 
package assignments;
interface Amazon
{
	void login();
	void logout();
}

public class Assign_49 implements Amazon 
{

	public static void main(String[] args) 
	{
		Assign_49 a1 = new Assign_49();
		a1.login();
		a1.logout();
	}
	public void login() {
		System.out.println("Login");
	}
	public void logout() {
		System.out.println("Logout");
	}

}
