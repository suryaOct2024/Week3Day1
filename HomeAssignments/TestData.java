package week3.day1.HomeAssignments;

public class TestData {
	
	public void enterCredentials()
	{
		System.out.println("Enter the Credentials");
	}
	
	public void navigateToHomePage()
	{
		System.out.println("Navigate to Home Page");
	}

	public static void main(String[] args) {
		
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}
}
