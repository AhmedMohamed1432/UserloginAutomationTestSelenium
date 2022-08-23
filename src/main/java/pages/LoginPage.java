package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase 
{

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(id="......")
	WebElement emailTxtBox ; 

	@FindBy(id="......")
	WebElement passwordTxtBox ; 

	@FindBy(css="....") // sign in button
	WebElement loginBtn ; 
	
	@FindBy(css=".......")  // forgot password button
	WebElement forgotpassBtn ; 

	
	public void UserLogin(String email , String password) 
	{
		emailTxtBox.clear();
		passwordTxtBox.clear();
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
		clickButton(loginBtn);
	}
	public void Forgotpass() 
	{	
		clickButton(forgotpassBtn);
	}
}
