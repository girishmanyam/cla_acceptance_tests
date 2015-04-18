package uk.gov.justice.digital.cla.web.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.FakeDataFactory;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class FindALegalAdvisorPageSteps {
	

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public FindALegalAdvisorPageSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}	
	
	
	@When("^I enter a valid postcode$")
	public void i_enter_a_postcode() throws Throwable {
		stepContext.setPostcode( FakeDataFactory.getValidPostcode() );
	    PageFactory.getCLAWebFindALegalAdvisorPage(driver).setPostcode(stepContext.getPostcode());
	}	
	
	@When("^I click search$")
	public void i_click_search() throws Throwable {
	    PageFactory.getCLAWebFindALegalAdvisorPage(driver).clickSearch();
	}
	
	@When("^I click send us your thoughts$")
	public void i_click_send_us_your_thoughts() throws Throwable {
	    PageFactory.getCLAWebFindALegalAdvisorPage(driver).clickSendUsYourThoughts();;
	}


}
