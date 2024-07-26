package runner;
	
	
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(features = "src/main/resources/features/Demo.feature",
	                      glue= {"hooks","pages"},monochrome=true,publish=true
	                      )
	public class CucumberRunner extends AbstractTestNGCucumberTests{
		

	}





