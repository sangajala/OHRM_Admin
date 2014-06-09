package OrangeHRM.OHRM_Admin;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BusinessLibrary extends BaseClass{

Utils util=new Utils();


public void navigateToPIM()
{
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
}

public void addEmp(String firstname,String lastname,String username,String password,String Confpwd,String status)
{
	
	this.navigateToPIM();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	driver.findElement(By.id("chkLogin")).click();
	driver.findElement(By.id("user_name")).sendKeys(username);
	driver.findElement(By.id("user_password")).sendKeys(password);
	driver.findElement(By.id("re_password")).sendKeys(Confpwd);
	//util.selectFromDropDownMenu(id, status);
	new Select(driver.findElement(By.id("status"))).selectByVisibleText(status);
	driver.findElement(By.id("btnSave")).click();
}

public void editEmp(String lastname1, String nationality)
{
	this.navigateToPIM();
	driver.findElement(By.linkText("super")).click();
    driver.findElement(By.id("btnSave")).click();
    driver.findElement(By.id("personal_txtEmpLastName")).sendKeys(lastname1);
    new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText(nationality);
    driver.findElement(By.id("btnSave")).click();
   }

public void addemergencycontacts(String emgcontacts_name,String emgcontacts_relationship,String emgcontacts_homePhone)
{
	
	    this.navigateToPIM();
	   // Assert.assertEquals("Employee List", driver.findElement(By.id("menu_pim_viewEmployeeList")).getText());
	    driver.findElement(By.linkText("super")).click();
	    driver.findElement(By.linkText("Emergency Contacts")).click();
	    driver.findElement(By.id("btnAddContact")).click();
	    driver.findElement(By.id("emgcontacts_name")).clear();
	    driver.findElement(By.id("emgcontacts_name")).sendKeys(emgcontacts_name);
	    driver.findElement(By.id("emgcontacts_relationship")).clear();
	    driver.findElement(By.id("emgcontacts_relationship")).sendKeys(emgcontacts_relationship);
	    driver.findElement(By.id("emgcontacts_homePhone")).clear();
	    driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("emgcontacts_homePhone");
	    driver.findElement(By.id("btnSaveEContact")).click();
	 
}

public void adddependencies(String dependent_name ,String dependent_relationshipType)
{
	    this.navigateToPIM();
	    //Assert.assertEquals("Employee List", driver.findElement(By.id("menu_pim_viewEmployeeList")).getText());
	    driver.findElement(By.linkText("super")).click();
	    driver.findElement(By.linkText("Dependents")).click();
	    driver.findElement(By.id("btnAddDependent")).click();
	    driver.findElement(By.id("dependent_name")).clear();
	    driver.findElement(By.id("dependent_name")).sendKeys(dependent_name);
	    new Select(driver.findElement(By.id("dependent_relationshipType"))).selectByVisibleText(dependent_relationshipType);
	    driver.findElement(By.id("btnSaveDependent")).click();
	  //  Assert.assertEquals("Assigned Dependents", driver.findElement(By.xpath("//*[@id='listing']/div[1]/h1")).getText());
	    
}

public void addjobtitle(String jobTitle_jobTitle,String jobTitle_jobDescription,String jobTitle_note)
{
	
    driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.xpath("//*[@id='menu_admin_Job']")).click();
    driver.findElement(By.xpath("//*[@id='menu_admin_viewJobTitleList']")).click();
    //Assert.assertEquals("Job Titles", driver.findElement(By.xpath("//*[@id='search-results']/div[1]/h1")).getText());
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("jobTitle_jobTitle")).clear();
    driver.findElement(By.id("jobTitle_jobTitle")).sendKeys(jobTitle_jobTitle);
    driver.findElement(By.id("jobTitle_jobDescription")).clear();
    driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(jobTitle_jobDescription);
    driver.findElement(By.id("jobTitle_note")).clear();
    driver.findElement(By.id("jobTitle_note")).sendKeys(jobTitle_note);
    driver.findElement(By.id("btnSave")).click();
    
}
	
}


	




