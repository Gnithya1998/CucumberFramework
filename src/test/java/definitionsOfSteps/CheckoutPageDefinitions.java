package definitionsOfSteps;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage;
import utils.TestContextContainer;

public class CheckoutPageDefinitions {
	
	public TestContextContainer testContextContainer;
	String checkOutProduct;
	CheckOutPage checkOutPage;
	
	public CheckoutPageDefinitions(TestContextContainer testContextContainer) {
		
		this.testContextContainer = testContextContainer;
		checkOutPage = testContextContainer.pageObjectManager.getCheckOutPage();
	}
	
	@Then("user navigates to the checkout page")
	public void user_navigates_to_the_checkout_page() throws InterruptedException {
		
		checkOutPage.toCheckOutPage();
		
	}
	@Then("validate same product visibility")
	public void validate_same_product_tom_visibility() {

		checkOutProduct = checkOutPage.getProductName();
		
	}
	@Then("validate the visibility of apply and place order button")
	public void validate_the_visibility_of_apply_and_place_order_button() throws InterruptedException {

		Assert.assertEquals(testContextContainer.homeProduct, checkOutProduct);
		Assert.assertTrue(checkOutPage.promoVisibility());
		Assert.assertTrue(checkOutPage.placeOrderVisibility());
	}

}
