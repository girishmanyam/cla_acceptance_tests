package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import uk.gov.justice.digital.cla.factories.PageFactory;

public class DebtAboutYouPageSteps {
	
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public DebtAboutYouPageSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I say NO I do not have a partner$")
	public void i_say_NO_I_do_not_have_a_partner() throws Throwable {
	    PageFactory.getCLAWebAboutYouPage(driver).clickDoYouHaveAPartner_No();
	}

	@When("^I say YES I have a partner$")
	public void i_say_YES_I_have_a_partner() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouHaveAPartner_Yes();
	}

	@When("^I say YES I am in dispute with my partner$")
	public void i_say_YES_I_am_in_dispute_with_my_partner() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickareYouInDisputeWithYourPartner_Yes();
	}

	@When("^I say NO I am not in dispute with my partner$")
	public void i_say_NO_I_am_not_in_dispute_with_my_partner() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickareYouInDisputeWithYourPartner_No();
	}

	@When("^I say YES I receive benefits$")
	public void i_say_YES_I_receive_benefits() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouReceiveBenefits_Yes();
	}

	@When("^I say NO I do not receive benefits$")
	public void i_say_NO_I_do_not_receive_benefits() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouReceiveBenefits_No();
	}

	@When("^I say YES I have children aged (\\d+) or under$")
	public void i_say_YES_I_have_children_aged_or_under(int numberOfChildren) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouHaveChildren_Yes();
	}

	@When("^I say NO I have no children aged (\\d+) or under$")
	public void i_say_NO_I_have_no_children_aged_or_under(int numberOfChildren) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouHaveChildren_No();
	}

	@When("^I say I have (\\d+) children aged (\\d+) or under$")
	public void i_say_I_have_children_aged_or_under(int numberOfChildren, int arg2) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).setHowManyChildrenUnder15( Integer.toString(numberOfChildren) );
	}

	@When("^I say YES I have children aged (\\d+) or over$")
	public void i_say_YES_I_have_children_aged_or_over(int arg1) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickHaveDependentChildrenOver16_Yes();
	}

	@When("^I say NO I have no children aged (\\d+) or over$")
	public void i_say_NO_I_have_no_children_aged_or_over(int arg1) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickHaveDependentChildrenOver16_No();
	}

	@When("^I say I have (\\d+) children aged (\\d+) or over$")
	public void i_say_I_have_children_aged_or_over(int numberOfChildren, int arg2) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).setHowManyDependentChildrenOver16( Integer.toString(numberOfChildren) );

	}

	@When("^I say YES I have property$")
	public void i_say_YES_I_have_property() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouOwnAProperty_Yes();
	}

	@When("^I say NO I do not have property$")
	public void i_say_NO_I_do_not_have_property() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouOwnAProperty_No();
	}

	@When("^I say YES I am employed$")
	public void i_say_YES_I_am_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickAreYouEmployed_Yes();
	}

	@When("^I say NO I am not employed$")
	public void i_say_NO_I_am_not_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickAreYouEmployed_No();
	}

	@When("^I say YES I am self-employed$")
	public void i_say_YES_I_am_self_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickAreYouSelfEmployed_Yes();
	}

	@When("^I say NO I am not self-employed$")
	public void i_say_NO_I_am_not_self_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickAreYouSelfEmployed_No();
	}

	@When("^I say YES I or my partner is over (\\d+)$")
	public void i_say_YES_I_or_my_partner_is_over(int arg1) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickAreYouOrYourPartnerOver60_Yes();
	}

	@When("^I say NO I or my partner is over (\\d+)$")
	public void i_say_NO_I_or_my_partner_is_under(int arg1) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickAreYouOrYourPartnerOver60_No();
	}

	@When("^I say YES I have savings or investments$")
	public void i_say_YES_I_have_savings_or_investments() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouHaveSavingsOrInvestments_Yes();
	}

	@When("^I say NO I have no savings or investments$")
	public void i_say_NO_I_have_no_savings_or_investments() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouHaveSavingsOrInvestments_No();
	}

	@When("^I say YES I have valuables worth over (\\d+)$")
	public void i_say_YES_I_have_valuables_worth_over(int arg1) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouValuablesWorthOver500PoundsEach_Yes();
	}

	@When("^I say NO I don't have valuables worth over (\\d+)$")
	public void i_say_NO_I_don_t_have_valuables_worth_over(int arg1) throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickDoYouValuablesWorthOver500PoundsEach_No();
	}

	@When("^I select to get in touch$")
	public void i_select_to_get_in_touch() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickGetInTouch();
	}
	
	@Then("^I verify I am on the about me page$")
	public void i_verify_I_am_on_the_about_me_page() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).verifyOnPage();
	}
	
	@Then("^I say YES my partner is employed$")
	public void i_say_YES_my_partner_is_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickIsYourPartnerEmployed_Yes();
	}

	@Then("^I say NO my partner is not employed$")
	public void i_say_NO_my_partner_is_not_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickIsYourPartnerEmployed_No();
	}

	@Then("^I say YES my partner is self-employed$")
	public void i_say_YES_my_partner_is_self_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickIsYourPartnerSelfEmployed_Yes();
	}

	@Then("^I say NO my partner is not self-employed$")
	public void i_say_NO_my_partner_is_not_self_employed() throws Throwable {
		PageFactory.getCLAWebAboutYouPage(driver).clickIsYourPartnerSelfEmployed_No();
	}
	
	@Then("^I verify I am on you and your partners property page$")
	public void i_verify_I_am_on_you_and_your_partners_property_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebYouAndYouPartnersPropertyPage(driver).verifyOnPage());
	}

}
