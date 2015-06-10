package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDVWhatDoYouNeedHelpWithPage extends
		CLA_WebWhatDoYouNeedHelpWithPage {

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	private By domesticViolence = new By.ByXPath(
			xpath_Option_1);
	private By enforcingAJunction = new By.ByXPath(
			xpath_Option_2);
	private By harassment = new By.ByXPath(
			xpath_Option_3);
	private By contestingAnInjunction = new By.ByXPath(
			xpath_Option_4);
	private By forcedMarriage = new By.ByXPath(
			xpath_Option_5);
	private By femaleGenitalMutilation = new By.ByXPath(
			xpath_Option_6);
	private By anyOtherProblem = new By.ByXPath(
			xpath_Option_7);

	private By inImmediateDanger_Yes = new By.ByXPath(
			xpath_Option_1);
	private By inImmediateDanger_No = new By.ByXPath(
			xpath_Option_2);

	public CLA_WebDVWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickDomesticViolence() throws Exception {
		click(domesticViolence);
	}

	public void clickEnforcingAJunction() throws Exception {
		click(enforcingAJunction);
	}

	public void clickHarassment() throws Exception {
		click(harassment);
	}

	public void clickContestingAnInjunction() throws Exception {
		click(contestingAnInjunction);
	}

	public void clickForcedMarriage() throws Exception {
		click(forcedMarriage);
	}

	public void clickFemaleGenitalMutilation() throws Exception {
		click(femaleGenitalMutilation);
	}

	public void clickAnyOtherProblem() throws Exception {
		click(anyOtherProblem);
	}

	public void clickInImmediateDanger_Yes() throws Exception {
		click(inImmediateDanger_Yes);
	}

	public void clickInImmediateDanger_No() throws Exception {
		click(inImmediateDanger_No);
	}

}
