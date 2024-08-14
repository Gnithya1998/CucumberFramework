package definitionsOfSteps;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextContainer;

public class offerPageDefinitions {
	
	public String offerProduct;
	TestContextContainer testContextContainer;
	PageObjectManager pageObjectManager;
	OfferPage offerPage;
	
	public offerPageDefinitions(TestContextContainer testContextContainer) {
		
		this.testContextContainer = testContextContainer;
		offerPage = testContextContainer.pageObjectManager.getOfferPage();
		
	}
	
	@Then("^user is navigated to the offer page and searches for the same product (.+)$")
	public void user_is_navigated_to_the_offer_page_and_searches_for_the_same_product(String productName) throws InterruptedException {

		LandingPage landingPage = testContextContainer.pageObjectManager.getLandingPage();
		landingPage.navigateToOfferPage();
		testContextContainer.resUtils.switchToChildWindow();	
		offerPage.searchProduct(productName);
		offerProduct = offerPage.getProductName();
		System.out.println(offerProduct);
		
	}
	@Then("validated the product availability in both the pages")
	public void validated_the_product_availability_in_both_the_pages() {

		Assert.assertEquals(testContextContainer.homeProduct, offerProduct);
	}
}
