package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebEducationWhatDoYouNeedHelpWithPage  extends CLA_WebWhatDoYouNeedHelpWithPage {


	private String expectedTextOnPage = "What is your education problem about?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By childCare = new By.ByXPath(xpath_Option_1);
	private By specialEducationNeeds = new By.ByXPath(xpath_Option_2);
	private By educationDiscrimination =new By.ByXPath(xpath_Option_3);
	private By educationNoneOfTheAbove = new By.ByXPath(xpath_Option_4);
	
	public void clickEducationNoneOfTheAbove() throws Exception{
		click(educationNoneOfTheAbove);
	}
	
	public void clickEducationDiscrimination() throws Exception{
		click(educationDiscrimination);
	}
	
	public void clickSpecialEducationNeeds() throws Exception{
		click(specialEducationNeeds);
	}
	
	
	public void clickChildCare() throws Exception{
		click(childCare);
	}
	
	public CLA_WebEducationWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	

}
