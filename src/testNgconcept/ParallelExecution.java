package testNgconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void browserlaunch(String browser_name) {

		if (browser_name.equalsIgnoreCase("chrome")) {

			String driverpath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", driverpath);

			driver = new ChromeDriver();

		} else if (browser_name.equalsIgnoreCase("firefox")) {

			String driverpath = System.getProperty("user.dir") + "\\src\\drivers\\geckodriver.exe";

			System.setProperty("webdriver.gecko.driver", driverpath);

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}