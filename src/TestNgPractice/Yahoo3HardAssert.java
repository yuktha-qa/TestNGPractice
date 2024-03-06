package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Yahoo3HardAssert {
	// Declared at class level as it can be used by different methods.
	WebDriver driver;

	@Test(description = "Open Yahoo", priority = 1)
	public void launchYahoo() {
		System.out.println("Launch Yahoo");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println("Title" + driver.getTitle());
		driver.findElement(By.linkText("Sign in")).click();
	}

	/*
	 * enabled = false that will not execute the method , change priority when it
	 * has to be executed as priority can't be same for two methods.
	 */
	@Test(description = "Login-Hard Assert is False", priority = 2, enabled = false)
	public void loginYahoo1() {
		System.out.println("Login Yahoo");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Yahoo1");
		System.out.println("Assert Executed is False");
		System.out.println("Title Not Matched");
	}

	@Test(description = "Login-Hard Assert is True", priority = 2)
	public void loginYahoo() {
		System.out.println("Login Yahoo");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Yahoo");
		System.out.println("Assert Executed");
		System.out.println("Title Matched");
	}

	@Test(description = "Logout Yahoo", priority = 3)
	public void closeYahoo() {
		System.out.println("Close Yahoo");
		driver.quit();
	}
}
