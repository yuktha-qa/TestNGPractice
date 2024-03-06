package throughwebtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtablecolumn {

	WebDriver driver;

	@Test
	public void readWebTableColumn() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement wtable = driver.findElement(By.id("customers"));
		List<WebElement> allrows = wtable.findElements(By.tagName("tr"));
		System.out.println("Number of rows : " + allrows.size());

		// Use loop to access column of each row.
		for (int i = 1; i < allrows.size(); i++) {
			// column size by tag name td
			List<WebElement> allCol = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < allCol.size(); j++) {
				System.out.print(allCol.get(j).getText() + " ");
			}
			System.out.println("");
		}
		// System.out.println("Number of Columns : " + allCol.size());
		driver.quit();
	}
}
