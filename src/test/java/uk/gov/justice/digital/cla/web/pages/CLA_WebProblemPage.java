package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebProblemPage extends SeleniumPage {

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	

	public CLA_WebProblemPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickGetInTouch() throws Exception {
		click(getInTouchLink);
		
	}

	
}
