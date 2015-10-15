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

public class OutgoingsPageSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public OutgoingsPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I say I pay \"(.*?)\" rent \"(.*?)\"$")
	public void i_say_I_pay_rent(String value, String period) throws Throwable {
	    PageFactory.getCLAWebOutGoingsPage(driver).setRent(value);
	    PageFactory.getCLAWebOutGoingsPage(driver).selectRentPeriodByValue(period);
	}

	@When("^I say I pay \"(.*?)\" maintenance \"(.*?)\"$")
	public void i_say_I_pay_maintenance(String value, String period) throws Throwable {
	    PageFactory.getCLAWebOutGoingsPage(driver).setMaintenance(value);
	    PageFactory.getCLAWebOutGoingsPage(driver).selectMaintenancePeriodByValue(period);
	}

	@When("^I say I pay \"(.*?)\" other income contribution$")
	public void i_say_I_pay_other_income_contribution(String value) throws Throwable {
	    PageFactory.getCLAWebOutGoingsPage(driver).setIncomeContribution(value);
	}

	
	@Then("^I verify I am on the outgoings page$")
	public void i_verify_I_am_on_the_outgoings_page() throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).verifyOnPage();
	}

	
	@When("^I click review my answers$")
	public void i_click_review_my_answers() throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).clickReviewYourAnswers();
	}
	
	@Then("^I verify I am on you and your partners outgoings page$")
	public void i_verify_I_am_on_you_and_your_partners_outgoings_page() throws Throwable {
	    PageFactory.get_CLA_WebYouAndYourPartnersOutgoingsPage(driver).verifyOnPage();
	}
	
	@When("^our outgoing rent is \"(.*?)\" \"(.*?)\"$")
	public void our_outgoing_rent_is(String value, String period) throws Throwable {
		PageFactory.get_CLA_WebYouAndYourPartnersOutgoingsPage(driver).setOutgoingRent(value);
		PageFactory.get_CLA_WebYouAndYourPartnersOutgoingsPage(driver).setOutgoingRentPeriod(period);
	}

	@When("^our outgoing maintenance is \"(.*?)\" \"(.*?)\"$")
	public void our_outgoing_maintenance_is(String value, String period) throws Throwable {
		PageFactory.get_CLA_WebYouAndYourPartnersOutgoingsPage(driver).setOutgoingMaintenance(value);
		PageFactory.get_CLA_WebYouAndYourPartnersOutgoingsPage(driver).setOutgoingRentPeriod(period);

	}

	@When("^our outgoing payment for a monthly income contribution order is \"(.*?)\"$")
	public void our_outgoing_payment_for_a_monthly_income_contribution_order_is(String value) throws Throwable {
		PageFactory.get_CLA_WebYouAndYourPartnersOutgoingsPage(driver).setMonthyIncomeContributionOrder(value);
	}

}
