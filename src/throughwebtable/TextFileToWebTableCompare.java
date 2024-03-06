package throughwebtable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextFileToWebTableCompare {
// Compare Expected Data from the text file to the actual data on Web table
	//Text File
	FileReader fr;
	BufferedReader br;
	String src = "C:\\Users\\rmala\\OneDrive\\Desktop\\2024 Selenium Webdriver Classes\\WebTableToTextFile.txt";
	String content = null;
	// instance of ArrayList
	ArrayList<String> arrContent;

	@Test(description = "data from text file to arraylist")
	public void dataFrmText() throws IOException {

		fr = new FileReader(src);
		br = new BufferedReader(fr);
		arrContent = new ArrayList<>(); // ArrayOfString ? method

		while ((content = br.readLine()) != null) {
			arrContent.add(content);
		}
		System.out.println(arrContent); // Prints the content
	}
	// Webtable
	
	WebDriver driver;
	
	public void dataFrmWebTable() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement webTable = driver.findElement(By.id("customers"));
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		
	}

	/*
	 * public void TextWebCompareData {
	 * 
	 * }
	 */
}