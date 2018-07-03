package TestNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

	private static DriverInit instanceDriver = null;
	private WebDriver driver;

	private DriverInit() {

	}

	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"E:/Vincent/PersonalUpdates/Software Testing videos/Automation Testing tool/Selenium Download/Chrome webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static DriverInit getInstance() {
		if (instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;

	}

}
