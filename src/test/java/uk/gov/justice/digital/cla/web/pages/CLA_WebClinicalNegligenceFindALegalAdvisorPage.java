package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebClinicalNegligenceFindALegalAdvisorPage extends CLA_WebFindALegalAdvisorPage {
	
	private String expectedTextOnPage = "get legal aid for advice about clinical negligence ";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/p[1]");
	

	public CLA_WebClinicalNegligenceFindALegalAdvisorPage(WebDriver driver) {
		super(driver);
	}
	

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
