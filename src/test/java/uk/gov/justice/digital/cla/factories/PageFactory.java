package uk.gov.justice.digital.cla.factories;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.web.pages.CLA_WebCommunityCareFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebConfirmationPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebContactPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebClinicalNegligenceFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebDebtAboutYouPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebImmigrationAndAsylumFindALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebIncomePage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebMentalHealthFinaALegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebOutGoingsPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebPersonalInjuryFindLegalAdvisor;
import uk.gov.justice.digital.cla.web.pages.CLA_WebProblemPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebPublicLawFindLegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebReviewPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebStartPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebTellUsHowYouFeelPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebTroubleWithThePoliceFindLegalAdvisorPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebYouMightBeEligibleContactPage;


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
	
	public static CLA_WebTroubleWithThePoliceFindLegalAdvisorPage getCLAWebMentalHealthFinaALegalAdvisorPage(WebDriver driver) {
		return new CLA_WebTroubleWithThePoliceFindLegalAdvisorPage(driver);
	}
	
	public static CLA_WebMentalHealthFinaALegalAdvisorPage getCLAWebTroubleWithThePoliceFindLegalAdvisorPage(WebDriver driver) {
		return new CLA_WebMentalHealthFinaALegalAdvisorPage(driver);
	}
	
	public static CLA_WebImmigrationAndAsylumFindALegalAdvisorPage getCLAWebImmigrationAndAsylumFindALegalAdvisorPage(WebDriver driver) {
		return new CLA_WebImmigrationAndAsylumFindALegalAdvisorPage(driver);
	}
		
	public static CLA_WebTellUsHowYouFeelPage getCLAWebTellUsHowYouFeelPage(WebDriver driver) {
		return new CLA_WebTellUsHowYouFeelPage(driver);
	}
	
	public static CLA_WebDebtAboutYouPage getCLAWebDebtAboutYouPage(WebDriver driver) {
		return new CLA_WebDebtAboutYouPage(driver);
	}
	
	public static CLA_WebIncomePage getCLAWebIncomePage(WebDriver driver) {
		return new CLA_WebIncomePage(driver);
	}	
	
	
	public static CLA_WebOutGoingsPage getCLAWebOutGoingsPage(WebDriver driver) {
		return new CLA_WebOutGoingsPage(driver);
	}	
	
	
	public static CLA_WebReviewPage getCLAWebReviewPage(WebDriver driver) {
		return new CLA_WebReviewPage(driver);
	}	
	
	
	public static CLA_WebYouMightBeEligibleContactPage getCLAWebYouMightBeEligibleContactPage(WebDriver driver) {
		return new CLA_WebYouMightBeEligibleContactPage(driver);
	}	
	
}
