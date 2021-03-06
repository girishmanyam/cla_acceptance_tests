package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebStartPage extends SeleniumPage {
	
	private String expectedTextOnPage = "Check if you can get legal aid";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By startNowButton = new By.ByXPath(".//*[@id='start']");
	
	private By civilLegalAdviseLink = new By.ByXPath(".//*[@id='content']/div[2]/aside/nav/ul/li[1]/a");
	private By legalAidLink = new By.ByXPath(".//*[@id='content']/div[2]/aside/nav/ul/li[1]/a");
	private By criminalLegalAidLink = new By.ByXPath(".//*[@id='content']/div[2]/aside/nav/ul/li[3]/a");
	private By howThisServiceProtectsYourPrivacyLink = new By.ByXPath(".//*[@id='content']/div[2]/aside/nav/ul/li[4]/a");
	
	private By scotlandLegalAidLink = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/div/p/a[1]");
	private By northernIrelandLegalAidLink = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/div/p/a[2]");
	



	public CLA_WebStartPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
	
	public void clickCivilLegalAdvise() throws Exception{
		click(civilLegalAdviseLink);
	}
	
	public void clickLegalAid() throws Exception{
		click(legalAidLink);
	}
	
	public void clickCriminalLegalAid() throws Exception{
		click(criminalLegalAidLink);
	}
	
	public void clickHowThisServiceProtectsYourPrivacy() throws Exception{
		click(howThisServiceProtectsYourPrivacyLink);
	}
	
	public void clickScotlandLegalAid() throws Exception{
		click(scotlandLegalAidLink);
	}
	
	public void clickNorthernIrelandLegalAidLink() throws Exception{
		click(northernIrelandLegalAidLink);
	}

	public void clickStartNow() throws Exception {
		click(startNowButton);
		
	}

}
