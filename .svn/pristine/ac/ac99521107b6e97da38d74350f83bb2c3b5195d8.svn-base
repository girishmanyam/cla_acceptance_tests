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
			".//*[@id='content']/div[2]/article/h1");
	
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
	
	public void setPartnerOtherIncome(String income) throws Exception{
		setText(partnerOtherIncome, income);
	}
	
	public void selectPartnerOtherIncomeIntervalByText(String option) throws Exception{
		setSelectOptionByVisibleText(partnerOtherIncomeInterval,option);
	}
	
	public void setPartnerPensionReceived(String pension) throws Exception{
		setText(partnerPensionReceived, pension);
	}
	
	public void selectPartnerPensionReceivedIntervalByText(String option) throws Exception{
		setSelectOptionByVisibleText(partnerPensionReceivedInterval, option);
	}
	
	public void setPartnerMaintenanceReceived(String maintenance) throws Exception{
		setText(partnerMaintenanceReceived, maintenance);
	}
	
	public void selectPartnerMaintenanceReceivedInterval(String option) throws Exception{
		setSelectOptionByVisibleText(partnerMaintenanceReceivedInterval, option);
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
