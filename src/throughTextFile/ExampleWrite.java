package throughTextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExampleWrite {

	// write into text file

	File fc; // to create a file through File class & import File Library
	String src = "C:\\Users\\rmala\\OneDrive\\Desktop\\2024 Selenium Webdriver Classes\\filewriteandread.txt";
	// location or path of the file to be created.
	FileWriter fw; // import FileWriter Lib
	BufferedWriter bw; // import BufferedWriter Lib

	@Test // import TestNg annotation
	public void writeintoTextFile() throws IOException {
		fc = new File(src);
		// to write content we create objects bw and fw classes.
		fc.createNewFile(); // this creates new and empty file
		fw = new FileWriter(src); // to write something to the file to the file ;FileWriter(String pathname)
		bw = new BufferedWriter(fw); // fw is going to copy content from buffer to the text file.
		bw.write("This is the write file created");
		bw.newLine(); // gives new line
		bw.write("This is the write file created 1");
		Reporter.log("File is created and content is written");
		bw.close();// save and close the object

	}
}