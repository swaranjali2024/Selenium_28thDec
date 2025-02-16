package step_definitions;

import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import modules.LoginModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
 WebDriver driver;
    @Before
    public void setUp(){

        }

    @After
    public void tearDown(){
        DriverFactory.closeBrowser();
    }
}
