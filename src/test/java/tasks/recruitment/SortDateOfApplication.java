package tasks.recruitment;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.recruitment.RecruitmentView;

public class SortDateOfApplication implements Task {
    public static Performable navigateBar() {
        return Tasks.instrumented(SortDateOfApplication.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentView.dateOfApplicationIcon),
                Click.on(RecruitmentView.descendingSortOfDate)
        );
    }
}
