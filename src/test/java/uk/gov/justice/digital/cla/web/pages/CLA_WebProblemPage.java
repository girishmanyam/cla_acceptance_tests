package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebProblemPage extends SeleniumPage {

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	
	private By clinicalNegligence = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[1]/a");
	private By communityCare      = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[2]/a");
	private By debt               = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[3]/a");
	private By domesticViolence   = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[4]/a");
	private By discrimination     = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[5]/a");
	private By education          = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[6]/a");
	private By employment         = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[7]/a");
	private By family             = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[8]/a");
	private By housing            = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[9]/a");
	private By immigrationAndAsylum = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[10]/a");
	private By mentalHealth         = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[11]/a");
	private By personalInjury       = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[12]/a");
	private By publicLaw            = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[13]/a");
	private By troubleWithThePolice = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[14]/a");
	private By welfareBenefits      = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/ul/li[15]/a");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	private By continueButton = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p/button");
	
	private By immediateDangerGetInTouchLink = new By.ByXPath(".//*[@id='content']/div[2]/article/form/fieldset/div/ul/li[4]/label/div[2]/div/p/a");
	private By parentOfChildTryingToTakeIntoCareGetInTouchLink = new By.ByXPath(".//*[@id='content']/div[2]/article/form/fieldset/div/ul/li[8]/label/div[2]/div/p/a");
	
	public void clickParentOfChildTryingToTakeIntoCareGetInTouch() throws Exception{
		click(parentOfChildTryingToTakeIntoCareGetInTouchLink);
	}
	
	public void clickImmediateDangerGetInTouch() throws Exception{
		click(immediateDangerGetInTouchLink);
	}
	
	public void clickClinicalNegligence() throws Exception{
		waitToGetElement(clinicalNegligence, HTTP_TIMEOUT);
		click(clinicalNegligence);
	}
	
	public void clickCommunityCare() throws Exception{
		click(communityCare);
	}
	
	public void clickDebt() throws Exception{
		click(debt);
	}
	
	public void clickDomesticViolence() throws Exception{
		click(domesticViolence);
	}
	
	public void clickDiscrimination() throws Exception{
		click(discrimination);
	}
	
	public void clickEducation() throws Exception{
		click(education);
	}	
	
	public void clickEmployment() throws Exception{
		click(employment);
	}	
	
	public void clickFamily() throws Exception{
		click(family);
	}
	
	public void clickHousing() throws Exception{
		click(housing);
	}
	
	public void clickImmigrationAndAsylum() throws Exception{
		click(immigrationAndAsylum);
	}
	
	public void clickMentalHealth() throws Exception{
		click(mentalHealth);
	}
	
	public void clickPersonalInjury() throws Exception{
		click(personalInjury);
	}
	
	public void clickPublicLaw() throws Exception{
		click(publicLaw);
	}
	
	public void clickTroubleWithThePolice() throws Exception{
		click(troubleWithThePolice);
	}
	
	public void clickWelfareBenefits() throws Exception{
		click(welfareBenefits);
	}
						
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
	
	public void clickContinueButton() throws Exception{
		click(continueButton);
	}

	
}
