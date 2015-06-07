package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import static org.junit.Assert.assertTrue;

public class DiscriminationScopeDiagnosisSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public DiscriminationScopeDiagnosisSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I select Discrimination$")
	public void i_select_Discrimination() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickDiscrimination();
	}
	
	@Then("^I am redirected to the discrimination what do you need help with page$")
	public void i_am_redirected_to_the_discrimination_what_do_you_need_help_with_page() throws Throwable {
	   assertTrue(PageFactory.getCLAWebDiscriminationWhatDoYouNeedHelpWithPage(driver).verifyOnPage());
	}

}
