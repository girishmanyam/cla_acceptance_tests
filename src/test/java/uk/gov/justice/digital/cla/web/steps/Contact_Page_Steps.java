package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.FakeDataFactory;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class Contact_Page_Steps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public Contact_Page_Steps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@Given("^I am on the CLA Web Contact Page$")
	public void i_am_on_the_CLA_Web_Contact_Page() throws Throwable {
		journeyFactory.getCLAWebGetInTouchContactPageJourney();
	}

	@When("^I enter a contact name$")
	public void i_enter_a_contact_name() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setContactName(
				FakeDataFactory.getContactName());
	}

	@When("^enter (\\d+) characters in the situation description$")
	public void enter_characters_in_the_situation_description(int numberOfCharacters)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setSituationDesription(numberOfCharacters);
	}

	@When("^I submit details$")
	public void i_submit_details() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickSubmitDetails();
	}

	@Then("^I will be redirected to the CLA Web Confirmation Page$")
	public void i_will_be_redirected_to_the_CLA_Web_Confirmation_Page()
			throws Throwable {
		assertTrue("Unable to reach confirmation page", PageFactory.getCLAWebConfirmationPage(driver).verifyOnPage());
	}

	@When("^I select my preference is to call the CLA$")
	public void i_select_my_preference_is_to_call_the_CLA() throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
		.clickPreferenceCallCLARadioButton();
	}
	
	@Then("^I will see an error that the maximum of characters has been exceeded$")
	public void i_will_see_an_error_that_the_maximum_of_characters_has_been_exceeded() throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
		.expected4000CharacterErrorTextDisplayed();
	}

	@When("^I set a valid contact number$")
	public void i_set_a_valid_contact_number() throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
		.setCallBackNumber(FakeDataFactory.getContactNumber());
	}

	@When("^I set that the contact number is safe to save$")
	public void i_set_that_the_contact_number_is_safe_to_save()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickCallBackSaveToSave_Yes();
	}

}
