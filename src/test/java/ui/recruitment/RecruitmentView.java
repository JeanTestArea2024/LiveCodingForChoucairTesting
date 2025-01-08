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
    public static Target scheduleInterviewButton = Target.the("schedule interview button")
            .located(By.xpath("//button[contains(@class,'success')]"));
    public static Target saveInterviewSchedule = Target.the("save shortlist button")
            .located(By.xpath("//button[@type='submit']"));

    public static Target interviewTitleTextBox = Target.the("interview title text box")
            .located(By.xpath("//label[text()='Interview Title']/../following-sibling::div/input"));
    public static Target interviewDateTextBox = Target.the("interview date text box")
            .located(By.xpath("//label[text()='Date']/../following-sibling::div/div/div/input"));


    public static Target interviewerTextBox = Target.the("interviewer text box")
            .located(By.xpath("//label[text()='Interviewer']/../following-sibling::div/div/div/input"));
    public static Target interviewerListBoxOption = Target.the("interview list box option")
            .located(By.xpath("//div[@role='listbox']"));

    public static Target markInterviewPassedButton = Target.the("mark interview passed button")
            .located(By.xpath("//button[contains(@class,'success')]"));

    public static Target savePassedMarkButton = Target.the("mark interview passed button")
            .located(By.xpath("//button[@type='submit']"));

    public static Target offerJobButton = Target.the("offer job button")
            .located(By.xpath("//*[text()=' Offer Job ']"));

    public static Target saveJobOfferButton = Target.the("save job offer button")
            .located(By.xpath("//button[@type='submit']"));

    public static Target hireButton = Target.the("hire button")
            .located(By.xpath("//*[text()=' Hire ']"));

    public static Target saveRecruitmentOffer = Target.the("save recruitment offer")
            .located(By.xpath("//button[@type='submit']"));

    public static Target dateOfApplicationIcon = Target.the("date of application")
            .located(By.xpath("//*[text()='Date of Application']/div/i"));

    public static Target descendingSortOfDate = Target.the("descending sort of date")
            .located(By.xpath("//div[@class='--active oxd-table-header-sort-dropdown']//span[text()='Descending']"));

    public static Target sortedCandidate = Target.the("sortedCandidate")
            .located(By.xpath("//div[@role='row']"));
}