package co.com.koombea.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ApplicationPage {
    public static final Target MENU_BUTTON = Target.the("Menu button").locatedBy("//android.widget.ImageButton[@content-desc='Abrir el cajon de navegacion']");
    public static final Target FIRST_MEASURE_INPUT = Target.the("First Measure input").locatedBy("//android.widget.ImageView[@content-desc='Spinner'])[1]");
    public static final Target LIST_FIRST_MEASURE_INPUT = Target.the("List First Measure input").locatedBy("//android.widget.ListView[contains(@id,'android:id/select_dialog_listview')]");
    public static final Target SECOND_MEASURE_INPUT = Target.the("First Measure input").locatedBy("//android.widget.ImageView[@content-desc='Spinner'])[2]");
    public static final Target LENGTH_BUTTON = Target.the("length button").locatedBy("//android.widget.TextView[contains(@text,'Longitud')]");
    public static final Target AREA_BUTTON = Target.the("Area button").locatedBy("//android.widget.TextView[contains(@text,'Area')]");
    public static final Target VOLUME_BUTTON = Target.the("Volume button").locatedBy("//android.widget.TextView[contains(@text,'Volumen')]");
    public static final Target SPEED_BUTTON = Target.the("Speed button").locatedBy("//android.widget.TextView[contains(@text, 'Velocidad')]");
    public static final Target ACCELERATION_BUTTON = Target.the("Acceleration button").locatedBy("//android.widget.TextView[contains(@text, 'Aceleraci')]");
    public static final Target ANGULAR_SPEED_BUTTON = Target.the("Angular Speed button").locatedBy("//android.widget.TextView[contains(@text, 'Velocidad angular')]");
    public static final Target FLOW_SPEED_BUTTON = Target.the("Flow Speed button").locatedBy("//android.widget.TextView[contains(@text, 'Velocidad de flujo')]");
    public static final Target VALUE_MEASURE_INPUT = Target.the("Value Measure Input").located(By.id("com.ba.universalconverter:id/source_value"));
    public static final Target VALUE_MEASURE_RESULT = Target.the("Value Measure Input").located(By.id("com.ba.universalconverter:id/target_value"));
    public static final Target SEARCH_BUTTON = Target.the("Search button").located(By.id("com.ba.universalconverter:id/action_search"));
    public static final Target SEARCH_INPUT = Target.the("Search input").located(By.id("com.ba.universalconverter:id/search_src_text"));
    public static final Target PAGE_TO_SCROLL = Target.the("Page to scroll").located(By.id("com.ba.universalconverter:id/converter_section"));


}
