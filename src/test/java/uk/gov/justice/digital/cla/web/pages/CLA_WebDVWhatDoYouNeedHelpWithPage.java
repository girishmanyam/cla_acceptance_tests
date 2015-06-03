package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDVWhatDoYouNeedHelpWithPage extends SeleniumPage {

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By domesticViolence = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By enforcingAJunction = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By harassment = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By contestingAnInjunction = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By forcedMarriage = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By femaleGenitalMutilation = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By anyOtherProblem = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[7]/a");
	private By inImmediateDanger_Yes = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By inImmediateDanger_No = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	

	public CLA_WebDVWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickDomesticViolence() throws Exception {
		click(domesticViolence);	
	}
	
	public void clickEnforcingAJunction() throws Exception{
		click(enforcingAJunction);
	}
	
	public void clickHarassment() throws Exception{
		click(harassment);
	}

	public void clickContestingAnInjunction() throws Exception{
		click(contestingAnInjunction);
	}
	
	public void clickForcedMarriage() throws Exception{
		click(forcedMarriage);
	}
	
	public void clickFemaleGenitalMutilation() throws Exception{
		click(femaleGenitalMutilation);
	}
	
	public void clickAnyOtherProblem() throws Exception{
		click(anyOtherProblem);
	}

	public void clickInImmediateDanger_Yes() throws Exception {
		click(inImmediateDanger_Yes);	
	}

	public void clickInImmediateDanger_No() throws Exception {
		click(inImmediateDanger_No);	
	}
	
}
