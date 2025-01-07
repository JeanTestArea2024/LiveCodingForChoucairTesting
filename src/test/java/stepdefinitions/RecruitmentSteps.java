package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import tasks.dashboard.NavigateBarTo;
import tasks.recruitment.*;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecruitmentSteps {
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
        theActorInTheSpotlight().attemptsTo(new PersonDetailTo(dataTable));
    }
    @And("register the position of the candidate")
    public void registerThePositionOfTheCandidate(DataTable dataTable) {
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
}