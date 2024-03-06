package listenertestng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(list.TListen.class)
public class CompareValues {

	@Test
	public void compareInt() {
		Assert.assertEquals(20, 20);
	}
	@Test
	public void compareDecimal() {
		Assert.assertEquals(2.5, 3.5);
	}
}
