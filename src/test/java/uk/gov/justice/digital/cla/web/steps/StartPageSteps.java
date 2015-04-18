package uk.gov.justice.digital.cla.web.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartPageSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public StartPageSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I click the start now button$")
	public void i_click_the_start_now_button() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickStartNow();
	}
	
	@Then("^I should be redirected to the CLA Web Problem Page$")
	public void i_should_be_redirected_to_the_CLA_Web_Problem_Page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebProblemPage(driver).verifyOnPage());
	}
}
