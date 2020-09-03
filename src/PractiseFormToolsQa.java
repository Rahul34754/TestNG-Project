import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class PractiseFormToolsQa {

	WebDriver driver;

	@Test(priority = 1)
	public void browserlaunch() {
		String driverpath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@Test(priority = 2)
	public void applaunch() {

		driver.get("https://demoqa.com/automation-practice-form/");
	}

	@Test(priority = 3)
	public void form() throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys("Rahul");
		driver.findElement(By.id("lastName")).sendKeys("Passi");
		driver.findElement(By.id("userEmail")).sendKeys("rahulpassi@gmail.com");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();

		driver.findElement(By.id("userNumber")).sendKeys("9501234754");

		driver.findElement(By.id("dateOfBirthInput")).click();

		// for DOB
		driver.findElement(By.id("dateOfBirthInput")).isSelected();

		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("12 october 1998");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);

		// FOR SUBject
		driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);

		// FOR CHECKBOX
		driver.findElement(By.xpath(("//label[@for='hobbies-checkbox-3']"))).click();

		// FOR IMAGE UPLOAD
		Thread.sleep(3000);
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\walpaper\\alex-green-OdEdGWr0EkM-unsplash.jpg");

		// FOR CURRENT ADDRESS
		driver.findElement(By.id("currentAddress")).sendKeys("PUNJAB");

		// FOR SELECT STATe
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.id("state"))).click().build().perform();

		act.moveToElement(driver.findElement(By.id("state"))).sendKeys("NCR").perform();

		act.moveToElement(driver.findElement(By.id("state"))).sendKeys(Keys.ENTER).perform();

		act.moveToElement(driver.findElement(By.xpath(("//div[contains(text(),'City')]")))).click().build().perform();

		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath(("//div[contains(text(),'Noida')]")))).click().perform();
		Thread.sleep(2000);

		// FOR SUBMIT
		act.moveToElement(driver.findElement(By.id("submit"))).click().build().perform();

	}

}
