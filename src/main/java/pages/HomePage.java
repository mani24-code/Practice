package pages;

import org.openqa.selenium.By;

import base.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePage extends UtilityClass {

	@When("the user enters username")
	public void the_user_enters_username() {
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("user enter password")
	public void user_enter_password() {
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
 
	@When("the user clicks the login butto")
	public void the_user_clicks_the_login_butto() {
		driver.findElement(By.id("login-button")).click();
	}

}
