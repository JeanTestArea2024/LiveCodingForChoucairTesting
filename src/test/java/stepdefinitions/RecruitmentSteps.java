package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import tasks.dashboard.NavigateBarTo;
import tasks.recruitment.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecruitmentSteps {
    DataTable personDetail;
    DataTable positionDetail;

    @When("I choose the {string} option in the dashboard options menu")
    public void iChooseTheOptionInTheDashboardOptionsMenu(String options) {
        theActorInTheSpotlight().attemptsTo(new NavigateBarTo(options));
    }
    @And("click the {string} button")
    public void clickTheButton(String addButton) {
        theActorInTheSpotlight().attemptsTo(new AddCandidateTo(addButton));
    }
    @And("register the personal data of the candidate")
    public void registerThePersonalDataOfTheCandidate(DataTable dataTable) {
        this.personDetail = dataTable;
        theActorInTheSpotlight().attemptsTo(new PersonDetailTo(dataTable));
    }
    @And("register the position of the candidate")
    public void registerThePositionOfTheCandidate(DataTable dataTable) {
        this.positionDetail = dataTable;
        theActorInTheSpotlight().attemptsTo(new PositionDetailTo(dataTable));
    }
    @And("register the contact information of the candidate")
    public void registerTheContactInformationOfTheCandidate(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new AdditionalDetailTo(dataTable));
    }
    @And("save the candidate filled information")
    public void saveTheCandidateFilledInformation() {
        theActorInTheSpotlight().attemptsTo(new SaveCandidateTo());
    }
    @And("shortlist the candidate")
    public void shortlistTheCandidate() {
        theActorInTheSpotlight().attemptsTo(new ShortlistCandidateTo());
    }
    @And("save shortlist the candidate")
    public void saveShortlistTheCandidate() {
        theActorInTheSpotlight().attemptsTo(new SaveShortlistCandidateTo());
    }
    @And("schedule the candidate an interview")
    public void scheduleTheCandidateAnInterview() {
        theActorInTheSpotlight().attemptsTo(new ScheduleInterviewTo());
    }
    @And("register the interview details")
    public void registerInterviewDetails(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(new InterviewDetailsTo(dataTable));
    }
    @And("save interview schedule")
    public void saveInterviewSchedule() {
        theActorInTheSpotlight().attemptsTo(new SaveInterviewScheduleTo());
    }
    @And("mark interview passed")
    public void markInterviewPassed() {
        theActorInTheSpotlight().attemptsTo(new MarkInterviewPassed());
    }
    @And("save passed mark")
    public void savePassedMark() {
        theActorInTheSpotlight().attemptsTo(new SavePassedMark());
    }
    @And("offer job")
    public void offerJob() {
        theActorInTheSpotlight().attemptsTo(new OfferJob());
    }
    @And("save job offer")
    public void saveJobOffer() {
        theActorInTheSpotlight().attemptsTo(new SaveJobOffer());
    }
    @And("hire candidate")
    public void hireCandidate() {
        theActorInTheSpotlight().attemptsTo(new HireCandidate());
    }
    @And("save recruitment offer")
    public void saveRecruitmentOffer() {
        theActorInTheSpotlight().attemptsTo(new SaveRecruitmentOffer());
    }
    @And("select the {string} option in the dashboard options menu")
    public void selectTheOptionInTheDashboardOptionsMenu(String options) {
        theActorInTheSpotlight().attemptsTo(new NavigateBarTo(options));
    }
    @And("sort date of application by descending order")
    public void sortDateOfApplicationByDescendingOrder() {
        theActorInTheSpotlight().attemptsTo(new SortDateOfApplication());
    }
    @And("check that the candidate we just added appears correctly registered")
    public void checkThatTheCandidateWeJustAddedAppearsCorrectlyRegistered() {
        theActorInTheSpotlight().attemptsTo(new CandidateInformation(personDetail, positionDetail));
    }
}