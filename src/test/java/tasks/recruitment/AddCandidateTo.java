package tasks.recruitment;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.dashboard.NavigationBarView;
import ui.login.LoginView;
import ui.recruitment.RecruitmentView;

import java.util.List;

public class AddCandidateTo implements Task {
    private final String add;
    public AddCandidateTo(String add) {
        this.add = add;
    }

    public static Performable navigateBar(String options) {
        return Tasks.instrumented(AddCandidateTo.class, options);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RecruitmentView.addButton)
        );
    }
}
