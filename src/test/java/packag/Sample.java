package packag;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		/*
		 * opt.addArguments("--headless"); opt.addArguments("--no-sandbox");
		 * opt.addArguments("--disable-dev-shm-usage");
		 * System.setProperty("webdriver.http.factory", "jdk-http-client");
		 */
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getTitle().contains("Google"), "Title not match");
		driver.quit();
		System.out.println("Hello World");

	}

}
