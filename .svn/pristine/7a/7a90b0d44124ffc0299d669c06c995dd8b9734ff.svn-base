package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebTellUsHowYouFeelPage extends SeleniumPage{
	private String expectedTextOnPage = "Thank you";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/header/div/h1");

	private By verySatisfied = new By.ByXPath(".//*[@id='very-satisfied']");
	private By satisfied = new By.ByXPath(".//*[@id='satisfied']");
	private By neitherSatisfiedOrDisatisfied = new By.ByXPath(".//*[@id='neither-satisfied-or-dissatisfied']");
	private By disatisfied = new By.ByXPath(".//*[@id='dissatisfied']");
	private By veryDisatisfied = new By.ByXPath(".//*[@id='very-dissatisfied']");
	
	private By improvementCommentTextbox = new By.ByXPath(".//*[@id='improvement-comments']");
	
	private By sendFeedbackButton = new By.ByXPath(".//*[@id='completed-transaction-form']/p/button");
	
	private By isThereAnythingWrongOnThisPageLink = new By.ByXPath(".//*[@id='wrapper']/div[2]/p/a");
	
	private By legalAidLink = new By.ByXPath("//*[@id='related']/div[1]/nav/ul/li/a");
	
	private By homeLink = new By.ByXPath(".//*[@id='global-breadcrumb']/ol/li/a");
	
	public void clickHome() throws Exception{
		click(homeLink);
	}
	
	public void clickLegalAid() throws Exception{
		click(legalAidLink);
	}
	
	public void clickIsThereAnyThingWrongOnThisPage() throws Exception{
		click(isThereAnythingWrongOnThisPageLink);
	}
	
	public void clickSendFeedback() throws Exception{
		click(sendFeedbackButton);
	}
	
	public void setImprovementCommentText(String comment) throws Exception{
		setText(improvementCommentTextbox, comment);
	}
	
	public void clickVeryDisatisfied() throws Exception{
		click(veryDisatisfied);
	}
	
	public void clickVerySatisfied() throws Exception{
		click(verySatisfied);
	}
	
	public void clickSatisfied() throws Exception{
		click(satisfied);
	}
	
	public void clickNeitherSatisfiedOrDisastisfied() throws Exception{
		click(neitherSatisfiedOrDisatisfied);
	}



	public CLA_WebTellUsHowYouFeelPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}
