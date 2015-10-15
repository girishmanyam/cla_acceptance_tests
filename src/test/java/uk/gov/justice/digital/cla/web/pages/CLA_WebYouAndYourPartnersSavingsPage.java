package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

public class CLA_WebYouAndYourPartnersSavingsPage  extends CLA_WebIncomePage {

	public CLA_WebYouAndYourPartnersSavingsPage(WebDriver driver) {
		super(driver);
	}
	
	private String expectedTextOnPage = "You and your partner’s savings";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
   private By savings = new By.ByXPath(".//*[@id='savings']");
   private By investments = new By.ByXPath(".//*[@id='investments']");
   private By valuables = new By.ByXPath(".//*[@id='valuables']");
   
   public void setSavings(String value) throws Exception{
	   setText(savings, value);
   }
   
   public void setInvestments(String value) throws Exception{
	   setText(investments, value);
   }
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void setValuables(String value) throws Exception {
		   setText(valuables, value);
	}	

}
