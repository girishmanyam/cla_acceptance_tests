package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;


public class CLA_WebEmploymentWhatDoYouNeedHelpWithPage extends CLA_WebWhatDoYouNeedHelpWithPage {
	
	
	
	public CLA_WebEmploymentWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By employmentDiscrimination = new By.ByXPath(xpath_Option_1);
	private By employmentAnyOtherProblem = new By.ByXPath(xpath_Option_2);
	
	public void clickEmploymentDiscrimination() throws Exception{
		click(employmentDiscrimination);
	}
	
	public void clickEmploymentAnyOtherProblem() throws Exception{
		click(employmentAnyOtherProblem);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	
	
	

}
