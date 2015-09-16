package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonScopeAssessmentSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public CommonScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I click that I own my own home which is at risk$")
	public void i_click_that_I_own_my_own_home_which_is_at_risk() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickOwnMyProperty();
	}

	@Then("^I click YES I am at risk of losing my home$")
	public void i_click_YES_I_am_at_risk_of_losing_my_home() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickAtRiskOfLosingYourHome_Yes();
	}

	@Then("^I click NO I am not at risk of losing my home$")
	public void i_click_NO_I_am_not_at_risk_of_losing_my_home()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickAtRiskOfLosingYourHome_No();
	}
	
	@Then("^I verify I am on the legal aid is available for this problem page$")
	public void i_verify_I_am_on_the_legal_aid_is_available_for_this_problem_page() throws Throwable {
	    PageFactory.getCLA_WebLegalAidIsAvailableForThisProblemPage(driver).verifyOnPage();
	}


}
