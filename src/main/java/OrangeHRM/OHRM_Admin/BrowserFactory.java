package OrangeHRM.OHRM_Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by sriramangajala on 09/06/2014.
 */
public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        //Creating a Firefox WebDriver Object
        driver = new FirefoxDriver();
        driver.get("http://demo.orangehrmlive.com/");

        return driver;
    }
}
