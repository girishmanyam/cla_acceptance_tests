package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebYouAndYouPartnersPropertyPage extends CLA_WebYourPropertyPage {

	public CLA_WebYouAndYouPartnersPropertyPage(WebDriver driver) {
		super(driver);
	}

	private String expectedTextOnPage = "You and your partner’s property";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	
	
}
