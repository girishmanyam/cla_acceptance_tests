package uk.gov.justice.digital.cla.web.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class WelfareBenefitsSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public WelfareBenefitsSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@Then("^I should be redirected to the welfare what do you need help with page$")
	public void i_should_be_redirected_to_the_welfare_what_do_you_need_help_with_page()
			throws Throwable {
		assertTrue(PageFactory
				.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
				.verifyOnPage());
	}

	@When("^I click benefits appeal$")
	public void i_click_benefits_appeal() throws Throwable {
		PageFactory.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
				.clickBenefitsAppeal();
	}

	@When("^I click a point of law in an higher tribunal$")
	public void i_click_a_point_of_law_in_an_higher_tribunal() throws Throwable {
		PageFactory.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
				.clickOnAPointOflawInTheUpperTribunal();
	}

	@When("^I click a point of law in first-tier tribunal$")
	public void i_click_a_point_of_law_in_first_tier_tribunal()
			throws Throwable {
		PageFactory.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
				.clickInTheFirstTierTribunal();
	}

	@When("^I click permission for appeal refused$")
	public void i_click_permission_for_appeal_refused() throws Throwable {
		PageFactory.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
				.clickPermissionForAppealRefused();
	}

	@When("^I click \\(welfare benefits\\) discrimination$")
	public void i_click_welfare_benefits_discrimination() throws Throwable {
		PageFactory.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
				.clickDiscrimination();

	}

	@When("^I click \\(welfare benefit\\) other$")
	public void i_click_welfare_benefit_other() throws Throwable {
		PageFactory.getCLA_WebWelfareBenefitsWhatDoYouNeedHelpWithPage(driver)
		.clickOther();
	}

}
