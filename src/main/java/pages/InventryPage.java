package pages;

import org.openqa.selenium.By;

import base.UtilityClass;
import io.cucumber.java.en.When;

public class InventryPage extends UtilityClass{

	@When("Click on sauce labs onsite addtocart page")
	public void click_on_sauce_labs_onsite_addtocart_page() {
		driver.findElement(By.xpath("(//div[text()='Sauce Labs Onesie']/following::button)[1]")).click();
	}

	@When("Navigate to Cart icon")
	public void navigate_to_cart_icon() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
}
