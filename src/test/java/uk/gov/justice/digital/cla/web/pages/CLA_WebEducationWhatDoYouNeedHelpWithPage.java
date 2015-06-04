package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebEducationWhatDoYouNeedHelpWithPage  extends SeleniumPage {


	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By childCare = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By specialEducationNeeds = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By educationDiscrimination =new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By educationNoneOfTheAbove = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	
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
