package throughTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EaxmpleRead {
	// this will the text file and print the content on console
	String src = "C:\\Users\\rmala\\OneDrive\\Desktop\\2024 Selenium Webdriver Classes\\writeandread.txt";
	FileReader fr;
	BufferedReader br;
	String content = null;// reading data in string format

	@Test
	public void readFile() throws IOException {

		fr = new FileReader(src); // read from src file
		br = new BufferedReader(fr); // pass through the br and display on console
		while ((content = br.readLine()) != null) {
			System.out.println(content);// print the content
		}
		// br.readLine will read the first line and will store to content then outer
		// expression content!=null
		Reporter.log("Passed");
		br.close();
	}
}