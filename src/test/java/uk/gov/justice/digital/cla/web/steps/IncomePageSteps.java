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
	
	@When("^I say I receive \"(.*?)\" income before tax \"(.*?)\"$")
	public void i_say_I_receive_income_before_tax(String value, String period) throws Throwable {
	    PageFactory.getCLAWebIncomePage(driver).setIncome(value);
		PageFactory.getCLAWebIncomePage(driver).selectIncomeInterval(period);
	}

	@When("^I say I paid \"(.*?)\" income tax \"(.*?)\"$")
	public void i_say_I_paid_income_tax(String value, String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setIncomeTax(value);
		PageFactory.getCLAWebIncomePage(driver).selectIncomeTaxInterval(period);
	}

	@When("^I say I paid \"(.*?)\" NI contributions \"(.*?)\"$")
	public void i_say_I_paid_NI_contributions(String value, String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setNIContributions(value);
		PageFactory.getCLAWebIncomePage(driver).selectNIContributionsInterval(period);
	}

	@When("^I say I received \"(.*?)\" Tax credit \"(.*?)\"$")
	public void i_say_I_received_Tax_credit(String value, String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setTaxCredit(value);
		PageFactory.getCLAWebIncomePage(driver).selectTaxCreditInterval(period);
	}

	@When("^I say I received \"(.*?)\" maintenance \"(.*?)\"$")
	public void i_say_I_received_maintenance(String value, String period) throws Throwable {
	    PageFactory.getCLAWebIncomePage(driver).setMaintenanceReceived(value);
		PageFactory.getCLAWebIncomePage(driver).selectMaintenancePeriodByValue(period);
	}

	@When("^I say I received \"(.*?)\" pension \"(.*?)\"$")
	public void i_say_I_received_pension(String value, String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setPensionReceived(value);
		PageFactory.getCLAWebIncomePage(driver).setPensionReceivedInterval(period);
	}

	@When("^I say I received \"(.*?)\" other income \"(.*?)\"$")
	public void i_say_I_received_other_income(String value, String period) throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).setAnyOtherIncome(value);
		PageFactory.getCLAWebIncomePage(driver).selectAnyOtherIncomePeriodByValue(period);
	}

	
	@Then("^I verify I am on the income page$")
	public void i_verify_I_am_on_the_income_page() throws Throwable {
		PageFactory.getCLAWebIncomePage(driver).verifyOnPage();
	}
	
	@When("^I say my partner received \"(.*?)\" maintenance \"(.*?)\"$")
	public void i_say_my_partner_received_maintenance(String value, String period) throws Throwable {
	    PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerMaintenanceReceived(value);
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerMaintenanceReceivedInterval(period);
	}

	@When("^I say my partner received \"(.*?)\" pension \"(.*?)\"$")
	public void i_say_my_partner_received_pension(String value, String period) throws Throwable {
	    PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerPensionReceived(value);
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerPensionReceivedIntervalByText(period);
	}

	@When("^I say my partner received \"(.*?)\" other income \"(.*?)\"$")
	public void i_say_my_partner_received_other_income(String value, String period) throws Throwable {
	    PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).setPartnerOtherIncome(value);
		PageFactory.getCLAWebYouAndYourPartnersIncomePage(driver).selectPartnerOtherIncomeIntervalByText(period);;
	}

}
