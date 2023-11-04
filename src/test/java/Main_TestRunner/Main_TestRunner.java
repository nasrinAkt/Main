package Main_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Main_Utility.Main_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/Main_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Main_StepDefinition")//tags={"@tag"})

public class Main_TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void maiStartURL() {
	Main_Base mai = new Main_Base();
	mai.MaiBrowser();
			
	}
	
	@AfterTest
	public void maiCloseURL() {
		Main_Base mai = new Main_Base();	
		mai.driver.quit();
		
		
	}
	
	
}
