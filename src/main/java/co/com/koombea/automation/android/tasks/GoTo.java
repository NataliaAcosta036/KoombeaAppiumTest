package co.com.koombea.automation.android.tasks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.LENGTH_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.AREA_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.VOLUME_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.SPEED_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.ACCELERATION_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.ANGULAR_SPEED_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.FLOW_SPEED_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.SEARCH_BUTTON;
import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.SEARCH_INPUT;
import static  co.com.koombea.automation.android.userinterfaces.ApplicationPage.PAGE_TO_SCROLL;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class GoTo implements Task {

    String option;
    AppiumDriver driver;


    public GoTo(String option) {
        this.option = option;

    }

    public static GoTo option(String option){
        return Tasks.instrumented(GoTo.class, option);
    }

    public void Scroll(Actor actor){
        WebDriver driver = getProxiedDriver();
        TouchAction action = new TouchAction((AppiumDriver) driver);
        Dimension dimension = driver.manage().window().getSize();
        int posicionInicialX = dimension.width / 2;
        int posicionInicialY = (dimension.height / 2)+300;
        int posicionFinalY = PAGE_TO_SCROLL.resolveFor(actor).getCoordinates().onPage().y;
        action.longPress(PointOption.point(posicionInicialX, posicionInicialY));
        action.moveTo(PointOption.point(posicionInicialX, 0));
        action.release().perform();


    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (option){



            case "Longitud":
                System.out.println("3. Entré a GoTO");

                actor.attemptsTo(Click.on(LENGTH_BUTTON));
                break;

            case "Area":

                actor.attemptsTo(Click.on(AREA_BUTTON));
                break;

            case "Volumen":

                actor.attemptsTo(Click.on(VOLUME_BUTTON));
                break;

            case "Velocidad":

                Scroll(actor);
                actor.attemptsTo(Click.on(SPEED_BUTTON));

                break;

            case "Aceleracion":

                Scroll(actor);
                actor.attemptsTo(Click.on(ACCELERATION_BUTTON));

                break;

            case "Vel Angular":

                Scroll(actor);
                actor.attemptsTo(Click.on(ANGULAR_SPEED_BUTTON));
                break;

            case "Vel Flujo":

                Scroll(actor);
                actor.attemptsTo(Click.on(FLOW_SPEED_BUTTON));
                break;
        }

    }
}
