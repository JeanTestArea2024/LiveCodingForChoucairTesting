package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.common.CommonView;

public class LoginQuestions implements Question {
    private final String message;
    CommonView commonView = new CommonView();
    public LoginQuestions(String message) {
        this.message = message;
    }

    public static LoginQuestions withMessage(String message) {
        return new LoginQuestions(message);
    }

    @Override
    public Object answeredBy(Actor actor) {
        return CommonView.replaceLabelInLocator(commonView.getLocatorForText(),message).resolveFor(actor).getText();
    }

}
