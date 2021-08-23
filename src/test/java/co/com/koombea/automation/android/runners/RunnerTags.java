package co.com.koombea.automation.android.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/preciseUnitConversion.feature",
        glue = {"co.com.koombea.automation.android.stepdefinitions", "co.com.koombea.automation.android.utils"},
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
