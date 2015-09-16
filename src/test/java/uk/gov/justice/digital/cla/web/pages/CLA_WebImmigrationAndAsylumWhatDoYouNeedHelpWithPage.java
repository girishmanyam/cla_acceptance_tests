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
	private By youAreAVictimOfHumanTraffickingOrModernSlavery = new By.ByXPath(xpath_Option_5);
	private By immigrationAndAsylumAnyOtherProblem = new By.ByXPath(xpath_Option_6);
	
	public void clickImmigrationAndAsylumAnyOtherProblem() throws Exception{
		click(immigrationAndAsylumAnyOtherProblem);
	}
	
	public void clickYouAreLosingYourAccomodationAsUKVIIsRefusingSupport() throws Exception{
		click(youAreLosingYourAccomodationAsUKVIIsRefusingSupport);
	}
	
	public void clickYouAreAVictimOfHumanTraffickingOrModernSalvery() throws Exception{
		click(youAreAVictimOfHumanTraffickingOrModernSlavery);
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

}
