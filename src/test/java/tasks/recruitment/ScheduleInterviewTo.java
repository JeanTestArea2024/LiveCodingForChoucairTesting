package tasks.recruitment;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.recruitment.RecruitmentView;

public class ScheduleInterviewTo implements Task {
    public static Performable navigateBar(String options) {
        return Tasks.instrumented(ScheduleInterviewTo.class, options);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentView.scheduleInterviewButton)
        );
    }
}