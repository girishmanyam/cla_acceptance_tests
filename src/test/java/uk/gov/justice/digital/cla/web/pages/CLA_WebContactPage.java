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
	
	private By fullName = new By.ByXPath(".//*[@id='full_name']");
	private By helperFullName = new By.ByXPath(".//*[@id='third_party-third_party_name']");
	private By selectHelperRelationship = new By.ByXPath(".//*[@id='third_party-relationship']");
	
	private By preferenceCallCLARadioButton = new By.ByXPath(".//*[@id='callback_requested-0']");
	private By preferenceCallMeBackRadioButton = new By.ByXPath(".//*[@id='callback_requested-1']");
	
	private By callBackSafeToSaveYesRadioButton = new By.ByXPath(".//*[@id='callback-safe_to_contact-0']");
	private By callBackSafeToSaveNoRadioButton = new By.ByXPath(".//*[@id='callback-safe_to_contact-1']");
	
	private By callBackNumberTextBox = new By.ByXPath(".//*[@id='callback-contact_number']");
	
	private By submitDetails = new By.ByXPath(".//*[@id='content']/div[2]/article/form/p/button");
	
	private By extraNotesTextBox = new By.ByXPath(".//*[@id='extra_notes']");
	
	private By expected4000CharacterError = new By.ByXPath(".//*[@id='field-extra_notes']/div[1]/p");
	private String expected4000CharacterErrorText = "Your notes must be 4000 characters or less";
	
	private By selectDayToCall = new By.ByXPath(".//*[@id='id_day']");
	private By selectTimeToCall = new By.ByXPath(".//*[@id='id_time_in_day']");
	
	private By adaptionBSLWebCam = new By.ByXPath(".//*[@id='adaptations-bsl_webcam']");
	private By adaptionMiniCom = new By.ByXPath(".//*[@id='adaptations-minicom']");
	private By adaptionTextRelay = new By.ByXPath(".//*[@id='adaptations-text_relay']");
	private By adaptionWelsh = new By.ByXPath(".//*[@id='adaptations-welsh']");
	private By adaptionOtherLanguage = new By.ByXPath(".//*[@id='adaptations-is_other_language']");
	private By selectLanaguage = new By.ByXPath(".//*[@id='adaptations-other_language']");
	private By adaptionOther = new By.ByXPath(".//*[@id='adaptations-is_other_adaptation']");
	private By adaptionOtherText = new By.ByXPath(".//*[@id='adaptations-other_adaptation']");

	private By hasAnyoneHelpedYou_Yes = new By.ByXPath(".//*[@id='third_party_handled-0']");
	private By hasAnyoneHelpedYou_No = new By.ByXPath(".//*[@id='third_party_handled-1']");
	
	private By postcodeText = new By.ByXPath(".//*[@id='address-post_code']");
	
	private By findUKAddress = new By.ByXPath(".//*[@id='field-address-post_code']/div[1]/div/button");
	
	private By chooseAnAddress = new By.ByXPath(".//*[@id='field-address-post_code']/div[2]/select");
	
	private By addressText = new By.ByXPath(".//*[@id='address-street_address']");
	
	public void setAddressText(String address) throws Exception{
		setText(addressText, address);
	}
	
	public void selectAnAddressByIndex(int index) throws Exception{
		Thread.sleep(1000);
		setSelectOptionByIndex(chooseAnAddress, index);
	}
	
	public void clickFindUKAddress() throws Exception{
		click(findUKAddress);
	}
	
	public void selectDayToBeCalled(int index) throws Exception{
		setSelectOptionByIndex(selectDayToCall, index);
	}
	
	public void selectTimeToBeCalled(int index) throws Exception{
		setSelectOptionByIndex(selectTimeToCall, index);
	}
	
	public  void clickhasAnyoneHelpedYou_Yes() throws Exception{
		click(hasAnyoneHelpedYou_Yes);
	}
	
	public  void clickhasAnyoneHelpedYou_No() throws Exception{
		click(hasAnyoneHelpedYou_No);
	}
	
	
	public void clickAdaptionBSLWebCam() throws Exception{
		click(adaptionBSLWebCam);
	}
	
	public void clickAdaptionMiniCom() throws Exception{
		click(adaptionMiniCom);
	}
	
	
	public void clickAdaptionTextRelay() throws Exception{
		click(adaptionTextRelay);
	}
	
	
	public void clickAdaptionWelsh() throws Exception{
		click(adaptionWelsh);
	}
	
	
	public void clickAdaptionOtherLanguage() throws Exception{
		click(adaptionOtherLanguage);
	}
	
	public void selectAdaptionOtherLanugageByValue(String language) throws Exception{
		setSelectOptionByValue(selectLanaguage, language);
	}
	
	public void clickAdaptionOther() throws Exception{
		click(adaptionOther);
	}
	
	public void setAdaptionOtherText(String otherText) throws Exception{
		setText(adaptionOtherText, otherText);
	}
	
	public void clickCallBackSafeToSave_Yes() throws Exception{
		click(callBackSafeToSaveYesRadioButton);
	}
	
	public void clickCallBackSafeToSave_No() throws Exception{
		click(callBackSafeToSaveNoRadioButton);
	}
	
	public void setCallContactNumber(String phoneNumber) throws Exception{
		waitToGetElement(callBackNumberTextBox, HTTP_TIMEOUT);
		setText(callBackNumberTextBox, phoneNumber);
	}

	public CLA_WebContactPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void setFullName(String fullName) throws Exception {
		setText(this.fullName, fullName);
		
	}
	
	public void setHelperFullName(String helperFullName) throws Exception {
		setText(this.helperFullName, helperFullName);
		
	}
	
	public void selectHelperRelationshipByValue(String relationship) throws Exception{
		setSelectOptionByValue(selectHelperRelationship, relationship);
	}

	public void clickPreferenceCallCLARadioButton() throws Exception {
		click(preferenceCallCLARadioButton);
		
	}

	public void clickSubmitDetails() throws Exception {
		click(submitDetails);
	}

	public void setExtraNotes(String extraNotes) throws Exception {
		setText(extraNotesTextBox, extraNotes);
		
	}

	public boolean expected4000CharacterErrorTextDisplayed() throws Exception {
		return isTextContainedInInnerText(expected4000CharacterError,
				expected4000CharacterErrorText);
		
	}

	public void clickPreferenceCLACallBack() throws Exception {
		click(preferenceCallMeBackRadioButton);
		
	}

	public void setPostcode(String postcode) throws Exception {
		setText(postcodeText,postcode);
		
	}


}
