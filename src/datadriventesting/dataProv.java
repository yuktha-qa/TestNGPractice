package datadriventesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProv {

	Object[][] data;

	@DataProvider(name = "login data")
	public Object[][] dp() {

		data = new Object[3][2]; // row column

		data[0][0] = "rc00";
		data[0][1] = "rc01";

		data[1][0] = "rc10";
		data[1][1] = "rc11";

		data[2][0] = "rc20";
		data[2][1] = "rc21";

		return (data);
	}

	@Test(dataProvider = "login data")
	public void login(String usern, String pswd) {
		System.out.println(usern + ":" + pswd);

	}

}
