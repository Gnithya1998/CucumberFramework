package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	WebDriver driver;
	LandingPage landingPage;
	OfferPage offerPage;
	CheckOutPage checkOutPage;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		
		return landingPage = new LandingPage(driver);
	}
	
	public OfferPage getOfferPage() {
		
		return offerPage = new OfferPage(driver);
	}
	
	public CheckOutPage getCheckOutPage() {
		
		return checkOutPage = new CheckOutPage(driver);
	}
}


