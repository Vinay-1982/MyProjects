package TestNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGbasicstest2 {		
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void verifyPageTitleTest() {
		String title = driver.getTitle();
		System.out.println("the page title is: " + title);
		Assert.assertEquals(title, "Google");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}

