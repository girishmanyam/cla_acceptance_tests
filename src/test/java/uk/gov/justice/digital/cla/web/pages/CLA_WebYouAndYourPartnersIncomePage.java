package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

public class CLA_WebYouAndYourPartnersIncomePage extends CLA_WebIncomePage {

	public CLA_WebYouAndYourPartnersIncomePage(WebDriver driver) {
		super(driver);
	}
	
	private String expectedTextOnPage = "You and your partner’s money coming in";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	private By yourIncome = new By.ByXPath(".//*[@id='your_income-earnings-per_interval_value']");
	private By yourIncomeInterval = new By.ByXPath(".//*[@id='your_income-earnings-interval_period']");
	private By yourIncomeTax = new By.ByXPath(".//*[@id='your_income-income_tax-per_interval_value']");
	private By yourIncomeTaxInterval = new By.ByXPath(".//*[@id='your_income-income_tax-interval_period']");
	private By yourNIContributions = new By.ByXPath(".//*[@id='your_income-national_insurance-per_interval_value']");
	private By yourNIContributionsInterval = new By.ByXPath(".//*[@id='your_income-national_insurance-interval_period']");
	private By yourWorkingTaxCredit = new By.ByXPath(".//*[@id='your_income-working_tax_credit-per_interval_value']");
	private By yourWorkingTaxCreditInterval = new By.ByXPath(".//*[@id='your_income-working_tax_credit-interval_period']");

	private By yourMaintenance = new By.ByXPath(".//*[@id='your_income-maintenance-per_interval_value']");
	private By yourMaintenanceInterval = new By.ByXPath(".//*[@id='your_income-maintenance-per_interval_period']");
	private By yourPension = new By.ByXPath(".//*[@id='your_income-pension-per_interval_value']");
	private By yourPensionInterval = new By.ByXPath(".//*[@id='your_income-pension-interval_period']");
	private By yourOtherIncome = new By.ByXPath(".//*[@id='your_income-other_income-per_interval_value']");
	private By yourOtherIncomeInterval = new By.ByXPath(".//*[@id='your_income-other_income-per_interval_period']");
	
	private By partnerIncome = new By.ByXPath(".//*[@id='partner_income-earnings-per_interval_value']");
	private By partnerIncomeInterval = new By.ByXPath(".//*[@id='partner_income-earnings-interval_period']");
	private By partnerIncomeTax = new By.ByXPath(".//*[@id='partner_income-income_tax-per_interval_value']");
	private By partnerIncomeTaxInterval = new By.ByXPath(".//*[@id='partner_income-income_tax-interval_period']");
	private By partnerNIContributions = new By.ByXPath(".//*[@id='partner_income-national_insurance-per_interval_value']");
	private By partnerNIContributionsInterval = new By.ByXPath(".//*[@id='partner_income-national_insurance-interval_period']");
	private By partnerWorkingTaxCredit = new By.ByXPath(".//*[@id='partner_income-working_tax_credit-per_interval_value']");
	private By partnerWorkingTaxCreditInterval = new By.ByXPath(".//*[@id='partner_income-working_tax_credit-interval_period']");
	private By partnerMaintenanceReceived = new By.ByXPath(".//*[@id='partner_income-maintenance-per_interval_value']");
	private By partnerMaintenanceReceivedInterval = new By.ByXPath(".//*[@id='partner_income-maintenance-interval_period']");
	private By partnerPensionReceived = new By.ByXPath(".//*[@id='partner_income-pension-per_interval_value']");
	private By partnerPensionReceivedInterval = new By.ByXPath(".//*[@id='partner_income-pension-interval_period']");
	private By partnerOtherIncome = new By.ByXPath(".//*[@id='partner_income-other_income-per_interval_value']");
	private By partnerOtherIncomeInterval = new By.ByXPath(".//*[@id='partner_income-other_income-interval_period']");
	
	public void setYourMaintenanceReceived(String maintenance) throws Exception{
		setText(yourMaintenance, maintenance);
	}
	
	public void selectYourMaintenanceReceivedInterval(String option) throws Exception{
		setSelectOptionByVisibleText(yourMaintenanceInterval, option);
	}
	
	public void setYourPensionReceived(String pension) throws Exception{
		setText(yourPension, pension);
	}
	
	public void selectYourPensionReceivedIntervalByText(String option) throws Exception{
		setSelectOptionByVisibleText(yourPensionInterval, option);
	}
	
	public void setYourOtherIncome(String income) throws Exception{
		setText(yourOtherIncome, income);
	}
	
	public void selectYourOtherIncomeIntervalByText(String option) throws Exception{
		setSelectOptionByVisibleText(yourOtherIncomeInterval,option);
	}
	
	public void setPartnerOtherIncome(String income) throws Exception{
		setText(partnerOtherIncome, income);
	}
	
	public void selectPartnerOtherIncomeIntervalByText(String option) throws Exception{
		setSelectOptionByValue(partnerOtherIncomeInterval,option);
	}
	
	public void setPartnerPensionReceived(String pension) throws Exception{
		setText(partnerPensionReceived, pension);
	}
	
	public void selectPartnerPensionReceivedIntervalByText(String option) throws Exception{
		setSelectOptionByValue(partnerPensionReceivedInterval, option);
	}
	
	public void setPartnerMaintenanceReceived(String maintenance) throws Exception{
		setText(partnerMaintenanceReceived, maintenance);
	}
	
	public void selectPartnerMaintenanceReceivedInterval(String option) throws Exception{
		setSelectOptionByValue(partnerMaintenanceReceivedInterval, option);
	}
	
	public void setPartnerWorkingTaxCredit(String credit) throws Exception{
		setText(partnerWorkingTaxCredit, credit);
	}
	
	public void selectPartnerWorkingTaxCreditInterval(String option) throws Exception{
		setSelectOptionByVisibleText(partnerWorkingTaxCreditInterval, option);
	}
	
	public void  setPartnerIncome(String income) throws Exception{
		setText(partnerIncome, income);
	}
	
	public void selectPartnerIncomeInterval(String option ) throws Exception{
		setSelectOptionByVisibleText(partnerIncomeInterval, option);
	}
	
	public void setPartnerIncomeTax(String tax) throws Exception{
		setText(partnerIncomeTax, tax);
	}
	
	public void selectPartnerIncomeTaxInterval(String option) throws Exception{
		setSelectOptionByVisibleText(partnerIncomeTaxInterval, option);
	}
	
	public void setPartnerNIContributions(String ni) throws Exception{
		setText(partnerNIContributions, ni);
	}
	
	public void selectPartnerNIContributionsInterval(String option) throws Exception{
		setSelectOptionByVisibleText(partnerNIContributionsInterval, option);
	}
		
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}	

}
