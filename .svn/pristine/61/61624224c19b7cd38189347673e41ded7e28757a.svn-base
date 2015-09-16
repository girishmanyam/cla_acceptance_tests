package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebFindALegalAdvisorPage extends SeleniumPage{
	
	
	public CLA_WebFindALegalAdvisorPage(WebDriver driver) {
		super(driver);
	}

	private By postcode = new By.ByXPath(".//*[@id='postcode']");
	
	private By searchButton = new By.ByXPath(".//*[@id='field-postcode']/div/button");
	private By sendUsYourThoughtsLink = new By.ByXPath(".//*[@id='content']/div[2]/article/div/div/p/a");
	
	public void clickSendUsYourThoughts() throws Exception{
		click(sendUsYourThoughtsLink);
	}
	
	public void clickSearch() throws Exception{
		click(searchButton);
	}
	
	

	public void setPostcode(String postcode) throws Exception{
		setText(this.postcode, postcode);
	}
	

}
