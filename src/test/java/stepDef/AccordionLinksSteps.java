package stepDef;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseClass;
import io.cucumber.java.en.*;

public class AccordionLinksSteps extends BaseClass {
	List<WebElement> accordions;

	@Given("User opens Shelter FAQs page {string}")
	public void user_opens_shelter_fa_qs_page(String url) {
		setUp();
		driver.get(url);
		WebElement cookiesBox = driver.findElement(By.id("js-cookiebar"));
		WebElement cookiesClose = driver.findElement(By.id("js-cookiebar-close"));
		explicitWait(driver, cookiesBox, 20);
		if (cookiesBox.isDisplayed()) {
			cookiesClose.click();
		}
	}

	@When("User checks all the accordion links")
	public void user_checks_all_the_accordion_links() {
	accordions = driver.findElements(By.xpath("//div[contains(@class, 'block--accordian')]//section"));
		
	}

	@Then("Accordion Links should be expanded and collapsed")
	public void accordion_links_should_be_expanded_and_collapsed() {
		Iterator<WebElement> itr = accordions.iterator();
		while (itr.hasNext()) {
			itr.next().click();
		}
		tearDown();
	}
}
