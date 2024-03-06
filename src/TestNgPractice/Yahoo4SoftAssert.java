package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Yahoo4SoftAssert {

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
	public void CloseYahoo() {
		System.out.println("Yahoo Website Closed");
		driver.quit();
	}

}
