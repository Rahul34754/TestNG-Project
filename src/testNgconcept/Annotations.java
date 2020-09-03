package testNgconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void test() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Beforeclass");
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Beforemethod");
	}
	
	@Test
	public void browserlaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.out.println(driverpath);

		System.setProperty("webdriver.chrome.driver", driverpath);

		 driver = new ChromeDriver();

		// to maxmize the window
		driver.manage().window().maximize();	}
	
	@Test
	public void applaunch() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuiteO");
	}
}
