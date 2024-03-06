package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gmail {

	@Test
	@Parameters({ "un", "pswd" })
	public void gmailLogin(String username, String password) {
		System.out.println("Gmail Login");
		System.out.println(username + " " + password);
	}

}
