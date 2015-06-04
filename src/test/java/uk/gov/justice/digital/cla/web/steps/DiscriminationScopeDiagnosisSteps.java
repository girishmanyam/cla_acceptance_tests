package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class DiscriminationScopeDiagnosisSteps {
	
	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public DiscriminationScopeDiagnosisSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@When("^I select Discrimination$")
	public void i_select_Discrimination() throws Throwable {
	    PageFactory.getCLAWebProblemPage(driver).clickDiscrimination();
	}

}
