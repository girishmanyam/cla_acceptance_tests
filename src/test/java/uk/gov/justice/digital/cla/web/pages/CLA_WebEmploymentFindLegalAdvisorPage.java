package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CLA_WebEmploymentFindLegalAdvisorPage extends CLA_WebFindALegalAdvisorPage {
	
	private String expectedTextOnPage = "You can still seek advice from a legal adviser - you will have to pay for this advice.";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/p[1]");
	
	public CLA_WebEmploymentFindLegalAdvisorPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
