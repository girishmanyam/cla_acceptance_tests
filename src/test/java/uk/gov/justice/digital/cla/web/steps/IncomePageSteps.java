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

public class IncomePageSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public IncomePageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I say I received (\\d+) maintenance$")
	public void i_say_I_received_maintenance(int maintenance) throws Throwable {
	    PageFactory.getCLAWebIncomePage(driver).setMaintenanceReceived(Integer.toString(maintenance));
	}
	
	@When("^I say I received (\\d+) pension$")
	public void i_say_I_received_pension(int pension) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setPensionReceived(Integer.toString(pension));
	}
	
	@When("^I say I received (\\d+) other income$")
	public void i_say_I_received_other_income(int otherIncome) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setAnyOtherIncome(Integer.toString(otherIncome));
	}
	
	@When("^I say the  period is \"(.*?)\" for received maintenance period$")
	public void i_say_the_period_is_for_received_maintenance_period(String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).selectMaintenancePeriodByValue(period);
	}

	@When("^I say the period is \"(.*?)\" for received pension$")
	public void i_say_the_period_is_for_received_pension(String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).selectPensionPeriodByValue(period);
	}

	@When("^I say  period is \"(.*?)\" for received other income$")
	public void i_say_period_is_for_received_other_income(String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).selectAnyOtherIncomePeriodByValue(period);
	}
	
	@Then("^I verify I am on the income page$")
	public void i_verify_I_am_on_the_income_page() throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).verifyOnPage();
	}
	
}
