package week3.day1.HomeAssignments;

public class LoginTestData extends TestData{
	
	public void enterUsername()
	{
		System.out.println("Enter Username");
	}
	
	public void enterPassword()
	{
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterUsername();
		login.enterPassword();
		login.navigateToHomePage();
	}

}
