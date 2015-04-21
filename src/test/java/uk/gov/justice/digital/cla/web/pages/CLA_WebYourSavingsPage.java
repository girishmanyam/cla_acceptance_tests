package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebYourSavingsPage extends SeleniumPage {

	public CLA_WebYourSavingsPage(WebDriver driver) {
		super(driver);
	}

	private String expectedTextOnPage = "Your savings";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By getInTouch = new By.ByXPath(".//*[@id='callback-link']");
	
	private By savings = new By.ByXPath(".//*[@id='savings']");
	private By investments = new By.ByXPath(".//*[@id='investments']");
	
	private By continueButton = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p/button");
	
	public void clickContinue() throws Exception{
		click(continueButton);
	}
	
	public void clickGetInTouch() throws Exception{
		click(getInTouch);
	}
	
	public void setSavings(String savings) throws Exception{
		setText(this.savings, savings);
	}
	
	public void setInvetsments(String investments) throws Exception{
		setText(this.investments, investments);
	}
	
	
}
