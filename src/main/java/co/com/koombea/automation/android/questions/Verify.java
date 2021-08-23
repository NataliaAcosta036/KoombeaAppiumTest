package co.com.koombea.automation.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.VALUE_MEASURE_RESULT;

public class Verify implements Question<Boolean> {

    String finalValue;

    public Verify(String finalValue){
        this.finalValue = finalValue;
    }

    public static Verify the(String finalValue){
        return new Verify(finalValue);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(VALUE_MEASURE_RESULT).viewedBy(actor).asString().replace(" ","");
        return finalValue.equals(answer);
    }
}
