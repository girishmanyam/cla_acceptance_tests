package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDebtScopeDiagnosisPage  extends SeleniumPage {

	private String expectedTextOnPage = "Debt";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div[1]/a/ul/li[2]/span[1]");
	
	private By changeLink = new By.ByXPath(".//*[@id='content']/div[2]/article/div[1]/a/ul/li[2]/span[2]");
	
	private By iOwnMyProperty = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/ul/li[1]/a");
	private By iLiveInRentedAccommodation = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/ul/li[2]/a");
	private By iAmHomeless = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/ul/li[3]/a");
	private By iOweMoney = new By.ByXPath(".//*[@id='content']/div[2]/article/div[2]/ul/li[4]/a");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	
	
	public void clickOwnMyProperty() throws Exception{
		click(iOwnMyProperty);
	}
	
	public void clickiLiveInRentedAccommodation() throws Exception{
		click(iLiveInRentedAccommodation);
	}
	
	public void clickIAmHomeless() throws Exception{
		click(iAmHomeless);
	}
	
	
	public void clickIOweMoney() throws Exception{
		click(iOweMoney);
	}
	
	public void clickChange() throws Exception{
	    click(changeLink);	
	}
	
	public CLA_WebDebtScopeDiagnosisPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}


}
