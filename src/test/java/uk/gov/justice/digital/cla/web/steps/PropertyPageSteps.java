package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.page.SeleniumPage;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class PropertyPageSteps {

	public PropertyPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	@When("^I say NO the property is the main residence$")
	public void i_say_NO_the_property_is_the_main_residence() throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver)
				.clickPropertyIsMainHome_No();
	}

	@When("^I say YES the property is the main residence$")
	public void i_say_YES_the_property_is_the_main_residence() throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver)
				.clickPropertyIsMainHome_Yes();
	}

	@When("^I say YES someone else owns a share of the property$")
	public void i_say_YES_someone_else_owns_a_share_of_the_property()
			throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver)
				.clickDoesAnyoneElseOwnAShareOfTheProperty_Yes();
	}

	@When("^I say NO no one else owns a share of the property$")
	public void i_say_NO_no_one_else_owns_a_share_of_the_property()
			throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver)
				.clickDoesAnyoneElseOwnAShareOfTheProperty_No();
	}

	@When("^I say the property is worth \"(.*?)\"$")
	public void i_say_the_property_is_worth(String value) throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver)
				.setHowMuchThePropertyIsWorth(value);;
	}

	@When("^I say there is \"(.*?)\" left to pay on the mortgage$")
	public void i_say_there_is_left_to_pay_on_the_mortgage(String value) throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver).setHowMuchMortgageIsRemaining(value);
	}

	@When("^I say the last monthly mortgage payment was \"(.*?)\"$")
	public void i_say_the_last_monthly_mortgage_payment_was(String payment) throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver).setLastMonthMortgagePayment(payment);
	}

	@When("^I say YES I do rent out parts of the property$")
	public void i_say_YES_I_do_rent_out_parts_of_the_property()
			throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver).clickDoYouRentTheProperty_Yes();
	}
	
	@Then("^I verify I am on the debt your're likely to get legal aid page$")
	public void i_verify_I_am_on_the_debt_your_re_likely_to_get_legal_aid_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebDebtYoureLikelyToGetLegalAidPage(driver).verifyOnPage());
	}

	@When("^I say NO I do not rent out parts of the property$")
	public void i_say_NO_I_do_not_rent_out_parts_of_the_property()
			throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver).clickDoYouRentTheProperty_No();
	}

	@When("^I say YES my share of the property is in dispute$")
	public void i_say_YES_my_share_of_the_property_is_in_dispute()
			throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver).clickIsYourShareOfThePropertyInDispute_Yes();
	}

	@When("^I say NO my share of the property is not in dispute$")
	public void i_say_NO_my_share_of_the_property_is_not_in_dispute()
			throws Throwable {
		PageFactory.getCLAWebYourPropertyPage(driver).clickIsYourShareOfThePropertyInDispute_No();
	}

	@Then("^I verify I am on your property page$")
	public void i_verify_I_am_on_your_property_page() throws Throwable {
		assertTrue(PageFactory.getCLAWebYourPropertyPage(driver).verifyOnPage());
	}
	
	@Then("^I verify I am on the debt your're unlikely to get legal aid page$")
	public void i_verify_I_am_on_the_debt_your_re_unlikely_to_get_legal_aid_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebYouAreUnlikelyToGetLegalAidContactPage(driver).verifyOnPage());
	}
	
	@Then("^I verify I am on you and your partners income page$")
	public void i_verify_I_am_on_you_and_your_partners_income_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).verifyOnPage());
	}

}
