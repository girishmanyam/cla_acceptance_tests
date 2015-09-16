package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebIncomePage extends SeleniumPage {
	
	private String expectedTextOnPage = "Your money coming in";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By maintenanceReceived = new By.ByXPath(".//*[@id='your_income-maintenance-per_interval_value']");
	private By maintenanceReceivedPeriod = new By.ByXPath(".//*[@id='your_income-maintenance-interval_period']");
	
	private By pensionReceived = new By.ByXPath(".//*[@id='your_income-pension-per_interval_value']");
	private By pensionReceivedPeriod = new By.ByXPath(".//*[@id='your_income-pension-interval_period']");
	
	private By anyOtherIncome = new By.ByXPath(".//*[@id='your_income-other_income-per_interval_value']");
	private By anyOtherIncomePeriod = new By.ByXPath(".//*[@id='your_income-other_income-interval_period']");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	private By continueButton = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p/button");
	
	
	public void setMaintenanceReceived(String maintenance) throws Exception{
		setText(maintenanceReceived, maintenance);
	}
	
	public void setPensionReceived(String pension) throws Exception{
		setText(pensionReceived, pension);
	}
	
	public void setAnyOtherIncome(String otherIncome) throws Exception{
		setText(anyOtherIncome, otherIncome);
	}
	
	public void selectMaintenancePeriodByValue(String period) throws Exception{
		setSelectOptionByVisibleText(maintenanceReceivedPeriod, period);
	}
	
	public void selectPensionPeriodByValue(String period) throws Exception{
		setSelectOptionByVisibleText(pensionReceivedPeriod, period);
	}
	
	public void selectAnyOtherIncomePeriodByValue(String period) throws Exception{
		setSelectOptionByVisibleText(anyOtherIncomePeriod, period);
	}
	
	public void clickGetInTouch() throws Exception{
		click(getInTouchLink);
	}
	
	public void clickContinue() throws Exception{
		click(continueButton);
		Thread.sleep(300);
	}
	
	public CLA_WebIncomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		Thread.sleep(500);
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}


}
