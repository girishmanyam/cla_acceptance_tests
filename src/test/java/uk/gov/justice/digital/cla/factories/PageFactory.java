package uk.gov.justice.digital.cla.factories;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.web.pages.CLA_WebCommunityCareFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebConfirmationPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebContactPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebClinicalNegligenceFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebPersonalInjuryFindLegalAdvisor;
import uk.gov.justice.digital.cla.web.pages.CLA_WebProblemPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebPublicLawFindLegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebStartPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebTellUsHowYouFeelPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebTroubleWithThePoliceFindLegalAdvisorPage;


public class PageFactory {

	public static CLA_WebStartPage getCLAWebStartPage(WebDriver driver) {
		return new CLA_WebStartPage(driver);
	}
	
	public static CLA_WebProblemPage getCLAWebProblemPage(WebDriver driver) {
		return new CLA_WebProblemPage(driver);
	}
	
	public static CLA_WebContactPage getCLAWebContactPage(WebDriver driver) {
		return new CLA_WebContactPage(driver);
	}
	
	public static CLA_WebConfirmationPage getCLAWebConfirmationPage(WebDriver driver) {
		return new CLA_WebConfirmationPage(driver);
	}
	
	public static CLA_WebClinicalNegligenceFindALegalAdvisorPage getCLAWebClinicalNegligenceFindALegalAdvisorPage(WebDriver driver) {
		return new CLA_WebClinicalNegligenceFindALegalAdvisorPage(driver);
	}
	
	public static CLA_WebPersonalInjuryFindLegalAdvisor getCLAWebPersonalInjuryFindLegalAdvisor(WebDriver driver) {
		return new CLA_WebPersonalInjuryFindLegalAdvisor(driver);
	}
	
	public static CLA_WebCommunityCareFindALegalAdvisorPage getCLAWebCommunityCareFindALegalAdvisorPage(WebDriver driver) {
		return new CLA_WebCommunityCareFindALegalAdvisorPage(driver);
	}
	
	
	public static CLA_WebFindALegalAdvisorPage getCLAWebFindALegalAdvisorPage(WebDriver driver) {
		return new CLA_WebFindALegalAdvisorPage(driver);
	}	
	
	public static CLA_WebPublicLawFindLegalAdvisorPage getCLAWebPublicLawFindLegalAdvisorPage(WebDriver driver) {
		return new CLA_WebPublicLawFindLegalAdvisorPage(driver);
	}	
	
	public static CLA_WebTroubleWithThePoliceFindLegalAdvisorPage getCLAWebTroubleWithThePoliceFindLegalAdvisorPage(WebDriver driver) {
		return new CLA_WebTroubleWithThePoliceFindLegalAdvisorPage(driver);
	}
		
	public static CLA_WebTellUsHowYouFeelPage getCLAWebTellUsHowYouFeelPage(WebDriver driver) {
		return new CLA_WebTellUsHowYouFeelPage(driver);
	}
}
