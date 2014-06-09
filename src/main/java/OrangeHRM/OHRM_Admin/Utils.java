package OrangeHRM.OHRM_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BaseClass{

public void selectFromDropDownMenu(By by,String text)
{
	Select sel=new Select(driver.findElement(by));
	sel.selectByVisibleText(text);
}

public static boolean isTextPresent(String text)
{
    return getVisibleText().contains(text);
}

public static String getVisibleText()
{
    
    return driver.findElement(By.tagName("body")).getText();
}

}
