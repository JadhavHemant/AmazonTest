package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;


public class LoginPageTest extends BaseClass {
public static LoginPage page;
	
	@Parameters({"browsername"})
	@BeforeTest
	public void SetUp(String browsername) {
	BaseClass.Initilization(browsername);
	}
	
	
	
	@Test
	public void ValidateLogInpage() {
		String usrname=prop.getProperty("USRNAME");
		String password=prop.getProperty("PASSWORD");
		page= new LoginPage();
		page.LogInFunctinality(usrname, password);
	}
	
	
	
	
}
