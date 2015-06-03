package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;



public class CLA_WebYourPropertyPage extends SeleniumPage {
	
	private String expectedTextOnPage = "Your property";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By propertyIsMainHome_Yes = new By.ByXPath(".//*[@id='properties-0-is_main_home-0']");
	private By propertyIsMainHome_No = new By.ByXPath(".//*[@id='properties-0-is_main_home-1']");
	
	private By doesAnyoneElseOwnAShareOfTheProperty_Yes = new By.ByXPath(".//*[@id='properties-0-other_shareholders-0']");
	private By doesAnyoneElseOwnAShareOfTheProperty_No = new By.ByXPath(".//*[@id='properties-0-other_shareholders-1']");
	
	private By howMuchIsThePropertyWorth = new By.ByXPath(".//*[@id='properties-0-property_value']");
	
	private By howMuchIsMortgageIsRemaining = new By.ByXPath(".//*[@id='properties-0-mortgage_remaining']");
	
	private By lastMonthMortgagePayment = new By.ByXPath(".//*[@id='properties-0-mortgage_payments']");
	
	private By doYouRentTheProperty_Yes = new By.ByXPath(".//*[@id='properties-0-is_rented-0']");
	private By doYouRentTheProperty_No = new By.ByXPath(".//*[@id='properties-0-is_rented-1']");
	
	private By isYourShareOfThePropertyInDispute_Yes = new By.ByXPath(".//*[@id='properties-0-in_dispute-0']");
	private By isYourShareOfThePropertyInDispute_No = new By.ByXPath(".//*[@id='properties-0-in_dispute-1']");
	
	private By addAnotherProperty = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p[1]/input");
	
	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");
	
	private By continueButton = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p[2]/button");
	
	public void setLastMonthMortgagePayment(String payment) throws Exception{
		setText(lastMonthMortgagePayment,payment);
	}
	
	public void clickPropertyIsMainHome_Yes() throws Exception{
		click(propertyIsMainHome_Yes);
	}
	
	public void clickPropertyIsMainHome_No() throws Exception{
		click(propertyIsMainHome_No);
	}
	
	public void clickDoesAnyoneElseOwnAShareOfTheProperty_Yes() throws Exception{
		click(doesAnyoneElseOwnAShareOfTheProperty_Yes);
	}
	
	public void clickDoesAnyoneElseOwnAShareOfTheProperty_No() throws Exception{
		click(doesAnyoneElseOwnAShareOfTheProperty_No);
	}
	
	public void setHowMuchThePropertyIsWorth(String value) throws Exception{
		setText(howMuchIsThePropertyWorth, value);
	}
	
	public void setHowMuchMortgageIsRemaining(String value) throws Exception{
		setText(howMuchIsMortgageIsRemaining, value);
	}
	
	public void clickDoYouRentTheProperty_Yes() throws Exception{
		click(doYouRentTheProperty_Yes);
	}
	
	public void clickDoYouRentTheProperty_No() throws Exception{
		click(doYouRentTheProperty_No);
	}
	
	public void clickIsYourShareOfThePropertyInDispute_Yes() throws Exception{
		click(isYourShareOfThePropertyInDispute_Yes);
	}
	
	public void clickIsYourShareOfThePropertyInDispute_No() throws Exception{
		click(isYourShareOfThePropertyInDispute_No);
	}
	
	public void clickAddAnotherProperty() throws Exception{
		click(addAnotherProperty);
	}
	
	public void clickGetInTouch() throws Exception{
		click(getInTouchLink);
	}
	
	public CLA_WebYourPropertyPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickContinue() throws Exception{
		Thread.sleep(200);
		click(continueButton);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
