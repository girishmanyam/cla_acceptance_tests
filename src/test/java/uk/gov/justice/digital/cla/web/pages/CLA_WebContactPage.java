package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.factories.FakeDataFactory;
import uk.gov.justice.digital.cla.factories.FakeDataFactory.Mode;
import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebContactPage extends SeleniumPage {
	

	private String expectedTextOnPage = "Contact Civil Legal Advice";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");
	
	private By contactName = new By.ByXPath(".//*[@id='full_name']");
	
	private By preferenceCallCLARadioButton = new By.ByXPath(".//*[@id='callback_requested-0']");
	private By preferenceCallMeBackRadioButton = new By.ByXPath(".//*[@id='callback_requested-1']");
	
	private By callBackSafeToSaveYesRadioButton = new By.ByXPath(".//*[@id='callback-safe_to_contact-0']");
	private By callBackSafeToSaveNoRadioButton = new By.ByXPath(".//*[@id='callback-safe_to_contact-1']");
	
	private By callBackNumberTextBox = new By.ByXPath(".//*[@id='callback-contact_number']");
	
	private By submitDetails = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p/button");
	
	private By situationDescriptionTextBox = new By.ByXPath(".//*[@id='extra_notes']");
	
	private By expected4000CharacterError = new By.ByXPath(".//*[@id='field-extra_notes']/div[1]/p");
	private String expected4000CharacterErrorText = "Your notes must be 4000 characters or less";
	
	
	public void clickCallBackSaveToSave_Yes() throws Exception{
		click(callBackSafeToSaveYesRadioButton);
	}
	
	public void clickCallBackSaveToSave_No() throws Exception{
		click(callBackSafeToSaveNoRadioButton);
	}
	
	public void setCallBackNumber(String phoneNumber) throws Exception{
		waitToGetElement(callBackNumberTextBox, HTTP_TIMEOUT);
		setText(callBackNumberTextBox, phoneNumber);
	}
	
	public void clickCallMeBack() throws Exception{
		click(preferenceCallMeBackRadioButton);
	}
	

	public CLA_WebContactPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void setContactName(String contactName) throws Exception {
		setText(this.contactName, contactName);
		
	}

	public void clickPreferenceCallCLARadioButton() throws Exception {
		click(preferenceCallCLARadioButton);
		
	}

	public void clickSubmitDetails() throws Exception {
		click(submitDetails);
	}

	public void setSituationDesription(int numberOfCharacters) throws Exception {
		setText(situationDescriptionTextBox, FakeDataFactory.generateRandomString(numberOfCharacters, Mode.ALPHANUMERIC));
		
	}

	public boolean expected4000CharacterErrorTextDisplayed() throws Exception {
		return isTextContainedInInnerText(expected4000CharacterError,
				expected4000CharacterErrorText);
		
	}


}
