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

public class EmploymentScopeAssessmentSteps {
	

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public EmploymentScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I select Employment$")
	public void i_select_Employment() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickEmployment();
	}

	@When("^I click employment discrimination$")
	public void i_click_employment_discrimination() throws Throwable {
	    PageFactory.getCLAWebEmploymentWhatDoYouNeedHelpWithPage(driver).clickEmploymentDiscrimination();
	}
	
	@Then("^I verify I am on the You can still seek advice from a legal adviser$")
	public void i_verify_I_am_on_the_You_can_still_seek_advice_from_a_legal_adviser() throws Throwable {
		assertTrue(PageFactory.getCLAWebEmploymentFindLegalAdvisorPage(driver).verifyOnPage());
	}

}
