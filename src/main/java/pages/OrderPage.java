package pages;

import org.openqa.selenium.By;

import base.UtilityClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderPage extends UtilityClass{

	
	
	@Then("to get the order id")
	public void to_get_the_order_id() {
	    String txt=driver.findElement(By.xpath("//div[@class='summary_info']/div[2]")).getText();
	    System.out.println(txt);
	    String replaceAll=txt.replaceAll("[^0,9]", "");
	    System.out.println(replaceAll);
	}
}
