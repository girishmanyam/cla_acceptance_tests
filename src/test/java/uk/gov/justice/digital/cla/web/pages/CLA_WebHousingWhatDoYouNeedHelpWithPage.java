package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

public class CLA_WebHousingWhatDoYouNeedHelpWithPage extends
		CLA_WebWhatDoYouNeedHelpWithPage {
	
	protected String expectedTextOnPage = "Choose the option that best describes your housing situation";


	public CLA_WebHousingWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickIOwnMyOwnHome() throws Exception{
		click(new By.ByXPath(xpath_Option_1));
	}

	
	public void clickIamInRentedAccommodation() throws Exception {
		click(new By.ByXPath(xpath_Option_2));
		
	}

	public void clickIamBecomingHomeLess() throws Exception {
		click(new By.ByXPath(xpath_Option_1));
		
	}

	public void clickIAmBeingEvicted() throws Exception {
		click(new By.ByXPath(xpath_Option_2));
		
	}

	public void clickIAmLosingMyAccommodation() throws Exception {
		click(new By.ByXPath(xpath_Option_3));
		
	}

	public void clickMyHomeIsInSeriousDisrepair() throws Exception {
		click(new By.ByXPath(xpath_Option_4));
		
	}	
	
	public void clickIAmInSeriousRiskOfHarmOrInjury_Yes() throws Exception {
		click(new By.ByXPath(xpath_Option_1));
		
	}
	
	public void clickIAmInSeriousRiskOfHarmOrInjury_No() throws Exception {
		click(new By.ByXPath(xpath_Option_2));
		
	}
	
	public void clickYouAreHomeLess() throws Exception {
		click(new By.ByXPath(xpath_Option_3));
		
	}

	public void clickIAmALandlordApplingForAnInjunction() throws Exception {
		click(new By.ByXPath(xpath_Option_4));
		
	}

	public void clickAnyOtherHousingProblem() throws Exception {
		click(new By.ByXPath(xpath_Option_5));
		
	}

	public void clickIAmAnAsylumSeekerLookingForAccommodation() throws Exception {
		click(new By.ByXPath(xpath_Option_4));
		
	}



	

}
