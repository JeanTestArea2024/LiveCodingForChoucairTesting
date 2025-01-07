package ui.person;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdditionalDetailView {

    public static Target email = Target.the("email")
            .located(By.xpath("//label[ text()='Email']/../following-sibling::div/input"));
    public static Target contactNumber = Target.the("contactNumber")
            .located(By.xpath("//label[ text()='Contact Number']/../following-sibling::div/input"));
}
