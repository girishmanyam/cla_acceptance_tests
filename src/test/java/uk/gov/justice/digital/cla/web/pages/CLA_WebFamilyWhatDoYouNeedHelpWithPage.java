package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebFamilyWhatDoYouNeedHelpWithPage extends CLA_WebWhatDoYouNeedHelpWithPage {

	public CLA_WebFamilyWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	private By yourLocalCouncilInvolved = new By.ByXPath(xpath_Option_1);
	
	  private By takeYourChildIntoCare_Yes = new By.ByXPath(xpath_Option_1);
	  private By takeYourChildIntoCare_No = new By.ByXPath(xpath_Option_2);

	private By aProblemWithYourExPartner = new By.ByXPath(xpath_Option_2);
	
	  private By divorceSeparationOrDissolution = new By.ByXPath(xpath_Option_1);
	
	    private By exPartnerAndUnder18 = new By.ByXPath(xpath_Option_1);
	
	    private By domesticAbuse = new By.ByXPath(xpath_Option_2);
	
	       private By atRiskOfHarm_Yes = new By.ByXPath(xpath_Option_1);
	       private By atRiskOfHarm_No = new By.ByXPath(xpath_Option_2);
	
   	    private By exPartnerFamilyMediation = new By.ByXPath(xpath_Option_3);
	 
   	       private By familyMediationStart_Yes = new By.ByXPath(xpath_Option_1);
	       private By familyMediationStart_No = new By.ByXPath(xpath_Option_2);
	
	    private By exPartnerDivorceAndAnyOtherProblem = new By.ByXPath(xpath_Option_4);
	
	  private By expartnerDisputesOverChildren = new By.ByXPath(xpath_Option_2);

	    private By exPartnerDisputeOverChildrenAndUnder18 = new By.ByXPath(xpath_Option_1);
	    private By exPartnerDisputeOverChildrenDomesticAbuse = new By.ByXPath(xpath_Option_2);
		
	       private By exPartnerDisputeOverChildrenAtRiskOfHarm_Yes = new By.ByXPath(xpath_Option_1);
	       private By exPartnerDisputeOverChildrenAtRiskOfHarm_No = new By.ByXPath(xpath_Option_2);

	    private By exPartnerDisputeOverChildrenAndAnyOtherProblem = new By.ByXPath(xpath_Option_5);
	    private By exPartnerDisputeOverChildrenChildAbduction = new By.ByXPath(xpath_Option_3);
	       private By exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted = new By.ByXPath(xpath_Option_1);
	          private By exPartnerIAmOutsideUkAbductedchildInUK_Yes = new By.ByXPath(xpath_Option_1);
	          private By exPartnerIAmOutsideUkAbductedchildInUK_No = new By.ByXPath(xpath_Option_2);
	       private By exPartnerDisputeOverChildrenChildAbductionYouHaveBeenAccusedOfChildAbduction = new By.ByXPath(xpath_Option_2);
	       private By exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild = new By.ByXPath(xpath_Option_3);
	       private By exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove = new By.ByXPath(xpath_Option_4);
	private By exPartnerFinancialSettlement = new By.ByXPath(xpath_Option_3);
	   private By exPartnerFinancialSettlementYouAreUnder18 = new By.ByXPath(xpath_Option_1);
	   private By exPartnerFinancialSettlementDomesticAbuse = new By.ByXPath(xpath_Option_2);
	      private By exPartnerFinancialSettlementDomesticAbuseRiskOfHarm_Yes = new By.ByXPath(xpath_Option_1);
	      private By exPartnerFinancialSettlementDomesticAbuseRiskOfHarm_No = new By.ByXPath(xpath_Option_2);
	   private By exPartnerFinancialSettlementInternationalFamilyMaintenance = new By.ByXPath(xpath_Option_3);
	   private By exPartnerFinancialSettlementFamilyMediation = new By.ByXPath(xpath_Option_4);
	      private By exPartnerFinancialSettlementFamilyMediationStartMediation_Yes = new By.ByXPath(xpath_Option_1);
	      private By exPartnerFinancialSettlementFamilyMediationStartMediation_No = new By.ByXPath(xpath_Option_2);	       
	   private By exPartnerFinancialSettlementAnyOtherProblem = new By.ByXPath(xpath_Option_5);
	private By domesticViolenceOrHarrassment = new By.ByXPath(xpath_Option_4);
	private By familyMediation = new By.ByXPath(xpath_Option_5);
	private By exPartnerAnyOtherProblem = new By.ByXPath(xpath_Option_5);
	
	
	private By disputesOverChildren = new By.ByXPath(xpath_Option_3);
	private By childAbduction = new By.ByXPath(xpath_Option_4);
	private By familyAnyOtherProblem = new By.ByXPath(xpath_Option_5);

	public void clickExPartnerFinancialSettlementAnyOtherProblem() throws Exception{
		click(exPartnerFinancialSettlementAnyOtherProblem);
	}

	public void clickExPartnerFinancialSettlementFamilyMediationStartMediation_No() throws Exception{
		click(exPartnerFinancialSettlementFamilyMediationStartMediation_No);
	}
	
	public void clickExPartnerFinancialSettlementFamilyMediationStartMediation_Yes() throws Exception{
		click(exPartnerFinancialSettlementFamilyMediationStartMediation_Yes);
	}
	
	public void clickExPartnerFinancialSettlementFamilyMediation() throws Exception{
		click(exPartnerFinancialSettlementFamilyMediation);
	}

	public void clickExPartnerFinancialSettlementInternationalFamilyMaintenance() throws Exception{
		click(exPartnerFinancialSettlementInternationalFamilyMaintenance);
	}
	
	public void clickExPartnerFinancialSettlementDomesticAbuseRiskOfHarm_No() throws Exception{
		click(exPartnerFinancialSettlementDomesticAbuseRiskOfHarm_No);
	}
	
	public void clickExPartnerFinancialSettlementDomesticAbuseRiskOfHarm_Yes() throws Exception{
		click(exPartnerFinancialSettlementDomesticAbuseRiskOfHarm_Yes);
	}
	
	public void clickExPartnerFinancialSettlementDomesticAbuse() throws Exception {
		click(exPartnerFinancialSettlementDomesticAbuse);
		
	}
	
	public void clickExPartnerFinancialSettlementYouAreUnder18() throws Exception{
		click(exPartnerFinancialSettlementYouAreUnder18);
	}
	
	public void clickExPartnerDisputeOverChildrenChildAbductionYouHaveBeenAccusedOfChildAbduction() throws Exception{
		click(exPartnerDisputeOverChildrenChildAbductionYouHaveBeenAccusedOfChildAbduction);
	}

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
	
	public void clickExPartnerAndAnyOtherProblem() throws Exception{
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
		click(exPartnerAnyOtherProblem);
	}
	
	public void clickFamilyMediation() throws Exception{
		click(familyMediation);
	}
	
    public void clickDomesticViolenceOrHarrassment() throws Exception{
    	click(domesticViolenceOrHarrassment);
    }
	
	public void clickexPartnerFinancialSettlement() throws Exception{
		click(exPartnerFinancialSettlement);
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
