package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import base.UtilityClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImple extends UtilityClass{

	@Before
	public void preCondition() {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void postcondition() {
		driver.close();
	}
}
