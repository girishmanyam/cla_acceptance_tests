package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebStartPage extends SeleniumPage {
	
	private String expectedTextOnPage = "Check if Civil Legal Advice can help you";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By startNowButton = new By.ByXPath(".//*[@id='start']");

	public CLA_WebStartPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickStartNow() throws Exception {
		click(startNowButton);
		
	}

}
