package tasks.recruitment;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import ui.login.LoginView;
import ui.person.PositionDetailView;
import ui.recruitment.RecruitmentView;

import java.util.List;
import java.util.Map;

public class InterviewDetailsTo implements Task {
    private DataTable dataTable;

    public InterviewDetailsTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable InterviewDetailsTo(DataTable dataTable) {
        return Tasks.instrumented(InterviewDetailsTo.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            actor.attemptsTo(
                    SendKeys.of(row.get("interviewTitle")).into(RecruitmentView.interviewTitleTextBox),
                    SendKeys.of(row.get("date")).into(RecruitmentView.interviewDateTextBox),
                    SendKeys.of(row.get("interviewer")).into(RecruitmentView.interviewerTextBox),
                    Hit.the(Keys.SPACE).into(RecruitmentView.interviewerTextBox)
            );

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            WebElementFacade element2 = RecruitmentView.interviewerListBoxOption.resolveFor(actor);
            element2.click();
        }
    }
}
