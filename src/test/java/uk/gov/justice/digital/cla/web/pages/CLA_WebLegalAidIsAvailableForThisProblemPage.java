package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebLegalAidIsAvailableForThisProblemPage extends SeleniumPage {
	

	private String expectedTextOnPage = "Legal aid is available for this type of problem";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By checkIfYouGetLegalAid = new By.ByXPath(".//*[@id='content']/div/article/p[6]/a");
	
	public CLA_WebLegalAidIsAvailableForThisProblemPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
	
	public void clickCheckIfYouGetLegalAid() throws Exception{
		click(checkIfYouGetLegalAid);
	}

}
