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


public class OutComePageSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public OutComePageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@Then("^I verify I am unlikely to qualify for legal aid$")
	public void i_verify_I_am_unlikely_to_qualify_for_legal_aid()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebYouAreUnlikelyToGetLegalAidContactPage(driver).verifyOnPage());
	}
	


}
