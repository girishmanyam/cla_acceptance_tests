package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
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

}
