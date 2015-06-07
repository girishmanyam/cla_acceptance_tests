package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebDebtWhatDoYouNeedHelpWithPage extends SeleniumPage {

	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	private By changeLink = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div[1]/a/ul/li[2]/span[2]");

	private By iOwnMyProperty = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By iLiveInRentedAccommodation = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By iAmHomeless = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By iOweMoney = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");

	private By atRiskOfLosingYourHome_Yes = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By atRiskOfLosingYourHome_No = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By becomingHomeless = new By.ByXPath(
			"	.//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By loosingAccommodationUKVIRefusing = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By eviction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By unlawfulEviction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By evictionWithNotice = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By yourHomeisInDisrepair = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By youOrYourFamilyisInRiskOfInjuryOrIllness_Yes = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By youOrYourFamilyisInRiskOfInjuryOrIllness_No = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By harassment = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");

	private By harassmentByNeighbourOrLandlord = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");

	private By harassmentPartnerOrFamilyMember = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By harasementPartnerOrFamilyMemberInJeopardy_Yes = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By harasementPartnerOrFamilyMemberInJeopardy_No = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By harassmentSomeOneElse = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");

	private By discrimination = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By discriminationByAge = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");

	private By discrimination18OrOver = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationUnder18 = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By discriminationAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationUsingAService = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationAtAPrivateClub = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By discriminationWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By discriminationAtUniversity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By discriminationOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");

	private By discriminationByDisability = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationDisabilityAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationDisabilityAtHome = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationDisabilityUsingAService = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By discriminationDisabilityAtAPrivateClub = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By discriminationDisabilityWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By discriminationDisabilityAtSchoolOrCollege = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By discriminationDisabilityAtUniversity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[7]/a");
	private By discriminationDisabilityOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[8]/a");

	private By discriminationByGender = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");

	private By discriminationGenderAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationGenderAtHome = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationGenderUsingAService = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By discriminationGenderAtAPrivateClub = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By discriminationGenderWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By discriminationGenderAtSchoolOrCollege = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By discriminationGenderAtUniversity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[7]/a");
	private By discriminationGenderOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[8]/a");

	private By discriminationByMarriageOrCivilPartnership = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");

	private By discriminationByMarriageOrCivilPartnershipAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationByMarriageOrCivilPartnershipOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");

	private By discriminationByPregnancyOrMaternity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");

	private By discriminationPregnancyAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationPregnancyUsingAService = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationPregnancyAtAPrivateClub = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By discriminationPregnancyWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By discriminationPregnancyAtSchoolOrCollege = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By discriminationPregnancyAtUniversity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By discriminationPregnancyOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[7]/a");

	private By discriminationByRace = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");

	private By discriminationRaceAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationRaceAtHome = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationRaceUsingAService = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By discriminationRaceAtAPrivateClub = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By discriminationRaceWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By discriminationRaceAtSchoolOrCollege = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By discriminationRaceAtUniversity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[7]/a");
	private By discriminationRaceOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[8]/a");

	private By discriminationByReligion = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[7]/a");

	private By discriminationReligionAtWork = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By discriminationReligionAtHome= new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	private By discriminationReligionUsingAService = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[3]/a");
	private By discriminationReligionAtAPrivateClub = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[4]/a");
	private By discriminationReligionWhenSomeOneWasPeformingAPublicFunction = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[5]/a");
	private By discriminationReligionAtSchoolOrCollege = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[6]/a");
	private By discriminationReligionAtUniversity = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[7]/a");
	private By discriminationReligionOther = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[8]/a");

	private By discriminationNoneOfTheAbove = new By.ByXPath(
			".//*[@id='content']/div[2]/article/div/ul/li[8]/a");
	
	private By aSBOOrASBI = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[7]/a");
	
	private By aSBOOrASBIASocialHousingLandlord = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[1]/a");
	private By aSBOOrASBIAAPrivateLord = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[2]/a");
	
	private By rentedAccommodationNoneOfTheAbove = new By.ByXPath(".//*[@id='content']/div[2]/article/div/ul/li[8]/a");
	
	
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

	public void clickiLiveInRentedAccommodation() throws Exception {
		click(iLiveInRentedAccommodation);
	}

	public void clickIAmHomeless() throws Exception {
		click(iAmHomeless);
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
