package uk.gov.justice.digital.cla.factories;

import org.openqa.selenium.WebDriver;





import uk.gov.justice.digital.cla.factories.FakeDataFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;

public class JourneyFactory {

	private final WebDriver driver;


	public JourneyFactory(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	@Journey
	public void getCLAWebStartPageJourney() throws Exception{	
		driver.get(FakeDataFactory.getCLAWebStartPageUrl());
		PageFactory.getCLAWebStartPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getCLAWebProblemPageJourney() throws Exception{	
		getCLAWebStartPageJourney();
		PageFactory.getCLAWebStartPage(driver).clickStartNow();
		PageFactory.getCLAWebProblemPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getCLAWebGetInTouchContactPageJourney() throws Exception{	
		getCLAWebProblemPageJourney();
		PageFactory.getCLAWebProblemPage(driver).clickGetInTouch();
		PageFactory.getCLAWebContactPage(driver).verifyOnPage();
	}
	
	@Journey
	public void getCLAWebClinicalNegligenceFindLegalAdvisorPageJourney() throws Exception{	
		getCLAWebProblemPageJourney();
		PageFactory.getCLAWebProblemPage(driver).clickClinicalNegligence();
		PageFactory.getCLAWebProblemPage(driver).clickParentOfChildTryingToTakeIntoCareGetInTouch();
		PageFactory.getCLAWebClinicalNegligenceFindALegalAdvisorPage(driver).verifyOnPage();
	}	
	
	@Journey
	public void getCLAWebCommunityCareFindLegalAdvisorPageJourney() throws Exception{	
		getCLAWebProblemPageJourney();
		PageFactory.getCLAWebProblemPage(driver).clickCommunityCare();
		PageFactory.getCLAWebProblemPage(driver).clickContinueButton();
		PageFactory.getCLAWebCommunityCareFindALegalAdvisorPage(driver).verifyOnPage();
	}	
	
}
