package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginObject ; 
	
	
	@Test (priority = 1)
	public void UserLoginFailWrongEmail ()
	{
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin("t1@gmail.com", "12345678"); // Wrong Email ,Correct password
		//String actualUrlString = "........";  // login page link
		//String foundUrlString = driver.getCurrentUrl();
		//Assert.assertEquals( actualUrlString, foundUrlString);
		WebElement failMessageString= driver.findElement(By.id("........")); // error message id
		String errormessageString = failMessageString.getText();
		String actualErrorMessage= "wrong email or password";
		Assert.assertEquals(actualErrorMessage, errormessageString);
		
	}
	@Test (priority = 2)
	public void UserLoginFailWrongPassword ()
	{
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin("t1@gmail.com", "12345678"); // Correct Email ,Wrong password

		WebElement failMessageString= driver.findElement(By.id("........")); // error message id
		String errormessageString = failMessageString.getText();
		String actualErrorMessage= "wrong email or password";
		Assert.assertEquals(actualErrorMessage, errormessageString);
	}
	@Test (priority = 3)
	public void UserLoginFailExpiredPassword ()
	{
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin("t1@gmail.com", "12345678"); // Correct Email ,Expired password

		WebElement failMessageString= driver.findElement(By.id("........")); // error message id
		String errormessageString = failMessageString.getText();
		String actualErrorMessage= "your password is expired. please, contact your adminstrator";
		Assert.assertEquals(actualErrorMessage, errormessageString);
	}
	
	@Test (priority = 4)
	public void UserLoginFailDisabledUser ()
	{
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin("t1@gmail.com", "12345678"); // Disabled Email ,correct password

		WebElement failMessageString= driver.findElement(By.id("........")); // error message id
		String errormessageString = failMessageString.getText();
		String actualErrorMessage= "user is disabled. please, contact your adminstrator.";
		Assert.assertEquals(actualErrorMessage, errormessageString);
	}
	
	@Test (priority = 5)
	public void UserCanLoginSuccssfully ()
	{
		loginObject = new LoginPage(driver); 
		loginObject.UserLogin("test126@gmail.com", "12345678"); // Correct Input Data
		String actualUrlString = "........";  // Profile page link
		String foundUrlString = driver.getCurrentUrl();		
		Assert.assertEquals( actualUrlString, foundUrlString);
		
	}
}
