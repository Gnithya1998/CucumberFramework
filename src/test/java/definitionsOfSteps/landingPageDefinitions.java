package definitionsOfSteps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import utils.TestContextContainer;

public class landingPageDefinitions {
	
	public WebDriver driver; 
	public String homeProduct;
	public TestContextContainer testContextContainer;
	public PageObjectManager pageObjectManager;
	public LandingPage landingPage;
	
	
	public landingPageDefinitions(TestContextContainer testContextContainer) {
		
		this.testContextContainer = testContextContainer;
		landingPage = testContextContainer.pageObjectManager.getLandingPage();
	}

	@Given("user is landed on GreenKart home page")
	public void user_is_landed_on_green_kart_home_page() {
		
		//Assert.assertTrue(landingPage.getTitle().contains("GREENKART"));
		System.out.println(landingPage.pageTitle());
		
	}
	
	@When("^user searches the availability of a particular product (.+) in the home page$")
	public void user_searches_the_availability_of_a_particular_product_in_the_home_page(String productName) throws InterruptedException {

		
		landingPage.searchProduct(productName);
		testContextContainer.homeProduct = landingPage.getProductName();
		System.out.println(testContextContainer.homeProduct);
	}
	
	@When("^add (.+) quantity of the product$")
	public void add_number_of_quantity_of_the_product(int number) {
		
		landingPage.productIncrement(number);
		
	}
	@When("move to add to cart section")
	public void move_to_add_to_cart_section() {
		
		landingPage.addToCart();
	}
}
