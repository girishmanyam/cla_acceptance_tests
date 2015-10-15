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

public class SavingsPageSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public SavingsPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I say I have \"(.*?)\" as savings$")
	public void i_say_I_have_as_savings(String savings) throws Throwable {
		PageFactory.getCLAWebYourSavingsPage(driver).setSavings(savings);
	}

	@When("^I say I have \"(.*?)\" as investments$")
	public void i_say_I_have_as_investments(String investments)
			throws Throwable {
		PageFactory.getCLAWebYourSavingsPage(driver)
				.setInvetsments(investments);
	}

	@Then("^I verify I am on the savings page$")
	public void i_verify_I_am_on_the_savings_page() throws Throwable {
		PageFactory.getCLAWebYourSavingsPage(driver).verifyOnPage();
	}

	@When("^I say I have \"(.*?)\" of valuables$")
	public void i_say_I_have_of_valuables(String value) throws Throwable {
		PageFactory.getCLAWebYourSavingsPage(driver).setValuables( value);
	}
	
	@Then("^I verify you and your partners savings page$")
	public void i_verify_you_and_your_partners_savings_page() throws Throwable {
	    PageFactory.get_CLA_WebYouAndYourPartnersSavingsPage(driver).verifyOnPage();
	}
	
	@When("^I say my parnter and I savings are \"(.*?)\"$")
	public void i_say_my_parnter_and_I_savings_are(String value) throws Throwable {
		PageFactory.get_CLA_WebYouAndYourPartnersSavingsPage(driver).setSavings(value);
	}

	@When("^I say my partner and I investments are \"(.*?)\"$")
	public void i_say_my_partner_and_I_investments_are(String value) throws Throwable {
		PageFactory.get_CLA_WebYouAndYourPartnersSavingsPage(driver).setInvestments(value);
	}
	
	@When("^I say my partner and I have valuables worth \"(.*?)\"$")
	public void i_say_my_partner_and_I_have_valuables_worth(String value) throws Throwable {
		PageFactory.get_CLA_WebYouAndYourPartnersSavingsPage(driver).setValuables(value);
	}


}
