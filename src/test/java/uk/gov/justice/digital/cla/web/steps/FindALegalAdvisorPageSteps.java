package uk.gov.justice.digital.cla.web.steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.FakeDataFactory;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class FindALegalAdvisorPageSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public FindALegalAdvisorPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I select clinical negligence$")
	public void i_select_clinical_negligence() throws Throwable {
		PageFactory.getCLAWebProblemPage(driver).clickClinicalNegligence();
	}

	@When("^I click search$")
	public void i_click_search() throws Throwable {
		PageFactory.getCLAWebFindALegalAdvisorPage(driver).clickSearch();
	}

	@When("^I click send us your thoughts$")
	public void i_click_send_us_your_thoughts() throws Throwable {
		PageFactory.getCLAWebFindALegalAdvisorPage(driver)
				.clickSendUsYourThoughts();
		;
	}

	@Then("^I should be redirected to the clinical negligence legal advisor page$")
	public void i_should_be_redirected_to_the_clinical_negligence_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory
				.getCLAWebClinicalNegligenceFindALegalAdvisorPage(driver)
				.verifyOnPage());
	}

	@Then("^I should be redirected to the community care legal advisor page$")
	public void i_should_be_redirected_to_the_community_care_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebCommunityCareFindALegalAdvisorPage(
				driver).verifyOnPage());
	}

	@Then("^I should be redirected to the employment legal advisor page$")
	public void i_should_be_redirected_to_the_employment_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebEmploymentFindLegalAdvisorPage(driver)
				.verifyOnPage());
	}

	@Then("^I should be redirected to the immigration and asylum legal advisor page$")
	public void i_should_be_redirected_to_the_immigration_and_asylum_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory
				.getCLAWebImmigrationAndAsylumFindALegalAdvisorPage(driver)
				.verifyOnPage());
	}

	@Then("^I should be redirected to the mental health legal advisor page$")
	public void i_should_be_redirected_to_the_mental_health_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebMentalHealthFinaALegalAdvisorPage(
				driver).verifyOnPage());
	}

	@Then("^I should be redirected to the personal injury legal advisor page$")
	public void i_should_be_redirected_to_the_personal_injury_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebPersonalInjuryFindLegalAdvisor(driver)
				.verifyOnPage());
	}

	@Then("^I should be redirected to the public law legal advisor page$")
	public void i_should_be_redirected_to_the_public_law_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebPublicLawFindLegalAdvisorPage(driver)
				.verifyOnPage());
	}

	@Then("^I should be redirected to the trouble with the police legal advisor page$")
	public void i_should_be_redirected_to_the_trouble_with_the_police_legal_advisor_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebTroubleWithThePoliceFindLegalAdvisorPage(driver)
				.verifyOnPage());
	}

}
