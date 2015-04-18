package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDebtAboutYouPage extends SeleniumPage {
	
	private String expectedTextOnPage = "About you";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By doYouHaveAPartner_Yes = new By.ByXPath(".//*[@id='have_partner-0']");
	private By doYouHaveAPartner_No= new By.ByXPath(".//*[@id='have_partner-1']");
	
	private By areYouInDisputeWithYourPartner_Yes = new By.ByXPath(".//*[@id='in_dispute-0']");
	private By areYouInDisputeWithYourPartner_No = new By.ByXPath(".//*[@id='in_dispute-1']");
	
	private By doYouReceiveBenefits_Yes = new By.ByXPath(".//*[@id='on_benefits-0']");
	private By doYouReceiveBenefits_No = new By.ByXPath(".//*[@id='on_benefits-1']");
	
	private By doYouHaveChildrenAged15OrUnder_Yes = new By.ByXPath(".//*[@id='have_children-0']");
	private By doYouHaveChildrenAged15OrUnder_No = new By.ByXPath(".//*[@id='have_children-1']");
	
	private By howManyChildren = new  By.ByXPath(".//*[@id='num_children']");
	
	
	private By haveDependentChildrenOver16_Yes = new By.ByXPath(".//*[@id='have_dependants-0']");
	private By haveDependentChildrenOver16_No = new By.ByXPath(".//*[@id='have_dependants-1']");
	
	private By howManyDependentChildrenOver16 = new  By.ByXPath(".//*[@id='num_dependants']");
	
	private By doYouOwnAProperty_Yes = new By.ByXPath(".//*[@id='own_property-0']");
	private By doYouOwnAProperty_No = new By.ByXPath(".//*[@id='own_property-1']");
	
	private By areYouEmployed_Yes = new By.ByXPath(".//*[@id='is_employed-0']");
	private By areYouEmployed_No = new By.ByXPath(".//*[@id='is_employed-1']");
	
	private By areYouSelfEmployed_Yes = new By.ByXPath(".//*[@id='is_self_employed-0']");
	private By areYouSelfEmployed_No = new By.ByXPath(".//*[@id='is_self_employed-1']");
	
	private By areYouOrYourPartnerOver60_Yes = new By.ByXPath(".//*[@id='aged_60_or_over-0']");
	private By areYouOrYourPartnerOver60_No = new By.ByXPath(".//*[@id='aged_60_or_over-1']");
	
	private By doYouHaveSavingsOrInvestments_Yes = new By.ByXPath(".//*[@id='have_savings-0']");
	private By doYouHaveSavingsOrInvestments_No = new By.ByXPath(".//*[@id='have_savings-1']");
	
	private By doYouValuablesWorthOver500PoundsEach_Yes = new By.ByXPath(".//*[@id='have_valuables-0']");
	private By doYouValuablesWorthOver500PoundsEach_No = new By.ByXPath(".//*[@id='have_valuables-1']");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	private By continueButton = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p/button");
	
	
	public void clickDoYouHaveAPartner_Yes() throws Exception{
		click(doYouHaveAPartner_Yes);
	}
	
	public void clickDoYouHaveAPartner_No() throws Exception{
		click(doYouHaveAPartner_No);
	}
	
	public void clickareYouInDisputeWithYourPartner_Yes() throws Exception{
		click(areYouInDisputeWithYourPartner_Yes);
	}
	
	public void clickareYouInDisputeWithYourPartner_No() throws Exception{
		click(areYouInDisputeWithYourPartner_No);
	}
	
	public void clickDoYouReceiveBenefits_Yes() throws Exception{
		click(doYouReceiveBenefits_Yes);
	}
	
	public void clickDoYouReceiveBenefits_No() throws Exception{
		click(doYouReceiveBenefits_No);
	}
	
	public void clickDoYouHaveChildren_Yes() throws Exception{
		click(doYouHaveChildrenAged15OrUnder_Yes);
	}
	
	public void clickDoYouHaveChildren_No() throws Exception{
		click(doYouHaveChildrenAged15OrUnder_No);
	}
	
	public void setHowManyChildrenUnder15(String numberOfChildren) throws Exception{
		Thread.sleep(1000);
		setText(howManyChildren,numberOfChildren);
	}
	
	public void clickHaveDependentChildrenOver16_Yes() throws Exception{
		click(haveDependentChildrenOver16_Yes);
	}
	
	public void clickHaveDependentChildrenOver16_No() throws Exception{
		click(haveDependentChildrenOver16_No);
	}
	
	public void setHowManyDependentChildrenOver16(String numberOfChildren) throws Exception{
		Thread.sleep(1000);
		setText(howManyDependentChildrenOver16,numberOfChildren);
	}
	
	public void clickDoYouOwnAProperty_Yes() throws Exception{
		click(doYouOwnAProperty_Yes);
	}
	
	public void clickDoYouOwnAProperty_No() throws Exception{
		click(doYouOwnAProperty_No);
	}
	
	public void clickAreYouSelfEmployed_Yes() throws Exception{
		click(areYouSelfEmployed_Yes);
	}
	
	public void clickAreYouSelfEmployed_No() throws Exception{
		click(areYouSelfEmployed_No);
	}
	
	public void clickAreYouEmployed_Yes() throws Exception{
		click(areYouEmployed_Yes);
	}
	
	public void clickAreYouEmployed_No() throws Exception{
		click(areYouEmployed_No);
	}
	
	public void clickAreYouOrYourPartnerOver60_Yes() throws Exception{
		click(areYouOrYourPartnerOver60_Yes);
	}
	
	public void clickAreYouOrYourPartnerOver60_No() throws Exception{
		click(areYouOrYourPartnerOver60_No);
	}
	
	public void clickDoYouHaveSavingsOrInvestments_Yes() throws Exception{
		click(doYouHaveSavingsOrInvestments_Yes);
	}
	
	public void clickDoYouHaveSavingsOrInvestments_No() throws Exception{
		click(doYouHaveSavingsOrInvestments_No);
	}
	
	public void clickDoYouValuablesWorthOver500PoundsEach_Yes() throws Exception{
		click(doYouValuablesWorthOver500PoundsEach_Yes);
	}
	
	public void clickDoYouValuablesWorthOver500PoundsEach_No() throws Exception{
		click(doYouValuablesWorthOver500PoundsEach_No);
	}
	
	public void clickGetInTouch() throws Exception{
		click(getInTouchLink);
	}
	
	public void clickcontinue() throws Exception{
		click(continueButton);
	}
	
	public CLA_WebDebtAboutYouPage(WebDriver driver) {
		super(driver);
	}
	

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}
