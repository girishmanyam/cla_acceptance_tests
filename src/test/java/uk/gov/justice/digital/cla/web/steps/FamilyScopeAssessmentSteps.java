package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

import static org.junit.Assert.assertTrue;

public class FamilyScopeAssessmentSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public FamilyScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^I am redirected to the family what do you need help with page$")
	public void i_am_redirected_to_the_family_what_do_you_need_help_with_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).verifyOnPage());
	}

	@When("^I click \\(family\\) local council involved$")
	public void i_click_family_local_council_involved() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickYourLocalCouncilInvolved();
	}

	@When("^I click yes \\(family\\) council trying to take children into care$")
	public void i_click_yes_family_council_trying_to_take_children_into_care() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickTakeYourChildIntoCare_Yes();
	}

	@When("^I click no \\(family\\) council trying to take children into care$")
	public void i_click_no_family_council_trying_to_take_children_into_care() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickTakeYourChildIntoCare_No();
	}

	
	@When("^I click \\(family\\) problem with your ex-partner$")
	public void i_click_family_problem_with_your_ex_partner() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickAProblemWithYourExPartner();
	}

	@When("^I click \\(family\\) divorce separation or dissolution$")
	public void i_click_family_divorce_separation_or_dissolution() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickDivorceSeparationOrDissolution();
	}


	@When("^I click disputes over children$")
	public void i_click_disputes_over_children() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDisputesOverChildren();
	}
	
	
	@When("^I click \\(family\\) ex-partner disputes over children$")
	public void i_click_family_ex_partner_disputes_over_children() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickExpartnerDisputesOverChildren();
	}



	@When("^I click child abduction$")
	public void i_click_child_abduction() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickChildAbduction();
	}

	@When("^I click family any other problem$")
	public void i_click_family_any_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickFamilyAnyOtherProblem();
	}


	@When("^I click financial settlement$")
	public void i_click_financial_settlement() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickexPartnerFinancialSettlement();
	}

	@When("^I click domestic violence or harassment$")
	public void i_click_domestic_violence_or_harassment() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticViolenceOrHarrassment();
	}

	@When("^I click family mediation$")
	public void i_click_family_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickFamilyMediation();
	}

	@When("^I click ex-partner any other problem$")
	public void i_click_ex_partner_any_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickExpartnerAnyOtherProblem();
	}

	@When("^I click \\(family\\) problem expartner and you are under (\\d+)$")
	public void i_click_family_problem_expartner_and_you_are_under(int arg1) throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickExPartnerAndUnder18();
	}

	@When("^I click \\(family\\) problem expartner and any other problem$")
	public void i_click_family_problem_expartner_and_any_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickExPartnerAndAnyOtherProblem();
	}
	
	
	@When("^I click \\(family\\) domestic abuse$")
	public void i_click_family_domestic_abuse() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickDomesticAbuse();
	}

	@When("^I click yes \\(family\\) risk of harm$")
	public void i_click_yes_family_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickAtRiskOfHarm_Yes();
	}

	@When("^I click no \\(family\\) risk of harm$")
	public void i_click_no_family_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickAtRiskOfHarm_No();
	}

	@When("^I click \\(family\\) ex-partner family mediation$")
	public void i_click_family_ex_partner_family_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickExPartnerFamilyMediation();
	}

	@When("^I click \\(family\\) yes family mediation started$")
	public void i_click_family_yes_family_mediation_started() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyMediationStart_Yes();
	}

	@When("^I click \\(family\\) no family mediation started$")
	public void i_click_family_no_family_mediation_started() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyMediationStart_No();
	}

	@Then("^I verify I am on the you maybe able to get legal aid for family mediation page$")
	public void i_verify_I_am_on_the_you_maybe_able_to_get_legal_aid_for_family_mediation_page()
			throws Throwable {
		assertTrue(PageFactory
				.getCLAWebYouMayBeAbleToGetLegalAidForFamilyMediationPage(
						driver).verifyOnPage());
	}
	
	@When("^I click \\(family\\) problem expartner disputes over children and you are under (\\d+)$")
	public void i_click_family_problem_expartner_disputes_over_children_and_you_are_under(int arg1) throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickExPartnerDisputeOverChildrenAndUnder18();
	}

	@When("^I click \\(family\\) problem expartner disputes over children and any other problem$")
	public void i_click_family_problem_expartner_disputes_over_children_and_any_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickExPartnerDisputeOverChildrenAndAnyOtherProblem();
	}
	

	@When("^I click \\(family\\) yes ex-partner disputes over children risk of harm$")
	public void i_click_family_yes_ex_partner_disputes_over_children_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenAtRiskOfHarm_Yes();

	}

	@When("^I click \\(family\\) no ex-partner disputes over children risk of harm$")
	public void i_click_family_no_ex_partner_disputes_over_children_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenAtRiskOfHarm_No();
	}
	
	@When("^I click \\(family\\) ex-partner disputes over children child abduction$")
	public void i_click_family_ex_partner_disputes_over_children_child_abduction() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenChildAbduction();
	}

	@When("^I click \\(family\\) ex-partner disputes over children child abduction you have been accused of abducting a child$")
	public void i_click_family_ex_partner_disputes_over_children_child_abduction_you_have_been_accused_of_abducting_a_child() throws Throwable {
	    PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted();
	}

	@When("^I click \\(family\\) ex-partner disputes over children child abduction you are seeking an order to prevent the removal of a child$")
	public void i_click_family_ex_partner_disputes_over_children_child_abduction_you_are_seeking_an_order_to_prevent_the_removal_of_a_child() throws Throwable {
	    PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild();
	}

	@When("^I click \\(family\\) ex-partner disputes over children child abduction none of the above$")
	public void i_click_family_ex_partner_disputes_over_children_child_abduction_none_of_the_above() throws Throwable {
	    PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove();
	}
	
	@When("^I click \\(family\\) ex-partner disputes over children child abduction your child has been abducted$")
	public void i_click_family_ex_partner_disputes_over_children_child_abduction_your_child_has_been_abducted() throws Throwable {
	   PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted();
	}

	@When("^I click \\(family\\) I am outside Uk yes ex-partner child abducted in the UK$")
	public void i_click_family_I_am_outside_Uk_yes_ex_partner_child_abducted_in_the_UK() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerIAmOutsideUkAbductedchildInUK_Yes();
	}

	@When("^I click \\(family\\) I am outside Uk no ex-partner child abducted in the UK$")
	public void i_click_family_I_am_outside_Uk_no_ex_partner_child_abducted_in_the_UK() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerIAmOutsideUkAbductedchildInUK_No();
	}
	
	@When("^I click \\(family\\) ex-partner disputes over children child abduction you have been accused of child abduction$")
	public void i_click_family_ex_partner_disputes_over_children_child_abduction_you_have_been_accused_of_child_abduction() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenChildAbductionYouHaveBeenAccusedOfChildAbduction();
	}
	
	@When("^I click \\(family\\) ex-partner financial settlement$")
	public void i_click_family_ex_partner_financial_settlement() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickexPartnerFinancialSettlement();
	}

	@When("^I click \\(family\\) ex-partner financial settlement Under (\\d+)$")
	public void i_click_family_ex_partner_financial_settlement_Under(int arg1) throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementYouAreUnder18();
	}

	@When("^I click \\(family\\) ex-partner financial settlement Domestic abuse$")
	public void i_click_family_ex_partner_financial_settlement_Domestic_abuse() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementDomesticAbuse();
	}

	@When("^I click \\(family\\) ex-partner financial settlement Domestic abuse Immediate Risk of harm yes$")
	public void i_click_family_ex_partner_financial_settlement_Domestic_abuse_Immediate_Risk_of_harm_yes() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementDomesticAbuseRiskOfHarm_Yes();
	}

	@When("^I click \\(family\\) ex-partner financial settlement Domestic abuse Immediate Risk of harm no$")
	public void i_click_family_ex_partner_financial_settlement_Domestic_abuse_Immediate_Risk_of_harm_no() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementDomesticAbuseRiskOfHarm_No();
	}
	
	@When("^I click \\(family\\) ex-partner financial settlement International family maintenance$")
	public void i_click_family_ex_partner_financial_settlement_International_family_maintenance() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementInternationalFamilyMaintenance();
	}


	@When("^I click \\(family\\) ex-partner financial settlement any other problem$")
	public void i_click_family_ex_partner_financial_settlement_any_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementAnyOtherProblem();
	}
	
	@When("^I click \\(family\\) ex-partner financial settlement family mediation$")
	public void i_click_family_ex_partner_financial_settlement_family_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementFamilyMediation();
	}

	@When("^I click \\(family\\) ex-partner financial settlement family mediation mediation started yes$")
	public void i_click_family_ex_partner_financial_settlement_family_mediation_mediation_started_yes() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementFamilyMediationStartMediation_Yes();
	}

	@When("^I click \\(family\\) ex-partner financial settlement family mediation mediation started no$")
	public void i_click_family_ex_partner_financial_settlement_family_mediation_mediation_started_no() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerFinancialSettlementFamilyMediationStartMediation_No();
	}
	
	@When("^I click \\(family\\) problem with your ex-partner any other problem$")
	public void i_click_family_problem_with_your_ex_partner_any_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExpartnerAnyOtherProblem();
	}



}
