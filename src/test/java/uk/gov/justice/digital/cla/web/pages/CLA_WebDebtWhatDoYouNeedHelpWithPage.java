package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDebtWhatDoYouNeedHelpWithPage extends CLA_WebWhatDoYouNeedHelpWithPage {

	protected String expectedTextOnPage = "Choose the option that best describes your debt problem";

	private By changeLink = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div[1]/a/ul/li[2]/span[2]");

	private By iOwnMyProperty = new By.ByXPath(
			xpath_Option_1);
	private By iLiveInRentedAccommodationAndBeingEvicted = new By.ByXPath(
			xpath_Option_2);
	private By iOweMoney = new By.ByXPath(
			xpath_Option_3);

	private By atRiskOfLosingYourHome_Yes = new By.ByXPath(
			xpath_Option_1);
	private By atRiskOfLosingYourHome_No = new By.ByXPath(
			xpath_Option_2);

	private By becomingHomeless = new By.ByXPath(xpath_Option_1);
	private By loosingAccommodationUKVIRefusing = new By.ByXPath(
			xpath_Option_2);

	private By eviction = new By.ByXPath(
			xpath_Option_3);
	private By unlawfulEviction = new By.ByXPath(
			xpath_Option_1);
	private By evictionWithNotice = new By.ByXPath(
			xpath_Option_2);

	private By yourHomeisInDisrepair = new By.ByXPath(
			xpath_Option_4);
	private By youOrYourFamilyisInRiskOfInjuryOrIllness_Yes = new By.ByXPath(
			xpath_Option_1);
	private By youOrYourFamilyisInRiskOfInjuryOrIllness_No = new By.ByXPath(
			xpath_Option_2);

	private By harassment = new By.ByXPath(
			xpath_Option_5);

	private By harassmentByNeighbourOrLandlord = new By.ByXPath(
			xpath_Option_1);

	private By harassmentPartnerOrFamilyMember = new By.ByXPath(
			xpath_Option_2);
	private By harasementPartnerOrFamilyMemberInJeopardy_Yes = new By.ByXPath(
			xpath_Option_1);
	private By harasementPartnerOrFamilyMemberInJeopardy_No = new By.ByXPath(
			xpath_Option_2);

	private By harassmentSomeOneElse = new By.ByXPath(
			xpath_Option_3);

	private By discrimination = new By.ByXPath(
			xpath_Option_6);
	private By discriminationByAge = new By.ByXPath(
			xpath_Option_1);

	private By discrimination18OrOver = new By.ByXPath(
			xpath_Option_1);
	private By discriminationUnder18 = new By.ByXPath(
			xpath_Option_2);

	private By discriminationAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationUsingAService = new By.ByXPath(
			xpath_Option_2);
	private By discriminationAtAPrivateClub = new By.ByXPath(
			xpath_Option_3);
	private By discriminationWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			xpath_Option_4);
	private By discriminationAtUniversity = new By.ByXPath(
			xpath_Option_5);
	private By discriminationOther = new By.ByXPath(
			xpath_Option_6);

	private By discriminationByDisability = new By.ByXPath(
			xpath_Option_2);
	private By discriminationDisabilityAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationDisabilityAtHome = new By.ByXPath(
			xpath_Option_2);
	private By discriminationDisabilityUsingAService = new By.ByXPath(
			xpath_Option_3);
	private By discriminationDisabilityAtAPrivateClub = new By.ByXPath(
			xpath_Option_4);
	private By discriminationDisabilityWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			xpath_Option_5);
	private By discriminationDisabilityAtSchoolOrCollege = new By.ByXPath(
			xpath_Option_6);
	private By discriminationDisabilityAtUniversity = new By.ByXPath(
			xpath_Option_7);
	private By discriminationDisabilityOther = new By.ByXPath(
			xpath_Option_8);

	private By discriminationByGender = new By.ByXPath(
			xpath_Option_3);

	private By discriminationGenderAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationGenderAtHome = new By.ByXPath(
			xpath_Option_2);
	private By discriminationGenderUsingAService = new By.ByXPath(
			xpath_Option_3);
	private By discriminationGenderAtAPrivateClub = new By.ByXPath(
			xpath_Option_4);
	private By discriminationGenderWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			xpath_Option_5);
	private By discriminationGenderAtSchoolOrCollege = new By.ByXPath(
			xpath_Option_6);
	private By discriminationGenderAtUniversity = new By.ByXPath(
			xpath_Option_7);
	private By discriminationGenderOther = new By.ByXPath(
			xpath_Option_8);

	private By discriminationByMarriageOrCivilPartnership = new By.ByXPath(
			xpath_Option_4);

	private By discriminationByMarriageOrCivilPartnershipAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationByMarriageOrCivilPartnershipOther = new By.ByXPath(
			xpath_Option_2);

	private By discriminationByPregnancyOrMaternity = new By.ByXPath(
			xpath_Option_5);

	private By discriminationPregnancyAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationPregnancyUsingAService = new By.ByXPath(
			xpath_Option_2);
	private By discriminationPregnancyAtAPrivateClub = new By.ByXPath(
			xpath_Option_3);
	private By discriminationPregnancyWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			xpath_Option_4);
	private By discriminationPregnancyAtSchoolOrCollege = new By.ByXPath(
			xpath_Option_5);
	private By discriminationPregnancyAtUniversity = new By.ByXPath(
			xpath_Option_6);
	private By discriminationPregnancyOther = new By.ByXPath(
			xpath_Option_7);

	private By discriminationByRace = new By.ByXPath(
			xpath_Option_6);

	private By discriminationRaceAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationRaceAtHome = new By.ByXPath(
			xpath_Option_2);
	private By discriminationRaceUsingAService = new By.ByXPath(
			xpath_Option_3);
	private By discriminationRaceAtAPrivateClub = new By.ByXPath(
			xpath_Option_4);
	private By discriminationRaceWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			xpath_Option_5);
	private By discriminationRaceAtSchoolOrCollege = new By.ByXPath(
			xpath_Option_6);
	private By discriminationRaceAtUniversity = new By.ByXPath(
			xpath_Option_7);
	private By discriminationRaceOther = new By.ByXPath(
			xpath_Option_8);

	private By discriminationByReligion = new By.ByXPath(
			xpath_Option_7);

	private By discriminationReligionAtWork = new By.ByXPath(
			xpath_Option_1);
	private By discriminationReligionAtHome= new By.ByXPath(
			xpath_Option_2);
	private By discriminationReligionUsingAService = new By.ByXPath(
			xpath_Option_3);
	private By discriminationReligionAtAPrivateClub = new By.ByXPath(
			xpath_Option_4);
	private By discriminationReligionWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			xpath_Option_5);
	private By discriminationReligionAtSchoolOrCollege = new By.ByXPath(
			xpath_Option_6);
	private By discriminationReligionAtUniversity = new By.ByXPath(
			xpath_Option_7);
	private By discriminationReligionOther = new By.ByXPath(
			xpath_Option_8);

	private By discriminationNoneOfTheAbove = new By.ByXPath(
			xpath_Option_8);
	
	private By aSBOOrASBI = new By.ByXPath(xpath_Option_7);
	
	private By aSBOOrASBIASocialHousingLandlord = new By.ByXPath(xpath_Option_1);
	private By aSBOOrASBIAAPrivateLord = new By.ByXPath(xpath_Option_2);
	
	private By rentedAccommodationNoneOfTheAbove = new By.ByXPath(xpath_Option_8);
	
	
	public void clickDiscriminationDisabilityAtHome() throws Exception{
		click(discriminationDisabilityAtHome);
	}

	public void clickRentedAccommodationNoneOfTheAbove() throws Exception{
		click(rentedAccommodationNoneOfTheAbove);
	}
	
	public void clickASBOOrASBIAAPrivateLord() throws Exception {
		click(aSBOOrASBIAAPrivateLord);
	}
	
	public void clickASBOOrASBIASocialHousingLandlord() throws Exception {
		click(aSBOOrASBIASocialHousingLandlord);
	}	

	public void clickASBOOrASBI() throws Exception {
		click(aSBOOrASBI);
	}
	
	public void clickDiscriminationNoneOfTheAbove() throws Exception {
		click(discriminationNoneOfTheAbove);
	}
	
	public void clickDiscriminationByReligion() throws Exception {
		click(discriminationByReligion);
	}

	public void clickDiscriminationReligionOther() throws Exception {
		click(discriminationReligionOther);
	}

	public void clickDiscriminationReligionAtUniversity() throws Exception {
		click(discriminationReligionAtUniversity);
	}

	public void clickDiscriminationReligionAtSchoolOrCollege() throws Exception {
		click(discriminationReligionAtSchoolOrCollege);
	}

	public void clickDiscriminationReligionWhenSomeOneWasPeformingAPublicFunction()
			throws Exception {
		click(discriminationReligionWhenSomeOneWasPeformingAPublicFunction);
	}

	public void clickDiscriminationReligionAtAPrivateClub() throws Exception {
		click(discriminationReligionAtAPrivateClub);
	}

	public void clickDiscriminationReligionUsingAService() throws Exception {
		click(discriminationReligionUsingAService);
	}

	public void clickDiscriminationReligionAtWork() throws Exception {
		click(discriminationReligionAtWork);
	}
	
	public void clickDiscriminationReligionAHome() throws Exception {
		click(discriminationReligionAtHome);
	}
	
	public void clickDiscriminationByRace() throws Exception {
		click(discriminationByRace);
	}

	public void clickDiscriminationRaceOther() throws Exception {
		click(discriminationRaceOther);
	}

	public void clickDiscriminationRaceAtUniversity() throws Exception {
		click(discriminationRaceAtUniversity);
	}

	public void clickDiscriminationRaceAtSchoolOrCollege() throws Exception {
		click(discriminationRaceAtSchoolOrCollege);
	}

	public void clickDiscriminationRaceWhenSomeOneWasPeformingAPublicFunction()
			throws Exception {
		click(discriminationRaceWhenSomeOneWasPeformingAPublicFunction);
	}

	public void clickDiscriminationRaceAtAPrivateClub() throws Exception {
		click(discriminationRaceAtAPrivateClub);
	}

	public void clickDiscriminationRaceUsingAService() throws Exception {
		click(discriminationRaceUsingAService);
	}
	
	public void clickDiscriminationRaceAtHome() throws Exception {
		click(discriminationRaceAtHome);
	}

	public void clickDiscriminationRaceAtWork() throws Exception {
		click(discriminationRaceAtWork);
	}

	public void clickDiscriminationByMarriageOrCivilPartnership()
			throws Exception {
		click(discriminationByMarriageOrCivilPartnership);
	}

	public void clickDiscriminationByMarriageOrCivilPartnershipAtWork() throws Throwable {
		click(discriminationByMarriageOrCivilPartnershipAtWork);
	}


	public void clickDiscriminationByMarriageOrCivilPartnershipOther() throws Throwable {
		click(discriminationByMarriageOrCivilPartnershipOther);
	}

	public void clickDiscriminationByGender() throws Exception {
		click(discriminationByGender);
	}

	public void clickDiscriminationGenderOther() throws Exception {
		click(discriminationGenderOther);
	}

	public void clickDiscriminationGenderAtUniversity() throws Exception {
		click(discriminationGenderAtUniversity);
	}

	public void clickDiscriminationGenderAtSchoolOrCollege() throws Exception {
		click(discriminationGenderAtSchoolOrCollege);
	}

	public void clickDiscriminationGenderWhenSomeOneWasPeformingAPublicFunction()
			throws Exception {
		click(discriminationGenderWhenSomeOneWasPeformingAPublicFunction);
	}

	public void clickDiscriminationGenderAtAPrivateClub() throws Exception {
		click(discriminationGenderAtAPrivateClub);
	}

	public void clickDiscriminationGenderUsingAService() throws Exception {
		click(discriminationGenderUsingAService);
	}

	public void clickDiscriminationGenderAtHome() throws Exception {
		click(discriminationGenderAtHome);
	}

	public void clickDiscriminationGenderAtWork() throws Exception {
		click(discriminationGenderAtWork);
	}

	public void clickDiscriminationDisabilityOther() throws Exception {
		click(discriminationDisabilityOther);
	}

	public void clickDiscriminationDisabilityAtUniversity() throws Exception {
		click(discriminationDisabilityAtUniversity);
	}

	public void clickDiscriminationDisabilityAtSchoolOrCollege()
			throws Exception {
		click(discriminationDisabilityAtSchoolOrCollege);
	}

	public void clickDiscriminationDisabilityWhenSomeOneWasPeformingAPublicFunction()
			throws Exception {
		click(discriminationDisabilityWhenSomeOneWasPeformingAPublicFunction);
	}

	public void clickDiscriminationDisabilityAtAPrivateClub() throws Exception {
		click(discriminationDisabilityAtAPrivateClub);
	}

	public void clickDiscriminationDisabilityUsingAService() throws Exception {
		click(discriminationDisabilityUsingAService);
	}

	public void clickDiscriminationDisabilityAtWork() throws Exception {
		click(discriminationDisabilityAtWork);
	}

	public void clickDiscriminationByDisability() throws Exception {
		click(discriminationByDisability);

	}

	public void clickDiscriminationOther() throws Exception {
		click(discriminationOther);
	}

	public void clickDiscriminationAtUniversity() throws Exception {
		click(discriminationAtUniversity);
	}

	public void clickDiscriminationWhenSomeOneWasPeformingAPublicFunction()
			throws Exception {
		click(discriminationWhenSomeOneWasPeformingAPublicFunction);
	}

	public void clickDiscriminationAtAPrivateClub() throws Exception {
		click(discriminationAtAPrivateClub);
	}

	public void clickDiscriminationUsingAService() throws Exception {
		click(discriminationUsingAService);
	}

	public void clickDiscriminationAtWork() throws Exception {
		click(discriminationAtWork);
	}

	public void clickDiscrimination18OrOver() throws Exception {
		click(discrimination18OrOver);
	}

	public void clickDiscriminationUnder18() throws Exception {
		click(discriminationUnder18);
	}

	public void clickDiscriminationByAge() throws Exception {
		click(discriminationByAge);
	}

	public void clickDiscrimination() throws Exception {
		click(discrimination);
	}

	public void clickHarassmentSomeOneElse() throws Exception {
		click(harassmentSomeOneElse);
	}

	public void clickHarasementPartnerOrFamilyMemberInJeopardy_Yes()
			throws Exception {
		click(harasementPartnerOrFamilyMemberInJeopardy_Yes);
	}

	public void clickHarasementPartnerOrFamilyMemberInJeopardy_No()
			throws Exception {
		click(harasementPartnerOrFamilyMemberInJeopardy_No);
	}

	public void clickHarassmentPartnerOrFamilyMember() throws Exception {
		click(harassmentPartnerOrFamilyMember);
	}

	public void clickHarassmentByNeighbourOrLandlord() throws Exception {
		click(harassmentByNeighbourOrLandlord);
	}

	public void clickHarassment() throws Exception {
		click(harassment);
	}

	public void clickYouOrYourFamilyisInRiskOfInjuryOrIllness_No()
			throws Exception {
		click(youOrYourFamilyisInRiskOfInjuryOrIllness_No);
	}

	public void clickYouOrYourFamilyisInRiskOfInjuryOrIllness_Yes()
			throws Exception {
		click(youOrYourFamilyisInRiskOfInjuryOrIllness_Yes);
	}

	public void clickYourHomeisInDisrepair() throws Exception {
		click(yourHomeisInDisrepair);
	}

	public void clickEvictionWithNotice() throws Exception {
		click(evictionWithNotice);
	}

	public void clickUnlawfulEviction() throws Exception {
		click(unlawfulEviction);
	}

	public void clickEviction() throws Exception {
		click(eviction);
	}

	public void clickLoosingAccommodationUKVIRefusing() throws Exception {
		click(loosingAccommodationUKVIRefusing);
	}

	public void clickBecomingHomeless() throws Exception {
		click(becomingHomeless);
	}

	public void clickAtRiskOfLosingYourHome_Yes() throws Exception {
		click(atRiskOfLosingYourHome_Yes);
	}

	public void clickAtRiskOfLosingYourHome_No() throws Exception {
		click(atRiskOfLosingYourHome_No);
	}

	private By getInTouchLink = new By.ByXPath(".//*[@id='callback-link']");

	public void clickOwnMyProperty() throws Exception {
		click(iOwnMyProperty);
	}

	public void clickiLiveInRentedAccommodationAndBeingEvicted() throws Exception {
		click(iLiveInRentedAccommodationAndBeingEvicted);
	}


	public void clickIOweMoney() throws Exception {
		click(iOweMoney);
	}

	public void clickChange() throws Exception {
		click(changeLink);
	}

	public CLA_WebDebtWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}

	public boolean verifyOnPage() throws Exception {
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
