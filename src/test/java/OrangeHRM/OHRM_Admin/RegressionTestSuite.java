package OrangeHRM.OHRM_Admin;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class RegressionTestSuite extends BaseTest{
	//Declaring the WebDriver instance variable
	BusinessLibrary blib=new BusinessLibrary();
	Utils util=new Utils();
	
	//Test Data
	String username="admin",password="admin";
	Random ran=new Random();
	//Test Data for add employee
	String firstname="manjunatha"+ran.nextInt();
	String lastname="AK",username1="manju"+ran.nextInt();
	String password1="manjunath",Confpwd="manjunath";
	String status="Enabled";
	//Test Data for edit add employee
	String lastname1="AK"+ran.nextInt();
	String nationality="Indian";
	//Test data for emergency contacts
	String emgcontacts_name="ulffa"+ran.nextInt();
	String emgcontacts_relationship="brother";
	String emgcontacts_homePhone="01912722857";
	//Test data for add dependents
	String dependent_name="kirann"+ran.nextInt();
	String dependent_relationshipType="Child";
	//Test data for addjob title
	String jobTitle_jobTitle="Software test engnineer"+ran.nextInt();
	String jobTitle_jobDescription="looking for ma brothers";
	String jobTitle_note="immediately";
	
	

@Before
public void login()
{
	//Login
	//Clear the username text box and enter the username as "admin"
   	driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys(username);
   
    //Clear the password text box and enter the password as "admin"
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys(password);
    
    driver.findElement(By.id("btnLogin")).click();
}
@After
public void logout()
{
	//Logout
    driver.findElement(By.id("welcome")).click();
    driver.findElement(By.linkText("Logout")).click();

}

@Test
public void verifyAdminCanAddEmployee()
{

Assert.assertTrue(driver.findElement(By.id("menu_dashboard_index")).getText().contains("Dashboard"));
blib.addEmp(firstname, lastname, username1, password1, Confpwd, status);

}

@Test
public void verifyAdminCanAddEmployeeinvalid()
{

Assert.assertTrue(driver.findElement(By.id("menu_dashboard_index")).getText().contains("Dashboard"));
blib.addEmp("","", "", "", "", status);

}

//@Test
public void verifyAdminCanEditEmp()
{
   
blib.editEmp(lastname1,nationality);
	
	}

//@Test
public void verifyadmincaneditempwithinvalid()
{

blib.editEmp("",nationality);
	  
}

//@Test
public void verifyemergencycontacts()
{
	blib.addemergencycontacts(emgcontacts_name,emgcontacts_relationship,emgcontacts_homePhone);
}

//@Test
public void verifyemergencycontactsinvalid()
{
	blib.addemergencycontacts("","","");
}

//@Test
public void verifyadddependents()
{
	blib.adddependencies(dependent_name,dependent_relationshipType);
}
//@Test
public void verifyadddependentsinvvalid()
{
	blib.adddependencies("",nationality);
	
}

@Test


public void verifyaddjobtitlevalid()
{
	blib.addjobtitle(jobTitle_jobTitle,jobTitle_jobDescription,jobTitle_note);
}

@Test


public void verifyaddjobtitleinvalid()
{
	blib.addjobtitle("","","");
}



}