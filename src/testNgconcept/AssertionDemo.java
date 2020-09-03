package testNgconcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test
	public void hardAssertion() {
		System.out.println("Start Execution");
		String expcRsl="facebook";
		String actualrsl="facebook";
        Assert.assertEquals(expcRsl, actualrsl);
		System.out.println("End Execution1");
		System.out.println("End Execution2");

	}
	
	@Test
	public void SoftAssertion() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Start Execution");
		
		String expcRsl="facebook";
		String actualrsl="facebook";
        sa.assertEquals(expcRsl, actualrsl);
		System.out.println("End Execution1");
		System.out.println("End Execution2");
        sa.assertAll();
	}


}
