package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebOutGoingsPage extends SeleniumPage {
	
	private String expectedTextOnPage = "Your outgoings";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By rent = new By.ByXPath(".//*[@id='rent-per_interval_value']");
	private By maintenance = new By.ByXPath(".//*[@id='maintenance-per_interval_value']");
	private By incomeContribution = new By.ByXPath(".//*[@id='income_contribution']");
	
	private By rentPeriod = new By.ByXPath(".//*[@id='rent-interval_period']");
	private By maintenancePeriod = new By.ByXPath(".//*[@id='maintenance-interval_period']");
	
	private By reviewYourAnswersButton = new By.ByXPath(".//*[@id='content']/div/article/form/p/button");
	
	public void setRent(String rent) throws Exception{
		setText(this.rent,rent);
	}
	
    public void setMaintenance(String maintenance) throws Exception{
    	setText(this.maintenance, maintenance);
    }
    
    public void setIncomeContribution(String incomeContribution) throws Exception{
    	setText(this.incomeContribution, incomeContribution);
    }
    
    public void selectRentPeriodByValue(String period) throws Exception{
    	setSelectOptionByValue(rentPeriod, period);
    }
    
    public void selectMaintenancePeriodByValue(String period) throws Exception{
    	setSelectOptionByValue(maintenancePeriod, period);
    }
    
    public void clickReviewYourAnswers() throws Exception{
    	click(reviewYourAnswersButton);
    }
		
	public CLA_WebOutGoingsPage(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
