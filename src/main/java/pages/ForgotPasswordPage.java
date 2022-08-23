package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends PageBase 
{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = ".......") 
	WebElement EmailTxtBox;
	@FindBy(id = ".......") 
	WebElement sendEmailBtn;
	
	public void SendEmail(String email ) 
	
	{
		EmailTxtBox.clear();
		setTextElementText(EmailTxtBox, email);
		clickButton(sendEmailBtn);
	}
	

}
