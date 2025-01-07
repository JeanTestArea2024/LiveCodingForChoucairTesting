package ui.person;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonDetailView {
    public static Target firstName = Target.the("firstName")
            .located(By.name("firstName"));
    public static Target middleName = Target.the("middleName")
            .located(By.name("middleName"));
    public static Target lastName = Target.the("lastName")
            .located(By.name("lastName"));
}