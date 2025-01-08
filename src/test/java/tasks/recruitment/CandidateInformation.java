package tasks.recruitment;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import ui.person.PersonDetailView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class CandidateInformation implements Task {
    private DataTable personDetail;
    private DataTable positionDetail;

    public CandidateInformation(DataTable personDetail, DataTable positionDetail) {
        this.personDetail = personDetail;
        this.positionDetail = positionDetail;
    }

    public static Performable login(DataTable dataTable) {
        return Tasks.instrumented(PersonDetailTo.class, dataTable);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        /*String personFullName = "";
        List<Map<String, String>> personDetailMaps = personDetail.asMaps(String.class, String.class);
        for (Map<String, String> row : personDetailMaps) {
            personFullName = row.get("firstName") + " " + row.get("middleName") + " " + row.get("lastName");
        }
        String positionName = "";
        List<Map<String, String>> positionDetailMaps = positionDetail.asMaps(String.class, String.class);
        for (Map<String, String> row : personDetailMaps) {
            positionName = row.get("vacancy");
        }
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
        String dateOfApplication = sdf.format(today);

        String status = "Hired";*/


    }
}
