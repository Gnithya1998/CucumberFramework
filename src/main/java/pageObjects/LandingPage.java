package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By searchBox = By.cssSelector("input.search-keyword");
	By productName = By.cssSelector("h4.product-name");
	By offerPageLink = By.linkText("Top Deals");
	By incrementBtn = By.cssSelector("a.increment");
	By addToCartBtn = By.xpath("//button[text()='ADD TO CART']");
	
	public void searchProduct(String product) throws InterruptedException {
		
		driver.findElement(searchBox).sendKeys(product);
		Thread.sleep(4000);
	}
	
	public String getProductName() {

		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void navigateToOfferPage() {
		
		driver.findElement(offerPageLink).click();
	}
	
	public void productIncrement(int quantity) {
		
		int i = 1;
		while(i<quantity) {
			
			driver.findElement(incrementBtn).click();
			i++;
		}
	}
	
	public void addToCart() {
		
		driver.findElement(addToCartBtn).click();
	}
	
	public String pageTitle() {
		
		return driver.getTitle();
	}
}
