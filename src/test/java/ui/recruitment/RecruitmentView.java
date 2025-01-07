package ui.recruitment;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RecruitmentView {
    public static Target addButton = Target.the("add button")
            .located(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
    public static Target saveButton = Target.the("save button")
            .located(By.xpath("//button[@type='submit']"));
    public static Target shortlistButton = Target.the("shortlist button")
            .located(By.xpath("//button[contains(@class,'success')]"));
    public static Target saveShortlistButton = Target.the("save shortlist button")
            .located(By.xpath("//button[@type='submit']"));
}