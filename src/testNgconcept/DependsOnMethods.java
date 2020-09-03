package testNgconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {
WebDriver driver;
	
	@Test
	public void browserlaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		System.out.println(driverpath);

		System.setProperty("webdriver.chrome.driver", driverpath);

		 driver = new ChromeDriver();

		// to maxmize the window
		driver.manage().window().maximize();
	}
	
	@Test(dependsOnMethods="browserlaunch")
	public void applaunch() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(dependsOnMethods="applaunch")
	public void login() {
		WebElement elm = driver.findElement(By.id("txtUsername"));
		elm.sendKeys("Admin");
 
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
         
		// click on login button
		driver.findElement(By.id("btnLogin")).click();	}
	
	@Test(dependsOnMethods="login")
	public void logout() throws InterruptedException {
	driver.findElement(By.id("welcome")).click();
	 Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
}
}