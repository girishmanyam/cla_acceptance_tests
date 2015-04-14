package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebConfirmationPage extends SeleniumPage {


	private String expectedTextOnPage = "Your details have been submitted";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/header/h1");
	

	public CLA_WebConfirmationPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	
	
}
