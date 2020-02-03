package stepDef;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.Log;
import java.net.MalformedURLException;

public class Hooks {

    String log4jConfPath = "log4j.properties";


    @Before(order = 1)
    public void setUp(Scenario scenario){
        PropertyConfigurator.configure(log4jConfPath);
        Log.startLog("Starting testing");
        System.out.println("Scenario: " + scenario.getName());
    }

    @Before(value = "@test", order = 2)
    public void test(){
        System.out.println("Test tag is running now and it's before that");
    }

    @After
    public  void tearDown(Scenario scenario) throws MalformedURLException {
        PropertyConfigurator.configure(log4jConfPath);


        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");
            Log.error("Error detected");
        }
        Log.endLog("Test is ending");

        Driver.closeDriver();

    }
}
