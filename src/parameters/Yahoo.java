package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Yahoo {

	@Test
	@Parameters({ "un", "pswd" })
	public void yahooLogin(String username, String password) {
		System.out.println("Yahoo Login");
		System.out.println(username + " " + password);
		if (username.equals("sam"))
			System.out.println("Cleared");
		else
			System.out.println("Not match");
	}

}
