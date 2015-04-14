package uk.gov.justice.digital.cla.factories;

import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.web.pages.CLA_WebConfirmationPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebContactPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebProblemPage;
import uk.gov.justice.digital.cla.web.pages.CLA_WebStartPage;


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
	
	
	
}
