package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import com.sun.org.glassfish.external.arc.Taxonomy;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebIncomePage extends SeleniumPage {
	
	private String expectedTextOnPage = "Your money coming in";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By incomeBeforeTax = new By.ByXPath(".//*[@id='your_income-earnings-per_interval_value']");
	private By incomeBeforeTaxPeriod = new By.ByXPath(".//*[@id='your_income-earnings-per_interval_period']");

	private By incomeTax = new By.ByXPath(".//*[@id='your_income-income_tax-per_interval_value']");
	private By incomeTaxPeriod = new By.ByXPath(".//*[@id='your_income-income_tax-per_interval_period']");
	
	private By niContributions = new By.ByXPath(".//*[@id='your_income-national_insurance-per_interval_value']");
	private By niContributionsPeriod = new By.ByXPath(".//*[@id='your_income-national_insurance-per_interval_period']");	
	
	private By workingTaxCredit = new By.ByXPath(".//*[@id='your_income-working_tax_credit-per_interval_value']");
	private By workingTaxCreditPeriod = new By.ByXPath(".//*[@id='your_income-working_tax_credit-per_interval_period']");	

	private By maintenanceReceived = new By.ByXPath(".//*[@id='your_income-maintenance-per_interval_value']");
	private By maintenanceReceivedPeriod = new By.ByXPath(".//*[@id='your_income-maintenance-interval_period']");
	
	private By pensionReceived = new By.ByXPath(".//*[@id='your_income-pension-per_interval_value']");
	private By pensionReceivedPeriod = new By.ByXPath(".//*[@id='your_income-pension-interval_period']");
	
	private By anyOtherIncome = new By.ByXPath(".//*[@id='your_income-other_income-per_interval_value']");
	private By anyOtherIncomePeriod = new By.ByXPath(".//*[@id='your_income-other_income-interval_period']");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	private By continueButton = new By.ByXPath(".//*[@id='content']/div/article/form/p/button");
	
	
		
	public void setMaintenanceReceived(String maintenance) throws Exception{
		setText(maintenanceReceived, maintenance);
	}
	
	public void selectMaintenancePeriodByValue(String period) throws Exception{
		setSelectOptionByValue(maintenanceReceivedPeriod, period);
	}
	
	public void selectPensionPeriodByValue(String period) throws Exception{
		setSelectOptionByValue(pensionReceivedPeriod, period);
	}
	
	public void setAnyOtherIncome(String otherIncome) throws Exception{
		setText(anyOtherIncome, otherIncome);
	}
	
	public void selectAnyOtherIncomePeriodByValue(String period) throws Exception{
		setSelectOptionByValue(anyOtherIncomePeriod, period);
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

	public void selectIncomeInterval(String period) throws Exception {
		setSelectOptionByValue(incomeBeforeTaxPeriod, period);
		
	}

	public void setIncome(String value) throws Exception {
	   setText(incomeBeforeTax, value);		
	}

	public void setIncomeTax(String value) throws Exception {
		   setText(incomeTax, value);		
		
	}

	public void selectIncomeTaxInterval(String period) throws Exception {
		setSelectOptionByValue(incomeTaxPeriod, period);		
	}

	public void setNIContributions(String value) throws Exception {
		setText(niContributions, value);
		
	}

	public void selectNIContributionsInterval(String period) throws Exception {
		setSelectOptionByValue(niContributionsPeriod, period);		
	}

	public void setTaxCredit(String value) throws Exception {
		setText(workingTaxCredit, value);
	}

	public void selectTaxCreditInterval(String period) throws Exception {
		setSelectOptionByValue(workingTaxCreditPeriod, period);	
	}
	
	public void setPensionReceived(String pension) throws Exception{
		setText(pensionReceived, pension);
	}

	public void setPensionReceivedInterval(String period) throws Exception {
		setSelectOptionByValue(pensionReceivedPeriod, period);		
	}


}
