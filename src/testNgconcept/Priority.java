package testNgconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priority {

	WebDriver driver;
	
	@Test(priority=1)
	public void browserlaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.out.println(driverpath);

		System.setProperty("webdriver.chrome.driver", driverpath);

		 driver = new ChromeDriver();

		// to maxmize the window
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void applaunch() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3)
	public void login() {
		WebElement elm = driver.findElement(By.id("txtUsername"));
		elm.sendKeys("Admin");
 
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
         
		// click on login button
		driver.findElement(By.id("btnLogin")).click();	}
	
	@Test(priority=4)
	public void logout() throws InterruptedException {
	driver.findElement(By.id("welcome")).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
	}
}
