package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import cucumber.api.java.en.Given;

public class PublicJourneySteps {
	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public PublicJourneySteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}
	

	@Given("^I am on the public start page$")
	public void i_am_on_the_CLA_Web_Start_Page() throws Throwable {
		journeyFactory.getCLAWebStartPageJourney();
	}
	
	@Given("^I am on the public contact page$")
	public void i_am_on_the_CLA_Web_Contact_Page() throws Throwable {
		journeyFactory.getCLAWebGetInTouchContactPageJourney();
	}
	
	@Given("^I am on the public clinical negligence find a legal advisor page$")
	public void i_am_on_the_public_clinical_negligence_find_a_legal_addvisor_page() throws Throwable {
		journeyFactory.getCLAWebClinicalNegligenceFindLegalAdvisorPageJourney();
	}
	
	@Given("^I am on the public community care find a legal advisor page$")
	public void i_am_on_the_public_community_care_find_a_legal_addvisor_page() throws Throwable {
		journeyFactory.getCLAWebCommunityCareFindLegalAdvisorPageJourney();
	}
	
}
