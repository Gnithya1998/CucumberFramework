package utils;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class ReuseUtils {

	public WebDriver driver;

	public ReuseUtils(WebDriver driver) {

		this.driver = driver;
	}

	public void switchToChildWindow() {

		if (!driver.getCurrentUrl()
				.equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers")) {

			
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();

			String parentWindow = it.next();
			String childWindow = it.next();

			driver.switchTo().window(childWindow);
		}
	}

}
