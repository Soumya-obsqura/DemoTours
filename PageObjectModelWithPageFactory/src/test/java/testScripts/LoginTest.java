package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import Pages.LoginPage;

public class LoginTest extends Base{

@Test

public void verifyTitle()
{
LoginPage loginpage = new LoginPage(driver);
String Act = loginpage.getTitle();
String expct = "Welcome: Mercury Tours";
Assert.assertEquals(Act, expct);
}
//@Test
	public void verifyLogin() {
		LoginPage login=new LoginPage(driver);
		login.enterUsername("alex123@gmail.com");
		login.enterPassword("alex123");
		login.clickonSubmit();
	}
}