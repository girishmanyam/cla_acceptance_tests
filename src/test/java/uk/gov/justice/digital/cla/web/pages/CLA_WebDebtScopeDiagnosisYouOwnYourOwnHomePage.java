package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDebtScopeDiagnosisYouOwnYourOwnHomePage extends SeleniumPage {

	private String expectedTextOnPage = "You own your own home";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div[1]/a/ul/li[2]/span[1]");
	
	private By ChangeAreaOfLaw      = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/a[1]/ul/li[2]/span[2]");
	private By ChangePropertyStatus = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/a[2]/ul/li[2]/span[2]");
	
	private By atRiskOfLosingYourHome_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/ul/li[1]/a");
	private By atRiskOfLosingYourHome_No  = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/ul/li[2]/a");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	
	
	public void clickAtRiskOfLosingYourHome_Yes() throws Exception{
		click(atRiskOfLosingYourHome_Yes);
	}

	public void clickAtRiskOfLosingYourHome_No() throws Exception{
		click(atRiskOfLosingYourHome_No);
	}
	
	public void clickGetInTouch() throws Exception{
		click(getInTouchLink);
	}
	
	
	public CLA_WebDebtScopeDiagnosisYouOwnYourOwnHomePage(WebDriver driver) {
		super(driver);
	}

}
