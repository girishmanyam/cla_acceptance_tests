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

public class ScopeDiagnosisSteps {
	

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ScopeDiagnosisSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^I click that I own my own home$")
	public void i_click_that_I_own_my_own_home() throws Throwable {
	    PageFactory.getCLAWebDebtScopeDiagnosisPage(driver).clickOwnMyProperty();
	}

	@Then("^I click that I am in rented accommodation$")
	public void i_click_that_I_am_in_rented_accommodation() throws Throwable {
		PageFactory.getCLAWebDebtScopeDiagnosisPage(driver).clickiLiveInRentedAccommodation();
	}

	@Then("^I click that I am homeless$")
	public void i_click_that_I_am_homeless() throws Throwable {
		PageFactory.getCLAWebDebtScopeDiagnosisPage(driver).clickIAmHomeless();
	}

	@Then("^I click that I owe money$")
	public void i_click_that_I_owe_money() throws Throwable {
		PageFactory.getCLAWebDebtScopeDiagnosisPage(driver).clickIOweMoney();
	}
	
	
	@Then("^I verify I am on debt scope diagnosis page$")
	public void i_verify_I_am_on_debt_scope_diagnosis_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebDebtScopeDiagnosisPage(driver).verifyOnPage());
	}

}
