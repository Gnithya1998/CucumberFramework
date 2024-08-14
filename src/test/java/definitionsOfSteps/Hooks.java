package definitionsOfSteps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextContainer;

public class Hooks {
	
	public WebDriver driver;
	TestContextContainer testContextContainer;
	
	public Hooks(TestContextContainer testContextContainer) throws IOException {
		
		this.testContextContainer = testContextContainer;
		this.driver = testContextContainer.baseSetup.Initialization();
		
	}
	
	@After
	public void tearDown(){
		
		driver.quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		
		if(scenario.isFailed()) {
			
			File sourceFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] screenShot = FileUtils.readFileToByteArray(sourceFile);
			scenario.attach(screenShot, "image/png", "screenShotImage");
		}
	}
}
