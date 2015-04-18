package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CLA_WebImmigrationAndAsylumFindALegalAdvisorPage extends CLA_WebFindALegalAdvisorPage {
	
	private String expectedTextOnPage = "Civil Legal Advice doesn’t provide advice on issues related to immigration and asylum";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/p[1]");
	

	public CLA_WebImmigrationAndAsylumFindALegalAdvisorPage(WebDriver driver) {
		super(driver);
	}
	

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
