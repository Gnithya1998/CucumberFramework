package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		
		this.driver = driver;
	}

	By searchBox = By.id("search-field");
	By productName = By.cssSelector("tr td:nth-child(1)");

	public void searchProduct(String product) throws InterruptedException {

		driver.findElement(searchBox).sendKeys(product);
		Thread.sleep(4000);
	}

	public String getProductName() {

		return driver.findElement(productName).getText();
	}
}
