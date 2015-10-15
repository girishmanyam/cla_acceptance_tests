package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

public class CLA_WebYouAndYourPartnersOutgoingsPage  extends CLA_WebIncomePage {

	public CLA_WebYouAndYourPartnersOutgoingsPage(WebDriver driver) {
		super(driver);
	}
	
	private String expectedTextOnPage = "You and your partner’s outgoings";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By outgoingRent = new By.ByXPath(".//*[@id='rent-per_interval_value']");
	private By outgoingRentInterval = new By.ByXPath(".//*[@id='rent-interval_period']");
	
	private By outgoingMaintenance = new By.ByXPath(".//*[@id='maintenance-per_interval_value']");
	private By outgoingMaintenanceInterval = new By.ByXPath(".//*[@id='maintenance-interval_period']");
	
	private By monthyIncomeContributionOrder = new By.ByXPath(".//*[@id='income_contribution']");
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void setMonthyIncomeContributionOrder(String value) throws Exception {
		setText(monthyIncomeContributionOrder, value);
		
	}

	public void setOutgoingRentPeriod(String period) throws Exception {
		setSelectOptionByValue(outgoingRentInterval, period);
		
	}
	
	public void setOutgoingMaintenance(String value) throws Exception {
		setText(outgoingMaintenance, value);
		
	}

	public void setOutgoingMaintenancePeriod(String period) throws Exception {
		setSelectOptionByValue(outgoingMaintenanceInterval, period);
		
	}
	
	public void setOutgoingRent(String value) throws Exception {
		setText(outgoingRent, value);
		
	}

}
