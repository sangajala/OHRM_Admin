package OrangeHRM.OHRM_Admin;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest extends BaseClass
{
    //static WebDriver driver;
      @BeforeClass
	  public static void startBrowser() throws MalformedURLException// throws Exception
	  {
	   //Creating a Firefox WebDriver Object
     // driver = new FirefoxDriver();
          //Create an object for Desired Capabilities
          DesiredCapabilities caps = DesiredCapabilities.chrome();
          caps.setCapability("platform", "Windows 7");
          caps.setCapability("version", "35");
       //-----------------------
       // Create the connection to Sauce Labs to run the tests
          driver = new RemoteWebDriver(
          new java.net.URL("http://daninsauce:855db6d4-a7fe-4382-8f64-b9f75cb1ee65@ondemand.saucelabs.com:80/wd/hub"),
                  caps);
//          new URL("http://cb_sgoud843:d0a05dc9-8302-4210-9ed0-9a74b760afe2@ondemand.saucelabs.com:80/wd/hub"),
//                 caps);
		//Open the URL
          driver.get("http://demo.orangehrmlive.com/");
	   //Maximising the window
	    driver.manage().window().maximize();
	   //waiting for page to load
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }



@AfterClass
	  public static void stopBrowser() throws Exception {
		//killing the driver object
	    driver.quit();
	   
	  }
}
