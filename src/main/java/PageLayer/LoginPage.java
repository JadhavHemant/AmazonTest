package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement ClickOnAcc;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement UserName;
	
	@FindBy(xpath="//input[@aria-labelledby='continue-announce']")
	private WebElement ButtonContinue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement LoginButton;
	
	
public LoginPage() {
	PageFactory.initElements(driver,this);
}

public void LogInFunctinality(String usename,String password) {
	ClickOnAcc.click();
	UserName.sendKeys(usename);
	ButtonContinue.click();
	Password.sendKeys(password);
	LoginButton.click();
}




}
