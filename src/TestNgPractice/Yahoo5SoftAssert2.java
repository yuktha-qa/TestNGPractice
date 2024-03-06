package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Yahoo5SoftAssert2 {

	WebDriver driver;

	@Test(priority = 1)
	public void LaunchYahoo() {
		System.out.println("Yahoo Website Launched");
		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		System.out.println("Title of Yahoo Page : " + driver.getTitle());
		driver.findElement(By.linkText("Sign in")).click();
	}

	@Test(priority = 2)
	public void LoginYahoo() {
		System.out.println("Yahoo Login");
		SoftAssert assertion = new SoftAssert();
		String title = driver.getTitle();
		assertion.assertEquals(title, "Yahoo");
		System.out.println("Soft Assertion Executed");
		System.out.println("Title Matched");
		assertion.assertAll(); // This has to be used for accuracy
	}

	@Test(priority = 3)
	public void LoginYahoo1() {
		System.out.println("Login Yahoo1 Soft Assert False Example");
		SoftAssert assertion1 = new SoftAssert();
		String title1 = driver.getTitle();
		assertion1.assertEquals(title1, "Yahoo1");
		System.out.println("Soft Assertion Executed - False");
		System.out.println("Title Not Matched");
		assertion1.assertAll();

	}

	@Test(priority = 4, enabled = false) // this will ignore the method
	public void LoginYahoo2() {
		System.out.println("Login Yahoo2 Soft Assert False Example");
		SoftAssert assertion1 = new SoftAssert();
		String title1 = driver.getTitle();
		assertion1.assertEquals(title1, "Yahoo1");
		System.out.println("Soft Assertion Executed - False");
		System.out.println("Title Not Matched");
		assertion1.assertAll();

	}

	@Test(priority = 5)
	public void CloseYahoo() {
		System.out.println("Yahoo Website Closed");
		driver.quit();
	}

}
