package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class ReviewPageSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ReviewPageSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}	
	
	@Then("^I verify I am on the review page$")
	public void i_verify_I_am_on_the_review_page() throws Throwable {
	    PageFactory.getCLAWebReviewPage(driver).verifyOnPage();
	}

	@When("^I click confirm answers$")
	public void i_click_confirm_answers() throws Throwable {
		PageFactory.getCLAWebReviewPage(driver).clickConfirm();
	}

}
