package throughwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtablerow {

	WebDriver driver;

	@Test
	public void readWebTableRow() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement wtable = driver.findElement(By.id("customers"));
		List<WebElement> allrows = wtable.findElements(By.tagName("tr"));
		System.out.println("Number of rows" + allrows.size());
		driver.quit();
		// driver gives the WebElement of the page whereas wtable gives the
		// List<WebElement> of the table.
		// findElement vs findElements one webElement vs List<WebElement>
		// size() gives the size for a List<WebElements>
	}
}
