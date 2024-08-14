package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v122.browser.model.Bucket;

public class CheckOutPage {
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By checkoutIcon = By.cssSelector("a.cart-icon");
	By proceedToCart = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By productName = By.cssSelector("tr td:nth-child(2) p");
	By promoBtn = By.cssSelector("button.promoBtn");
	By placeOrderBtn = By.xpath("//button[text()='Place Order']");
 	
	public void toCheckOutPage() throws InterruptedException {
		
		driver.findElement(checkoutIcon).click();
		driver.findElement(proceedToCart).click();
		Thread.sleep(4000);
	}
	
	public String getProductName() {
		
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public boolean promoVisibility() {
		
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public boolean placeOrderVisibility() throws InterruptedException {
		
		//Thread.sleep(4000);
		return driver.findElement(placeOrderBtn).isDisplayed();
	}

}
