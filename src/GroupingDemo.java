import org.testng.annotations.Test;

public class GroupingDemo {
       @Test(groups="Smoke")
	public void m1() {
		System.out.println("m1");
	}
       @Test(groups="Regression")
	public void m2() {
		System.out.println("m2");
	}
       @Test(groups="Sanity")
	public void m3() {
		System.out.println("m3");
	}
       @Test(groups="Functional")
	public void m4() {
		System.out.println("m4");
	}
       @Test(groups="M5")
	public void m5() {
		System.out.println("m5");
	}
       @Test(groups="M6")
	public void m6() {
		System.out.println("m6");
	}
}
