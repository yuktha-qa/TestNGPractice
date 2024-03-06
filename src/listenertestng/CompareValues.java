package listenertestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareValues {

	@Test
	public void compareInt() {
		Assert.assertEquals(20, 20);
	}
}
