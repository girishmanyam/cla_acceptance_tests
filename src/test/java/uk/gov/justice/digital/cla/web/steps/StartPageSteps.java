package uk.gov.justice.digital.cla.web.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartPageSteps {
	
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public StartPageSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I click the civil legal advise link$")
	public void i_click_the_civil_legal_advise_link() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickCivilLegalAdvise();
	}
	
	@When("^I click the legal aid link$")
	public void i_click_the_legal_aid_link() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickLegalAid();
	}
	
	@When("^I click how this service protects your privacy link$")
	public void i_click_how_this_service_protects_your_privacy() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickHowThisServiceProtectsYourPrivacy();
	}
	
	@When("^I click the northern ireland legal aid link$")
	public void i_click_the_northern_ireland_legal_aid_link() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickNorthernIrelandLegalAidLink();
	}
	
	@When("^I click the scotland legal aid link$")
	public void i_click_the_scotland_legal_aid_link() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickScotlandLegalAid();
	}
	
	@When("^I click the criminal legal aid link$")
	public void i_click_the_criminal_legal_aid_link() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickCriminalLegalAid();
	}
	
	@When("^I click the start now button$")
	public void i_click_the_start_now_button() throws Throwable {
	    PageFactory.getCLAWebStartPage(driver).clickStartNow();
	}
	
	@Then("^I should be redirected to the CLA Web Problem Page$")
	public void i_should_be_redirected_to_the_CLA_Web_Problem_Page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebProblemPage(driver).verifyOnPage());
	}
}
