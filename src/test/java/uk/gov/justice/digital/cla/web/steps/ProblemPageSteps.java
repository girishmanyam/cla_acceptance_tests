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

public class ProblemPageSteps {

	private StepContext stepConText = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public ProblemPageSteps(SharedDriver driver) {
         this.driver = driver;
 		journeyFactory = new JourneyFactory(driver);
	}	
	
	@When("^I select criminal negligence$")
	public void i_select_criminal_negligence() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickClinicalNegligence();
	}
	
	@When("^I select community care$")
	public void i_select_community_care() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickCommunityCare();
	}
	
	@When("^I select debt$")
	public void i_select_debt() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickDebt();
	}
	
	@When("^I select domestic violence$")
	public void i_select_domestic_violence() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickDomesticViolence();;
	}
	
	@When("^I click immediate danger get in touch$")
	public void i_click_immediate_danger_get_in_touch() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickImmediateDangerGetInTouch();
	}
	
	@When("^I select discrimination$")
	public void i_select_discrimination() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickDiscrimination();;
	}
	
	@When("^I select education$")
	public void i_select_education() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickEducation();
	}
	
	@When("^I select employment$")
	public void i_select_employment() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickEmployment();
	}
	
	@When("^I select family$")
	public void i_select_family() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickFamily();
	}
	
	@When("^I click I am a parent with a child a local authority is trying to take into care$")
	public void i_click_I_am_a_paren_with_a_child_local_authority_is_trying_to_take_into_car() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickParentOfChildTryingToTakeIntoCareGetInTouch();
	}
	
	@When("^I select housing$")
	public void i_select_housing() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickHousing();
	}
	
	@When("^I select immigration and asylum$")
	public void i_select_immigration_and_asylum() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickImmigrationAndAsylum();
	}
	
	@When("^I select mental health$")
	public void i_select_mental_health() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickMentalHealth();
	}
	
	@When("^I select personal injury$")
	public void i_select_personal_injury() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickPersonalInjury();
	}
	
	@When("^I select public law$")
	public void i_select_public_law() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickPublicLaw();
	}
	
	@When("^I select trouble with the police$")
	public void i_select_trouble_with_the_police() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickTroubleWithThePolice();
	}
	
	@When("^I select welfare benefits$")
	public void i_select_welfare_benefits() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickWelfareBenefits();
	}
	
	@When("^I click get in touch$")
	public void i_click_get_in_touch() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickGetInTouch();
	}
	
	@When("^I click continue$")
	public void i_click_continue() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickContinueButton();
	}
	
	@Then("^I should be redirected to the clinical negligence find a legal advisor page$")
	public void i_should_be_redirected_to_the_clinical_negligence_find_a_legal_advisor_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebClinicalNegligenceFindALegalAdvisorPage(driver).verifyOnPage());
	}
	
	
	@Then("^I should be redirected to the comunity care find a legal advisor page$")
	public void i_should_be_redirected_to_the_coummunity_care_find_legal_advisor_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebCommunityCareFindALegalAdvisorPage(driver).verifyOnPage());
	}
	
}
