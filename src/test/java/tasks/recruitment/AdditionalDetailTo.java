package tasks.recruitment;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeys;
import ui.common.CommonView;
import ui.person.AdditionalDetailView;

import java.util.List;
import java.util.Map;

public class AdditionalDetailTo implements Task {
    private DataTable dataTable;
    CommonView commonView = new CommonView();

    public AdditionalDetailTo(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    public static Performable additionalDetailTo(DataTable dataTable) {
        return Tasks.instrumented(AdditionalDetailTo.class, dataTable);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            actor.attemptsTo(
                    SendKeys.of(row.get("email")).into(AdditionalDetailView.email),
                    SendKeys.of(row.get("contactNumber")).into(AdditionalDetailView.contactNumber)
            );
        }
    }
}
