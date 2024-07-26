package pages;

import org.openqa.selenium.By;

import base.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutPage extends UtilityClass {

	@Given("enter the firstname")
	public void enter_the_firstname() {
		   driver.findElement(By.id("first-name")).sendKeys("manidevan");
	}

	@Given("enter the second name")
	public void enter_the_second_name() {
		   driver.findElement(By.id("last-name")).sendKeys("d");
	}

	@Given("enter the postelcode number")
	public void enter_the_postelcode_number() {
		   driver.findElement(By.id("postal-code")).sendKeys("600045");
	}
	
	@Then("Click on continue button")
	public void click_on_continue_button() {
		driver.findElement(By.id("continue")).click();
	}
}
