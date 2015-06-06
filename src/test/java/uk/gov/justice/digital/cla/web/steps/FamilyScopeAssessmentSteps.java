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

	@When("^I click local council involved$")
	public void i_click_local_council_involved() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickYourLocalCouncilInvolved();
	}

	@When("^I click yes council trying to take children into care$")
	public void i_click_yes_council_trying_to_take_children_into_care()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickTakeYourChildIntoCare_Yes();
	}

	@When("^I click no council trying to take children into care$")
	public void i_click_no_council_trying_to_take_children_into_care()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickTakeYourChildIntoCare_No();
	}

	@When("^I click problem with your ex-partner$")
	public void i_click_problem_with_your_ex_partner() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickAProblemWithYourExPartner();
	}

	@When("^I click disputes over children$")
	public void i_click_disputes_over_children() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDisputesOverChildren();
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

	@When("^I click divorce separation or dissolution$")
	public void i_click_divorce_separation_or_dissolution() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDivorceSeparationOrDissolution();
	}

	@When("^I click ex-partner disputes over children$")
	public void i_click_ex_partner_disputes_over_children() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickExpartnerDisputesOverChildren();
	}

	@When("^I click financial settlement$")
	public void i_click_financial_settlement() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickFinancialSettlement();
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

	@When("^I click problem expartner and you are under (\\d+)$")
	public void i_click_problem_expartner_and_you_are_under(int arg1)
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickExPartnerAndUnder18();
	}

	@When("^I click problem expartner and any other problem$")
	public void i_click_problem_expartner_and_any_other_problem()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickexPartnerAndAnyOtherProblem();
	}

	@When("^I click domestic abuse$")
	public void i_click_domestic_abuse() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuse();
	}

	@When("^I click yes risk of harm$")
	public void i_click_yes_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickAtRiskOfHarm_Yes();
	}

	@When("^I click no risk of harm$")
	public void i_click_no_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickAtRiskOfHarm_No();
	}

	@When("^I click ex-partner family mediation$")
	public void i_click_ex_partner_family_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickExPartnerFamilyMediation();
	}

	@When("^I click yes family mediation started$")
	public void i_click_yes_family_mediation_started() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickFamilyMediationStart_Yes();
	}

	@When("^I click no family mediation started$")
	public void i_click_no_family_mediation_started() throws Throwable {
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

	@When("^I click problem expartner disputes over children and you are under (\\d+)$")
	public void i_click_problem_expartner_disputes_over_children_and_you_are_under(
			int arg1) throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickExPartnerDisputeOverChildrenAndUnder18();
	}

	@When("^I click problem expartner disputes over children and any other problem$")
	public void i_click_problem_expartner_disputes_over_children_and_any_other_problem()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickExPartnerDisputeOverChildrenAndAnyOtherProblem();
	}

	@When("^I click yes ex-partner disputes over children risk of harm$")
	public void i_click_yes_ex_partner_disputes_over_children_risk_of_harm()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenAtRiskOfHarm_Yes();
	}

	@When("^I click no ex-partner disputes over children risk of harm$")
	public void i_click_no_ex_partner_disputes_over_children_risk_of_harm()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver).clickExPartnerDisputeOverChildrenAtRiskOfHarm_No();
	}

}
