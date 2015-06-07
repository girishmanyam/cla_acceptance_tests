package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDiscriminationWhatDoYouNeedHelpWithPage extends SeleniumPage {
	
	public CLA_WebDiscriminationWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
	


}
