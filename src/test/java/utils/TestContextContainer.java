package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextContainer {
	
	public String homeProduct;
	public PageObjectManager pageObjectManager;
	public BaseSetup baseSetup;
	public ReuseUtils resUtils;
	
	
	public TestContextContainer() throws IOException {
		
		baseSetup = new BaseSetup();
		pageObjectManager = new PageObjectManager(baseSetup.Initialization());
		resUtils = new ReuseUtils(baseSetup.Initialization());	
	}
	

}
