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
	
	@When("^I say I pay (\\d+) rent$")
	public void i_say_I_pay_rent(int rent) throws Throwable {
	    PageFactory.getCLAWebOutGoingsPage(driver).setRent(Integer.toString(rent));
	}

	@When("^I say the  period is \"(.*?)\" for rent payment$")
	public void i_say_the_period_is_for_rent_payment(String period) throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).selectRentPeriodByValue(period);
	}

	@When("^I say I pay (\\d+) maintenance$")
	public void i_say_I_pay_maintenance(int maintenance) throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).setMaintenance(Integer.toString(maintenance));
	}

	@When("^I say the period is \"(.*?)\" for maintenance payment$")
	public void i_say_the_period_is_for_maintenance_payment(String period) throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).selectMaintenancePeriodByValue(period);
	}

	@When("^I say I pay (\\d+) other income contribution$")
	public void i_say_I_pay_other_income_contribution(int incomeContribution) throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).setIncomeContribution(Integer.toString(incomeContribution));
	}
	
	@When("^I click review my answers$")
	public void i_click_review_my_answers() throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).clickReviewYourAnswers();
	}
	
	@Then("^I verify I am on the outgoings page$")
	public void i_verify_I_am_on_the_outgoings_page() throws Throwable {
		PageFactory.getCLAWebOutGoingsPage(driver).verifyOnPage();
	}


}
