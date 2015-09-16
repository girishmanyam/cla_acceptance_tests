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

public class DVScopeAssessmentSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public DVScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^I click domestic violence$")
	public void i_click_domestic_violence() throws Throwable {
	    PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickDomesticViolence();
	}

	@Then("^I click yes I or my child is in immediate danger$")
	public void i_click_yes_I_or_my_child_is_in_immediate_danger() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickInImmediateDanger_Yes();
	}

	@Then("^I click no I or my child is in immediate danger$")
	public void i_click_no_I_or_my_child_is_in_immediate_danger() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickInImmediateDanger_No();
	}
	
	
	@When("^I click contesting an injunction$")
	public void i_click_contesting_an_injunction() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickContestingAnInjunction();
	}
	
	@Then("^I click enforcing an injunction$")
	public void i_click_enforcing_an_injunction() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickEnforcingAJunction();
	}
	
	@Then("^I click DV harassment$")
	public void i_click_DV_harassment() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickHarassment();
	}
	
	@When("^I click forced marriage$")
	public void i_click_forced_marriage() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickForcedMarriage();
	}
	
	@Then("^I click female genital mutilation$")
	public void i_click_female_genital_mutilation() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickFemaleGenitalMutilation();
	}
	
	@When("^I click DV any other problem$")
	public void i_click_DV_any_other_problem() throws Throwable {
		PageFactory.getCLAWebDVWhatDoYouNeedHelpWithPage(driver).clickAnyOtherProblem();
	}

}
