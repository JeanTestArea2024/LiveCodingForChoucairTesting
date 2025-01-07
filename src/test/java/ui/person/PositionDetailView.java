package ui.person;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PositionDetailView {
    public static Target selectVacancy = Target.the("select Vacancy")
            .located(By.xpath("//label[text()='Vacancy']/../following-sibling::div/div/div"));
    public static Target optionsVacancy = Target.the("options Vacancy")
            .located(By.xpath("//*[text()='Payroll Administrator']"));
}
