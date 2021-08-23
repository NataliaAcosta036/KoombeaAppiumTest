package co.com.koombea.automation.android.stepdefinitions;

import co.com.koombea.automation.android.questions.Verify;
import co.com.koombea.automation.android.tasks.InputData;
import co.com.koombea.automation.android.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ConversionStepDefinitions {

    Actor user = new Actor("Maria");
    DesiredCapabilities capabilities = new DesiredCapabilities();




    @Given("^that the user selected the (.*) in the Conversion application$")
    public void thatTheUserSelectedTheInTheConversionApplication(String dimension) {
        OnStage.theActorCalled("Maria").wasAbleTo(OpenThe.conversionApplication(dimension));
    }


    @When("^the user selects the (.*) and the (.*) and enter the (.*)$")
    public void theUserSelectsTheAndTheAndEnterThe(String firstMeasure, String secondMeasure, String valueMeasure) {
        OnStage.theActorCalled("Maria").attemptsTo(InputData.with(firstMeasure, secondMeasure, valueMeasure));

    }

    @Then("^you should see the correct conversion (.*)$")
    public void youShouldSeeTheCorrectConversion(String finalValue) {
        OnStage.theActorCalled("Maria").should(GivenWhenThen.seeThat(Verify.the(finalValue)));

    }

}
