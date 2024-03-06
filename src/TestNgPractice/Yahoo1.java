package TestNgPractice;

import org.testng.annotations.Test;

public class Yahoo1 {

	@Test(description = "Launch", priority = 1) // attributes of @Test
	public void launchYahoo() {
		System.out.println("Launch Yahoo");
	}

	@Test(description = "Login", priority = 2)
	public void loginYahoo() {
		System.out.println("Login Yahoo");
	}

	@Test(description = "Logout", priority = 3)
	public void closeYahoo() {
		System.out.println("Close Yahoo");
	}

}
