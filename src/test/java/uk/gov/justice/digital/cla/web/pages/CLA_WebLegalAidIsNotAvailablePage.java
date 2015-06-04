package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebLegalAidIsNotAvailablePage extends SeleniumPage {
	
	private String expectedTextOnPage = "Legal aid is not usually available for this type of problem";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	public CLA_WebLegalAidIsNotAvailablePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
