package throughwebtable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebtableToTextFile {
	// read data from web table and write it to the text file
	WebDriver driver;
	File fc;
	FileWriter fw;
	BufferedWriter bw;
	String src = "C:\\Users\\rmala\\OneDrive\\Desktop\\2024 Selenium Webdriver Classes\\WebTtoText.txt";

	@Test
	public void readTableToTextFile() throws IOException {

		fc = new File(src);
		fw = new FileWriter(fc); // throws exception
		// another way is fw = new FileWriter(src)
		bw = new BufferedWriter(fw);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement wtable = driver.findElement(By.id("customers"));
		List<WebElement> rows = wtable.findElements(By.tagName("tr")); // from 1st index i.e., 2nd line of the able
		int rowsize = rows.size();
		for (int i = 1; i < rowsize; i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < columns.size(); j++) {
				bw.write(columns.get(j).getText());
				bw.newLine();
			}
		}
		bw.close();
		driver.quit();
	}
}