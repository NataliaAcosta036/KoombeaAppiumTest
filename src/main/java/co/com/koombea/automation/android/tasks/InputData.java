package co.com.koombea.automation.android.tasks;

import co.com.koombea.automation.android.interactions.SelectMeasure;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.LIST_FIRST_MEASURE_INPUT;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.FIRST_MEASURE_INPUT;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.SECOND_MEASURE_INPUT;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.VALUE_MEASURE_INPUT;



public class InputData implements Task {
    String firstMeasure;
    String secondMeasure;
    String valueMeasure;

    public InputData(String firstMeasure, String secondMeasure, String valueMeasure){
        this.firstMeasure = firstMeasure;
        this.secondMeasure = secondMeasure;
        this.valueMeasure = valueMeasure;
    }

    public static InputData with(String firstMeasure, String secondMeasure, String valueMeasure){
        return Tasks.instrumented(InputData.class, firstMeasure, secondMeasure,valueMeasure);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(FIRST_MEASURE_INPUT));
        //actor.attemptsTo(SelectMeasure.with(firstMeasure));
        //actor.attemptsTo(Click.on(SECOND_MEASURE_INPUT));
        //actor.attemptsTo(SelectMeasure.with(secondMeasure));
        //actor.attemptsTo(Enter.theValue(valueMeasure).into(VALUE_MEASURE_INPUT));

    }
}
