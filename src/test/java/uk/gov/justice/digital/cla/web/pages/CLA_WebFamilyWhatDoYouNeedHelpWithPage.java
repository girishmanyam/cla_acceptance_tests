package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebFamilyWhatDoYouNeedHelpWithPage extends SeleniumPage{

	public CLA_WebFamilyWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	private By yourLocalCouncilInvolved = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	
	  private By takeYourChildIntoCare_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	  private By takeYourChildIntoCare_No = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By aProblemWithYourExPartner = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	
	  private By divorceSeparationOrDissolution = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	
	    private By exPartnerAndUnder18 = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	
	    private By domesticAbuse = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	
	       private By atRiskOfHarm_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	       private By atRiskOfHarm_No = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	
   	    private By exPartnerFamilyMediation = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	 
   	       private By familyMediationStart_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	       private By familyMediationStart_No = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	
	    private By exPartnerDivorceAndAnyOtherProblem = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	
	  private By expartnerDisputesOverChildren = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	    private By exPartnerDisputeOverChildrenAndUnder18 = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	    private By exPartnerDisputeOverChildrenDomesticAbuse = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
		
	       private By exPartnerDisputeOverChildrenAtRiskOfHarm_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	       private By exPartnerDisputeOverChildrenAtRiskOfHarm_No = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	    private By exPartnerDisputeOverChildrenAndAnyOtherProblem = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	    private By exPartnerDisputeOverChildrenChildAbduction = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	       private By exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	          private By exPartnerIAmOutsideUkAbductedchildInUK_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	          private By exPartnerIAmOutsideUkAbductedchildInUK_No = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
           private By exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	       private By exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By financialSettlement = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By domesticViolenceOrHarrassment = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By familyMediation = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By expartnerAnyOtherProblem = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	
	
	private By disputesOverChildren = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By childAbduction = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By familyAnyOtherProblem = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[5]/a");


	public void clickExPartnerIAmOutsideUkAbductedchildInUK_No() throws Exception{
		click(exPartnerIAmOutsideUkAbductedchildInUK_No);
	}
	
	public void clickExPartnerIAmOutsideUkAbductedchildInUK_Yes() throws Exception{
		click(exPartnerIAmOutsideUkAbductedchildInUK_Yes);
	}
	
	public void ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove() throws Exception {
		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove);	
	}

	
	public void ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild() 
	throws Exception{
		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild);		
	}

	public void ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted() throws Exception{
		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted);
		
	}	
	
	public void clickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted() throws Exception{
		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted);
	}
	
	public void clickExPartnerDisputeOverChildrenChildAbduction() throws Exception{
		click(exPartnerDisputeOverChildrenChildAbduction);
	}
	
	public void clickExPartnerDisputeOverChildrenAtRiskOfHarm_Yes() throws Exception{
		click(exPartnerDisputeOverChildrenAtRiskOfHarm_Yes);
	}
	
	public void clickExPartnerDisputeOverChildrenAtRiskOfHarm_No() throws Exception{
		click(exPartnerDisputeOverChildrenAtRiskOfHarm_No);
	}
	
	public void clickExPartnerDisputeOverChildrenDomesticAbuse() throws Exception{
		click(exPartnerDisputeOverChildrenDomesticAbuse);
	}
	
	public void clickExPartnerDisputeOverChildrenAndAnyOtherProblem() throws Exception{
		click(exPartnerDisputeOverChildrenAndAnyOtherProblem);
	}
	
	public void clickExPartnerDisputeOverChildrenAndUnder18() throws Exception{
		click(exPartnerDisputeOverChildrenAndUnder18);
	}
	
	public void clickFamilyMediationStart_No() throws Exception{
		click(familyMediationStart_No);
	}
	
	public void clickFamilyMediationStart_Yes() throws Exception{
		click(familyMediationStart_Yes);
	}
	
    public void clickAtRiskOfHarm_No() throws Exception{
	   click(atRiskOfHarm_No);
    }
    
	public void clickAtRiskOfHarm_Yes() throws Exception{
		click(atRiskOfHarm_Yes);
	}
	
	public void clickexPartnerAndAnyOtherProblem() throws Exception{
		click(exPartnerDivorceAndAnyOtherProblem);
	}
	
	
	public void clickExPartnerFamilyMediation() throws Exception{
		click(exPartnerFamilyMediation);
	}
	
	
	public void clickDomesticAbuse() throws Exception{
		click(domesticAbuse);
	}
	
	public void clickExPartnerAndUnder18() throws Exception{
		click(exPartnerAndUnder18);
	}
	
	public void clickExpartnerAnyOtherProblem() throws Exception{
		click(expartnerAnyOtherProblem);
	}
	
	public void clickFamilyMediation() throws Exception{
		click(familyMediation);
	}
	
    public void clickDomesticViolenceOrHarrassment() throws Exception{
    	click(domesticViolenceOrHarrassment);
    }
	
	public void clickFinancialSettlement() throws Exception{
		click(financialSettlement);
	}
	
	public void clickExpartnerDisputesOverChildren() throws Exception{
		click(expartnerDisputesOverChildren);
	}
	
	public void clickDivorceSeparationOrDissolution() throws Exception{
		click(divorceSeparationOrDissolution);
	}
	
	public void clickAProblemWithYourExPartner() throws Exception{
		click(aProblemWithYourExPartner);
	}
	
	public void clickDisputesOverChildren() throws Exception{
		click(disputesOverChildren);
	}
	
	public void clickChildAbduction() throws Exception{
		click(childAbduction);
	}
	
	public void clickFamilyAnyOtherProblem() throws Exception{
		click(familyAnyOtherProblem);
	}
	
	public void clickYourLocalCouncilInvolved() throws Exception{
		click(yourLocalCouncilInvolved);
	}
	
	public void clickTakeYourChildIntoCare_Yes() throws Exception{
		click(takeYourChildIntoCare_Yes);
	}
	
	public void clickTakeYourChildIntoCare_No() throws Exception{
		click(takeYourChildIntoCare_No);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}




}
