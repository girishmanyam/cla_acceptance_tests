package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

public class CLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage extends CLA_WebWhatDoYouNeedHelpWithPage{

	public CLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	private By wantAdviceOnSeekingAsylum = new By.ByXPath(xpath_Option_1);
    private By seekingAccommodation = new By.ByXPath(xpath_Option_2);
	private By youAreLosingYourAccomodationAsUKVIIsRefusingSupport = new By.ByXPath(xpath_Option_3);
	private By youAreAVictimOfDomesticViolence = new By.ByXPath(xpath_Option_4);
	private By immigrationAndAsylumAnyOtherProblem = new By.ByXPath(xpath_Option_5);
	   private By youAreBeingDetainedUnderImmigrationPowers = new By.ByXPath(xpath_Option_1);
	   private By youAreAVictimOfHumanTrafficking = new By.ByXPath(xpath_Option_2);	
	   private By yourTravelDocumentsHaveBeenRetained = new By.ByXPath(xpath_Option_3);
	   private By underProceedingsOfTheSpecialImmigrationAppeal = new By.ByXPath(xpath_Option_4);
	   private By underATerrorismPreventionAndInvestigationNotice = new By.ByXPath(xpath_Option_5); 
	   private By anyOtherImmigrationProblem = new By.ByXPath(xpath_Option_5);  
	
	public void clickImmigrationAndAsylumAnyOtherProblem() throws Exception{
		click(immigrationAndAsylumAnyOtherProblem);
	}
	
	public void clickYouAreLosingYourAccomodationAsUKVIIsRefusingSupport() throws Exception{
		click(youAreLosingYourAccomodationAsUKVIIsRefusingSupport);
	}
	
	public void clickYouAreAVictimOfHumanTraffickingOrModernSalvery() throws Exception{
		click(youAreAVictimOfHumanTrafficking);
	}
	
	public void clickWantAdviceOnSeekingAsylum() throws Exception{
		click(wantAdviceOnSeekingAsylum);
	}

	public void clickAsylumSeekerWantingAccommodation() throws Exception {
		click(seekingAccommodation);
		
	}

	public void clickVictimOfDomesticViolence() throws Exception {
		click(youAreAVictimOfDomesticViolence);
		
	}

	public void clickNotInImmediateHarm() throws Exception {
		click(new By.ByXPath(xpath_Option_2));
		
	}
	
	public void clickYouAreBeingDetainedUnderImmigrationPowers() throws Exception {
		click( youAreBeingDetainedUnderImmigrationPowers);
	}
	
	public void clickYourTravelDocumentsHaveBeenRetained() throws Exception {
		click(yourTravelDocumentsHaveBeenRetained);
	}
	
	public void clickUnderProceedingsOfTheSpecialImmigrationAppeal() throws Exception {
		click( underProceedingsOfTheSpecialImmigrationAppeal );
	}
	
	public void clickUnderATerrorismPreventionAndInvestigationNotice() throws Exception {
		click( underATerrorismPreventionAndInvestigationNotice );
	}
	
	public void clickAnyOtherImmigrationProblem() throws Exception {
		click(anyOtherImmigrationProblem);
	}

}
