package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;

public class ForgetPasswordPageTest extends TestBase{
	
	LoginPage loginObject ; 
	ForgotPasswordPage ForgetPasswordOpject;
	
	@BeforeTest()
	public void openForgetPasswordPage() {
		loginObject.Forgotpass();
	}
	
	@Test(priority = 2)
	public void UserEnterInvalidEmail() {
		ForgetPasswordOpject = new ForgotPasswordPage(driver);
		ForgetPasswordOpject.SendEmail(".....");  // wrong Email
		WebElement failMessageString= driver.findElement(By.id("........")); // error message id
		String errormessageString = failMessageString.getText();
		String actualErrorMessage= "If the Entered Email is valied a reset password mail will be sent shotly.";
		Assert.assertEquals(actualErrorMessage, errormessageString);
		
	}
	@Test(priority = 1)
	public void UserEnterblankEmail() {
		ForgetPasswordOpject = new ForgotPasswordPage(driver);
		ForgetPasswordOpject.SendEmail(".....");  // blank Email
		WebElement MessageString= driver.findElement(By.id("........")); //  message id
		String messageString = MessageString.getText();
		String actualMessage= "please, enter a valid email";
		Assert.assertEquals(actualMessage, messageString);
		
	}
	
	@Test(priority = 3)
	public void UserEnterCorrectEmail() {
		ForgetPasswordOpject = new ForgotPasswordPage(driver);
		ForgetPasswordOpject.SendEmail(".....");  // Correct Email
		WebElement MessageString= driver.findElement(By.id("........")); //  message id
		String messageString = MessageString.getText();
		String actualMessage= "please, enter a valid email";
		Assert.assertEquals(actualMessage, messageString);
		// ................
		
	}

}
