package tasks.recruitment;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import ui.person.PositionDetailView;

import java.util.List;
import java.util.Map;

public class PositionDetailTo implements Task {
    private DataTable dataTable;

    public PositionDetailTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable positionDetailTo(DataTable dataTable) {
        return Tasks.instrumented(PositionDetailTo.class, dataTable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            actor.attemptsTo(Click.on(PositionDetailView.selectVacancy));
            List<WebElementFacade> elements = PositionDetailView.optionsVacancy.resolveAllFor(actor);

            for (WebElementFacade element : elements) {
                if (element.getText().equals(row.get("vacancy"))) {
                    element.click();
                    break;
                }

            }
        }
    }
}
