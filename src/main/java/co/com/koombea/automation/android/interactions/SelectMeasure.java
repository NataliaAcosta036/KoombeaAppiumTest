package co.com.koombea.automation.android.interactions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;

import static co.com.koombea.automation.android.userinterfaces.ApplicationPage.LIST_FIRST_MEASURE_INPUT;


import java.util.List;

public class SelectMeasure implements Interaction {

    String measure;

    public SelectMeasure(String measure){
        this.measure = measure;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<AndroidElement> listOfMeasure = LIST_FIRST_MEASURE_INPUT.resolveFor(actor).findElements(By.className("android.widget.TextView"));
        for(int i=0; i<listOfMeasure.size();i++){
            if(listOfMeasure.get(i).getText().contains(measure)){
                listOfMeasure.get(i).click();

            }

        }
    }

    public static SelectMeasure with (String measure){
        return new SelectMeasure(measure);
    }
}
