package runnerPackage;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\java\\fileFeature" }, glue = {
		"definitionsOfSteps" }, monochrome = true, tags = "@SmokeTest or @RegressionTest", dryRun = false, plugin = { "pretty",
				"html:target/report.html", "json:target/report.json"})
public class RunnerFiles extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
