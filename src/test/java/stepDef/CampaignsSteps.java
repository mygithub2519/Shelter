package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import base.BaseClass;
import io.cucumber.java.en.*;

public class CampaignsSteps extends BaseClass {

	@Given("User opens Campaigns Shelter page {string}")
	public void user_opens_campaigns_shelter_page(String url) {
		setUp();
		driver.get(url);
		Assert.assertEquals("Tell the PM: everyone needs a safe home during lockdown | Campaigns - Shelter England",
				driver.getTitle());
	}

	@When("User fills {string} , {string} , {string} and {string}")
	public void user_fills_the_form(String Firstname, String Lastname, String email, String Postcode)
			throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='edit-submitted-first-name']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@id='edit-submitted-last-name']")).sendKeys(Lastname);
		driver.findElement(By.xpath("//input[@id='edit-submitted-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='edit-submitted-postcode']")).sendKeys(Postcode);
		Thread.sleep(1000);
	}

	@When("User submits the form")
	public void user_submits_the_form() {
		driver.findElement(By.xpath("//input[@id='edit-next']")).click();
	}

	@Then("Tab {string} should open up")
	public void tab_should_open_up(String string) {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='edit-submit']")).isDisplayed());
		tearDown();
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='messages error']")).isDisplayed());
		Thread.sleep(1000);
		tearDown();
	}

}
