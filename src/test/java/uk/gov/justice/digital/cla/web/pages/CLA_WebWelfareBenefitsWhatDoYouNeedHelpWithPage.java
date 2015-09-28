package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;


public class CLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage extends CLA_WebWhatDoYouNeedHelpWithPage {
	
	private String expectedTextOnPage = "What is your benefits problem about?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By benefitsAppeal = new By.ByXPath(xpath_Option_1);
	private By onAPointOflawInTheUpperTribunal = new By.ByXPath(xpath_Option_1);
	private By inTheFirstTierTribunal = new By.ByXPath(xpath_Option_2);
	private By permissionForAppealRefused = new By.ByXPath(xpath_Option_2); 
	private By discrimination = new By.ByXPath(xpath_Option_3);
	private By other = new By.ByXPath(xpath_Option_4);
	

	public CLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}


	public void clickBenefitsAppeal() throws Exception {
		click(benefitsAppeal);
		
	}
	
	public void clickOnAPointOflawInTheUpperTribunal() throws Exception {
		click(onAPointOflawInTheUpperTribunal);
	}
	
	public void clickInTheFirstTierTribunal() throws Exception {
		click(inTheFirstTierTribunal);
	}
	
	public void clickPermissionForAppealRefused() throws Exception{
		click(permissionForAppealRefused);
	}
	
	public void clickDiscrimination() throws Exception{
		click(discrimination);
	}
	
	public void clickOther() throws Exception{
		click(other);
	}

}
