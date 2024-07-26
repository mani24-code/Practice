package pages;

import org.openqa.selenium.By;

import base.UtilityClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPage extends UtilityClass{

	@When("Click on checkout the button.")
	public void click_on_checkout_the_button() {
		driver.findElement(By.id("checkout")).click();
	}
}
