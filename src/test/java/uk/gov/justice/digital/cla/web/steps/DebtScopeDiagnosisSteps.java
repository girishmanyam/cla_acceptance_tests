package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.web.pages.CLA_WebDebtWhatDoYouNeedHelpWithPage;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;

public class DebtScopeDiagnosisSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public DebtScopeDiagnosisSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}



	@When("^I click that I am in rented accommodation and being evicted$")
	public void i_click_that_I_am_in_rented_accommodation_and_being_evicted() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickiLiveInRentedAccommodationAndBeingEvicted();
	}


	@Then("^I click that I owe money$")
	public void i_click_that_I_owe_money() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickIOweMoney();
	}

	@Then("^I verify I am on debt scope diagnosis page$")
	public void i_verify_I_am_on_debt_scope_diagnosis_page() throws Throwable {
		assertTrue(PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.verifyOnPage());
	}


	@Then("^I am redirected to the debty scope diagnosis page$")
	public void i_am_redirected_to_the_debty_scope_diagnosis_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.verifyOnPage());
	}

	@Then("^I am redirected to the debt what do you need help with page$")
	public void i_am_redirected_to_the_debt_what_do_you_need_help_with_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.verifyOnPage());
	}

	@Then("^I verify that legal aid is not available for this problem$")
	public void i_verify_that_legal_aid_is_not_available_for_this_problem()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebLegalAidIsNotAvailablePage(driver)
				.verifyOnPage());
	}

	@When("^I click I am becoming homeless$")
	public void i_click_I_am_becoming_homeless() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickBecomingHomeless();
	}

	@When("^I click I am losing my accommodation because UKVI is refusing support$")
	public void i_click_I_am_losing_my_accommodation_because_UKVI_is_refusing_support()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickLoosingAccommodationUKVIRefusing();
	}

	@When("^I click I eviction$")
	public void i_click_I_eviction() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickEviction();
	}

	@When("^I click eviction with notice$")
	public void i_click_eviction_with_notice() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickEvictionWithNotice();
	}

	@When("^I click unlawful eviction$")
	public void i_click_unlawful_eviction() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickUnlawfulEviction();
	}

	@When("^I click home in disrepair$")
	public void i_click_home_in_disrepair() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickYourHomeisInDisrepair();
	}

	@When("^I click YES this put me in risk of injury or illness$")
	public void i_click_YES_this_put_me_in_risk_of_injury_or_illness()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickYouOrYourFamilyisInRiskOfInjuryOrIllness_Yes();
	}

	@When("^I click NO this put me in risk of injury or illness$")
	public void i_click_NO_this_put_me_in_risk_of_injury_or_illness()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickYouOrYourFamilyisInRiskOfInjuryOrIllness_No();
	}

	@When("^I click harassment$")
	public void i_click_harassment() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickHarassment();
	}

	@When("^I click by a neighbour or landlord$")
	public void i_click_by_a_neighbour_or_landlord() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickHarassmentByNeighbourOrLandlord();
	}

	@When("^I click by a partner or family member$")
	public void i_click_by_a_partner_or_family_member() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickHarassmentPartnerOrFamilyMember();
	}

	@When("^I click YES I am in immediate risk of harm$")
	public void i_click_YES_I_am_in_immediate_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickHarasementPartnerOrFamilyMemberInJeopardy_Yes();
	}

	@When("^I click NO I am in immediate risk of harm$")
	public void i_click_NO_I_am_in_immediate_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickHarasementPartnerOrFamilyMemberInJeopardy_No();
	}

	@When("^I click by a someone else$")
	public void i_click_by_a_someone_else() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickHarassmentSomeOneElse();
	}

	@When("^I click discrimination$")
	public void i_click_discrimination() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscrimination();
	}

	@When("^I click by age$")
	public void i_click_by_age() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByAge();
	}

	@When("^I click I am (\\d+) or over$")
	public void i_click_I_am_or_over(int arg1) throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscrimination18OrOver();
	}

	@When("^I click at work$")
	public void i_click_at_work() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationAtWork();
	}

	@When("^I click I am under (\\d+)$")
	public void i_click_I_am_under(int arg1) throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationUnder18();
	}

	@When("^I click while using a service$")
	public void i_click_while_using_a_service() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationUsingAService();
	}

	@When("^I click at a private club$")
	public void i_click_at_a_private_club() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationAtAPrivateClub();
	}

	@When("^I click when someone was carrying out a public function$")
	public void i_click_when_someone_was_carrying_out_a_public_function()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationWhenSomeOneWasPeformingAPublicFunction();
	}

	@When("^I click at university$")
	public void i_click_at_university() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationAtUniversity();
	}

	@When("^I click other$")
	public void i_click_other() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationOther();
	}

	@When("^I click disability$")
	public void i_click_disability() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByDisability();
	}

	@When("^I click disability discrimination at work$")
	public void i_click_disability_discrimination_at_work() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityAtWork();
	}

	@When("^I click disability discrimination at home$")
	public void i_click_disability_discrimination_at_home() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityAtHome();
	}

	@When("^I click disability discrimination while using a service$")
	public void i_click_disability_discrimination_while_using_a_service()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityUsingAService();
	}

	@When("^I click disability discrimination at a private club$")
	public void i_click_disability_discrimination_at_a_private_club()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityAtAPrivateClub();
	}

	@When("^I click disability discrimination when someone was carrying out a public function$")
	public void i_click_disability_discrimination_when_someone_was_carrying_out_a_public_function()
			throws Throwable {
		PageFactory
				.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityWhenSomeOneWasPeformingAPublicFunction();
	}

	@When("^I click disability discrimination at school or college$")
	public void i_click_disability_discrimination_at_school_or_college()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityAtSchoolOrCollege();
	}

	@When("^I click disability discrimination at university$")
	public void i_click_disability_discrimination_at_university()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityAtUniversity();
	}

	@When("^I click disability discrimination other$")
	public void i_click_disability_discrimination_other() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationDisabilityOther();
	}

	@When("^I click gender$")
	public void i_click_gender() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByGender();
	}

	@When("^I click gender discrimination at work$")
	public void i_click_gender_discrimination_at_work() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderAtWork();
	}

	@When("^I click gender discrimination at home$")
	public void i_click_gender_discrimination_at_home() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderAtHome();
	}

	@When("^I click gender discrimination while using a service$")
	public void i_click_gender_discrimination_while_using_a_service()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderUsingAService();
	}

	@When("^I click gender discrimination at a private club$")
	public void i_click_gender_discrimination_at_a_private_club()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderAtAPrivateClub();
	}

	@When("^I click gender discrimination when someone was carrying out a public function$")
	public void i_click_gender_discrimination_when_someone_was_carrying_out_a_public_function()
			throws Throwable {
		PageFactory
				.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderWhenSomeOneWasPeformingAPublicFunction();
	}

	@When("^I click gender discrimination at school or college$")
	public void i_click_gender_discrimination_at_school_or_college()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderAtSchoolOrCollege();
	}

	@When("^I click gender discrimination at university$")
	public void i_click_gender_discrimination_at_university() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderAtUniversity();
	}

	@When("^I click gender discrimination other$")
	public void i_click_gender_discrimination_other() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationGenderOther();
	}

	@When("^I click marriage$")
	public void i_click_marriage() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByMarriageOrCivilPartnership();
	}

	@When("^I click marriage discrimination at work$")
	public void i_click_marriage_discrimination_at_work() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByMarriageOrCivilPartnershipAtWork();
	}

	@When("^I click marriage discrimination other$")
	public void i_click_marriage_discrimination_other() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByMarriageOrCivilPartnershipOther();
	}

	@When("^I click race$")
	public void i_click_race() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByRace();
	}

	@When("^I click race discrimination at work$")
	public void i_click_race_discrimination_at_work() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceAtWork();
	}

	@When("^I click race discrimination at home$")
	public void i_click_race_discrimination_at_home() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceAtHome();
	}

	@When("^I click race discrimination while using a service$")
	public void i_click_race_discrimination_while_using_a_service()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceUsingAService();
	}

	@When("^I click race discrimination at a private club$")
	public void i_click_race_discrimination_at_a_private_club()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceAtAPrivateClub();
	}

	@When("^I click race discrimination when someone was carrying out a public function$")
	public void i_click_race_discrimination_when_someone_was_carrying_out_a_public_function()
			throws Throwable {
		PageFactory
				.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceWhenSomeOneWasPeformingAPublicFunction();
	}

	@When("^I click race discrimination at school or college$")
	public void i_click_race_discrimination_at_school_or_college()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceAtSchoolOrCollege();
	}

	@When("^I click race discrimination at university$")
	public void i_click_race_discrimination_at_university() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceAtUniversity();
	}

	@When("^I click race discrimination other$")
	public void i_click_race_discrimination_other() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationRaceOther();
	}

	@When("^I click religion$")
	public void i_click_religion() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationByReligion();
	}

	@When("^I click religion discrimination at work$")
	public void i_click_religion_discrimination_at_work() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionAtWork();
	}

	@When("^I click religion discrimination at home$")
	public void i_click_religion_discrimination_at_home() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
		.clickDiscriminationReligionAHome();
	}

	@When("^I click religion discrimination while using a service$")
	public void i_click_religion_discrimination_while_using_a_service()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionUsingAService();
	}

	@When("^I click religion discrimination at a private club$")
	public void i_click_religion_discrimination_at_a_private_club()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionAtAPrivateClub();
	}

	@When("^I click religion discrimination when someone was carrying out a public function$")
	public void i_click_religion_discrimination_when_someone_was_carrying_out_a_public_function()
			throws Throwable {
		PageFactory
				.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionWhenSomeOneWasPeformingAPublicFunction();
	}

	@When("^I click religion discrimination at school or college$")
	public void i_click_religion_discrimination_at_school_or_college()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionAtSchoolOrCollege();
	}

	@When("^I click religion discrimination at university$")
	public void i_click_religion_discrimination_at_university()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionAtUniversity();
	}

	@When("^I click religion discrimination other$")
	public void i_click_religion_discrimination_other() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationReligionOther();
	}

	@When("^I click other discrimination$")
	public void i_click_other_discrimination() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickDiscriminationNoneOfTheAbove();
	}

	@When("^I click ASBO or ASBI$")
	public void i_click_ASBO_or_ASBI() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickASBOOrASBI();
	}

	@When("^I click social housing landlord$")
	public void i_click_social_housing_landlord() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickASBOOrASBIASocialHousingLandlord();
	}

	@When("^I click private landlord$")
	public void i_click_private_landlord() throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickASBOOrASBIAAPrivateLord();
		;
	}

	@When("^I click rented accommodation none of the above$")
	public void i_click_rented_accommodation_none_of_the_above()
			throws Throwable {
		PageFactory.getCLAWebDebtWhatDoYouNeedHelpWithPage(driver)
				.clickRentedAccommodationNoneOfTheAbove();
	}

}
