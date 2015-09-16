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
	
	@When("^I say I received \"(.*?)\" maintenance$")
	public void i_say_I_received_maintenance(String maintenance) throws Throwable {
	    PageFactory.getCLAWebIncomePage(driver).setMaintenanceReceived(maintenance);
	}
	
	@When("^I say I received \"(.*?)\" pension$")
	public void i_say_I_received_pension(String pension) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setPensionReceived(pension);
	}
	
	@When("^I say I received \"(.*?)\" other income$")
	public void i_say_I_received_other_income(String otherIncome) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setAnyOtherIncome(otherIncome);
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
	
	@When("^I say my partner receives \"(.*?)\" gross wage$")
	public void i_say_my_partner_receives_gross_wage(String income) throws Throwable {
	    PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerIncome(income);
	}

	@When("^I say the period is \"(.*?)\" for gross wage$")
	public void i_say_the_period_is_for_gross_wage(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerIncomeInterval(option);
	}

	@When("^I say my partners pays \"(.*?)\" income tax$")
	public void i_say_my_partners_pays_income_tax(String tax) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerIncomeTax(tax);
	}

	@When("^I say the period is \"(.*?)\" for income tax paid$")
	public void i_say_the_period_is_for_income_tax_paid(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerIncomeTaxInterval(option);
	}

	@When("^I say my partners pays \"(.*?)\" national insuracnce contributions$")
	public void i_say_my_partners_pays_national_insuracnce_contributions(String ni) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerNIContributions(ni);
	}

	@When("^I say the period is \"(.*?)\" for national insurance contributions$")
	public void i_say_the_period_is_for_national_insurance_contributions(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerNIContributionsInterval(option);
	}
	
	@When("^I say my partner receives \"(.*?)\" working tax credit$")
	public void i_say_my_partner_receives_working_tax_credit(String credit) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerWorkingTaxCredit(credit);;
	}

	@When("^I say the period is \"(.*?)\" for working tax credit$")
	public void i_say_the_period_is_for_working_tax_credit(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerWorkingTaxCreditInterval(option);
	}

	@When("^I say my partner receives \"(.*?)\" for maintenance$")
	public void i_say_my_partner_receives_for_maintenance(String maintenance) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerMaintenanceReceived(maintenance);
	}

	@When("^I say the period is \"(.*?)\" for maintenance$")
	public void i_say_the_period_is_for_maintenance(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerMaintenanceReceivedInterval(option);
	}

	@When("^I say my partner receives \"(.*?)\" from pensions$")
	public void i_say_my_partner_receives_from_pensions(String pension) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerPensionReceived(pension);
	}

	@When("^I say the period is \"(.*?)\" for the pensions$")
	public void i_say_the_period_is_for_the_pensions(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerPensionReceivedIntervalByText(option);
	}

	@When("^I say my partner receives \"(.*?)\" other income$")
	public void i_say_my_partner_receives_other_income(String income) throws Throwable {
		System.out.println("Other income");
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerOtherIncome(income);
	}

	@When("^I say the period is \"(.*?)\" for other income$")
	public void i_say_the_period_is_for_other_income(String option) throws Throwable {
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerOtherIncomeIntervalByText(option);
	}
	
}
