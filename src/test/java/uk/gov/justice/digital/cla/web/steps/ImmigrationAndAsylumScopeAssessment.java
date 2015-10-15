package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImmigrationAndAsylumScopeAssessment {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ImmigrationAndAsylumScopeAssessment(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^I am redirected to the asylum seeker what do you need help with page$")
	public void i_am_redirected_to_the_asylum_seeker_what_do_you_need_help_with_page() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).verifyOnPage();
	}

	@When("^I click want advice on seeking asylum$")
	public void i_click_want_advice_on_seeking_asylum() throws Throwable {
          PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickWantAdviceOnSeekingAsylum();
	}
	
	@When("^I click you are an asylum seeker looking for accommodation$")
	public void i_click_you_are_an_asylum_seeker_looking_for_accommodation() throws Throwable {
        PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickAsylumSeekerWantingAccommodation();

	}
	
	@When("^I click you are losing your accomodation as UKVI is refusing support$")
	public void i_click_you_are_losing_your_accomodation_as_UKVI_is_refusing_support() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickYouAreLosingYourAccomodationAsUKVIIsRefusingSupport();;
	}
	
	@When("^I click you are a victim of domestic violence$")
	public void i_click_you_are_a_victim_of_domestic_violence() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickVictimOfDomesticViolence();;

	}

	@When("^I click you are a victim of human trafficking or modern slavery$")
	public void i_click_you_are_a_victim_of_human_trafficking_or_modern_slavery() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickYouAreAVictimOfHumanTraffickingOrModernSalvery();
	}
	
	@When("^I click you are being detained under immigration powers$")
	public void i_click_you_are_being_detained_under_immigration_powers() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickYouAreBeingDetainedUnderImmigrationPowers();
	}

	@When("^I click \\(immigration and asylum\\) any other problem$")
	public void i_click_immigration_and_asylum_any_other_problem() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickImmigrationAndAsylumAnyOtherProblem();
	}
	
	@When("^I click NO I am not in immediate risk of harm$")
	public void i_click_NO_I_am_not_in_immediate_risk_of_harm() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickNotInImmediateHarm();
	}
	
	@When("^I click your travel documents have being retained$")
	public void i_click_your_travel_documents_have_being_retained() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickYourTravelDocumentsHaveBeenRetained();
	}

	@When("^I click I am subject to proceedings before the Special Immigration Appeal Commission$")
	public void i_click_I_am_subject_to_proceedings_before_the_Special_Immigration_Appeal_Commission() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickUnderProceedingsOfTheSpecialImmigrationAppeal();
	}
	
	@When("^I click I am under a Terrorism Prevention and Investigation Notice$")
	public void i_click_I_am_under_a_Terrorism_Prevention_and_Investigation_Notice() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickUnderATerrorismPreventionAndInvestigationNotice();
	}
	
	@When("^I click any other immigration problem$")
	public void i_click_any_other_immigration_problem() throws Throwable {
		PageFactory.getCLA_WebImmigrationAndAsylumWhatDoYouNeedHelpWithPage(driver).clickAnyOtherImmigrationProblem();
	}	

}
