package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class HousingScopeAssessmentPageSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public HousingScopeAssessmentPageSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
}
