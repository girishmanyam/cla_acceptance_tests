package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class CheckIfYouCanGetLegalAidStartPageSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public CheckIfYouCanGetLegalAidStartPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	
	@Given("^I am on the means test start page$")
	public void i_am_on_the_means_test_start_page() throws Throwable {
	    journeyFactory.getCLAWebCheckIfYouCanGetLegalAidStartPageJourney();
	}

	@When("^I click check if you qualify$")
	public void i_click_check_if_you_qualify() throws Throwable {
	    PageFactory.getCLA_WebLegalAidIsAvailableForThisProblemPage(driver).clickCheckIfYouGetLegalAid();
	    PageFactory.getCLAWebAboutYouPage(driver).verifyOnPage();
	}
	
}
