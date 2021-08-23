package co.com.koombea.automation.android.tasks;


import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.MENU_BUTTON;

public class OpenThe implements Task {

    String dimension;


    public OpenThe(String dimension){
        this.dimension = dimension;
    }

    public static OpenThe conversionApplication(String dimension){
        return Tasks.instrumented(OpenThe.class, dimension);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MENU_BUTTON));
        actor.attemptsTo(GoTo.option(dimension));

    }
}
