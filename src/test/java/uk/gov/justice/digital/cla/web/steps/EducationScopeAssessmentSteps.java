package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class EducationScopeAssessmentSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public EducationScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@When("^I select Education$")
	public void i_select_Education() throws Throwable {
		PageFactory.getCLAWebProblemPage(driver).clickEducation();
	}

	@When("^I click a child in care or a care leaver$")
	public void i_click_a_child_in_care_or_a_care_leaver() throws Throwable {
		PageFactory.getCLAWebEducationWhatDoYouNeedHelpWithPage(driver)
				.clickChildCare();
	}

	@When("^I click special education needs$")
	public void i_click_special_education_needs() throws Throwable {
		PageFactory.getCLAWebEducationWhatDoYouNeedHelpWithPage(driver)
				.clickSpecialEducationNeeds();
	}

	@When("^I click education discrimination$")
	public void i_click_education_discrimination() throws Throwable {
		PageFactory.getCLAWebEducationWhatDoYouNeedHelpWithPage(driver)
				.clickEducationDiscrimination();
	}

	@When("^I click education none of the above$")
	public void i_click_education_none_of_the_above() throws Throwable {
		PageFactory.getCLAWebEducationWhatDoYouNeedHelpWithPage(driver)
		.clickEducationNoneOfTheAbove();
	}

}
