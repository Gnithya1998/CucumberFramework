package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {

	public WebDriver driver;

	public WebDriver Initialization() throws IOException {

		String file = System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties";
		FileInputStream fileInputStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInputStream);

		String browser = prop.getProperty("browser");
		String url = prop.getProperty("QAUrl");

		if (driver == null) {

			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Team EERO\\Documents\\drivers\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
			}
		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Team EERO\\Documents\\drivers\\edgedriver_win64\\msedgedriver.exe");
			
		}
		return driver;
	}

}
