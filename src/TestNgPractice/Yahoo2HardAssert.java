package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Yahoo2HardAssert {
	// Declared at class level as it can be used by different methods.

	WebDriver driver = new ChromeDriver();
	// WebDriver driver;

	@Test(priority = 1)
	public void launchYahoo() {
		System.out.println("Launch Yahoo");
		// driver = new ChromeDriver;
		driver.get("https://www.yahoo.com/");
		System.out.println("Yahoo Page Title : " + driver.getTitle());
		driver.findElement(By.linkText("Sign in")).click();
	}

	@Test(description = "Hard-Assert", priority = 2)
	public void loginYahoo() {
		System.out.println("Login Yahoo");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Yahoo1");
		/*
		 * Hard Assert:- rest of the instructions execute as it is true. //
		 * Assert.assertEquals(title,"Yahoo1"); this will be false so rest of the two
		 * instructions wont execute.
		 */
		System.out.println("Assert Executed");
		System.out.println("Title Matched");
	}

	@Test(priority = 3)
	public void closeYahoo() {
		System.out.println("Close Yahoo");
		driver.quit();
	}

}
