package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.Page;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.FakeDataFactory;
import uk.gov.justice.digital.cla.factories.FakeDataFactory.Mode;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.pages.PageEnum;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

import java.util.List;

public class ContactPageSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ContactPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@Given("^I am on the contact us page$")
	public void i_am_on_the_contact_us_page() throws Throwable {
		stepContext.setPageEnum(PageEnum.CONTACT_US);
		journeyFactory.getCLAWebGetInTouchContactPageJourney();
		PageFactory.getCLAWebContactPage(driver).verifyOnPage();
	}

	@When("^I enter my full name \"(.*?)\"$")
	public void i_enter_my_full_name(String fullName) throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setFullName(fullName);
	}

	@When("^I enter my helpers full name \"(.*?)\"$")
	public void i_enter_my_helpers_full_name(String helperFullName)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setHelperFullName(
				helperFullName);
	}

	@When("^I select the option \"(.*?)\" as the  relationship to me$")
	public void i_select_the_option_as_the_relationship_to_me(
			String relationship) throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
				.selectHelperRelationshipByValue(relationship);
	}

	@Then("^I verify I am on the maybe eligible contact us page$")
	public void i_verify_I_am_on_the_maybe_eligible_contact_us_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebYouMightBeEligibleContactPage(driver)
				.verifyOnPage());
	}

	@When("^I say NO to has anyone helped to fill in the form$")
	public void i_say_NO_to_has_anyone_helped_to_fill_in_the_form()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickhasAnyoneHelpedYou_No();
	}

	@When("^I say YES to has anyone helped to fill in the form$")
	public void i_say_YES_to_has_anyone_helped_to_fill_in_the_form()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickhasAnyoneHelpedYou_Yes();
	}

	@When("^I select I will call the cla$")
	public void i_select_I_will_call_the_cla() throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
				.clickPreferenceCallCLARadioButton();
	}

	@When("^I select I wish the cla to call me back$")
	public void i_select_I_wish_the_cla_to_call_me_back() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickPreferenceCLACallBack();
	}

	@When("^I enter a contact number \"(.*?)\"$")
	public void i_enter_a_contact_number(String contactNumber) throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setCallContactNumber(
				contactNumber);
	}

	@When("^I say YES that it is safe to save a message$")
	public void i_say_YES_that_it_is_safe_to_save_a_message() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickCallBackSafeToSave_Yes();
	}

	@When("^I say NO that it is not safe to save a message$")
	public void i_say_NO_that_it_is_not_safe_to_save_a_message()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickCallBackSafeToSave_No();
	}

	@When("^I select option (\\d+) for the day to call$")
	public void i_select_option_for_the_day_to_call(int index) throws Throwable {
		PageFactory.getCLAWebContactPage(driver).selectDayToBeCalled(index);
	}

	@When("^I select option (\\d+) for the time to call$")
	public void i_select_option_for_the_time_to_call(int index)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).selectTimeToBeCalled(index);
	}

	@When("^I enter (?:a|an invalid|a valid) postcode \"(.*?)\"$")
	public void i_enter_a_postcode(String postcode) throws Throwable {

		stepContext.setPostcode(postcode);

		if (stepContext.getPageEnum() == PageEnum.CONTACT_US)
			PageFactory.getCLAWebContactPage(driver).setPostcode(postcode);
		else {
			PageFactory.getCLAWebFindALegalAdvisorPage(driver).setPostcode(
					postcode);
		}
	}

	@When("^I select option (\\d+) from the address list$")
	public void i_select_option_from_the_address_list(int index)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).selectAnAddressByIndex(index);
	}

	@When("^I click find UK address$")
	public void i_click_find_UK_address() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickFindUKAddress();
	}

	@When("^I enter my street address \"(.*?)\"$")
	public void i_enter_my_street_address(String address) throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setAddressText(address);
		stepContext.setAddressText(address);
	}

	@When("^I select the UK address:$")
	public void i_select_the_UK_address(List<List<String>> address)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).selectUKAddress(address.get(0).get(0));
	}

	@When("^I enter extra notes that may help \"(.*?)\"$")
	public void i_enter_extra_notes_that_may_help(String extraNotes)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setExtraNotes(extraNotes);
	}

	@When("^I click bslwebcam for special communication need$")
	public void i_click_bslwebcam_for_special_communication_need()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickAdaptionBSLWebCam();
	}

	@When("^I click minicom for special communication need$")
	public void i_click_minicom_for_special_communication_need()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickAdaptionMiniCom();
	}

	@When("^I click text relay for special communication need$")
	public void i_click_text_relay_for_special_communication_need()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickAdaptionTextRelay();
	}

	@When("^I click welsh for special communication need$")
	public void i_click_welsh_for_special_communication_need() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickAdaptionWelsh();
	}

	@When("^I click other language for special communication need$")
	public void i_click_other_language_for_special_communication_need()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickAdaptionOtherLanguage();
	}

	@When("^I select \"(.*?)\" language for special communication need$")
	public void i_select_language_for_special_communication_need(String language)
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
				.selectAdaptionOtherLanugageByValue(language);
	}

	@When("^I select other special communication needs$")
	public void i_select_other_special_communication_needs() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickAdaptionOther();
	}

	@When("^I enter details \"(.*?)\" for my other special communication needs$")
	public void i_enter_details_for_my_other_special_communication_needs(
			String needs) throws Throwable {
		PageFactory.getCLAWebContactPage(driver).setAdaptionOtherText(needs);
	}

	@When("^I click submit details$")
	public void i_click_submit_details() throws Throwable {
		PageFactory.getCLAWebContactPage(driver).clickSubmitDetails();
	}

	@Then("^I will be redirected to the CLA Web Confirmation Page$")
	public void i_will_be_redirected_to_the_CLA_Web_Confirmation_Page()
			throws Throwable {
		assertTrue("Unable to reach confirmation page", PageFactory
				.getCLAWebConfirmationPage(driver).verifyOnPage());
	}

	@Then("^I will see an error that the maximum of characters has been exceeded$")
	public void i_will_see_an_error_that_the_maximum_of_characters_has_been_exceeded()
			throws Throwable {
		PageFactory.getCLAWebContactPage(driver)
				.expected4000CharacterErrorTextDisplayed();
	}

	@Then("^the address field text box is populated$")
	public void the_address_field_text_box_is_populated() throws Throwable {
		assertTrue(PageFactory.getCLAWebContactPage(driver).getAddressText().contains(stepContext.getAddressText()));
	}
	
	@Then("^an error is displayed stating the postcode could not be found$")
	public void an_error_is_displayed_stating_the_postcode_could_not_be_found() throws Throwable {
	    assertTrue(PageFactory.getCLAWebContactPage(driver).expectedNoPostcodeFoundDisplayed());
	}
	

	@Then("^I verify I am on the contact civil legal advice page$")
	public void i_verify_I_am_on_the_contact_civil_legal_advice_page() throws Throwable {
		assertTrue(PageFactory.getCLAWebContactPage(driver).verifyOnPage());
	}


}
