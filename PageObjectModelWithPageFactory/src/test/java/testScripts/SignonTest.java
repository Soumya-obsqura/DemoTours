package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.SignOnPage;
import automationcore.Base;


public class SignonTest extends Base {
	

	@Test
	public void verifySignonPage() {
		
		LoginPage login=new LoginPage(driver);
		login.enterUsername("alex123@gmail.com");
		login.enterPassword("alex123");
		
		SignOnPage signon=login.clickonSubmit();
		String actTitle=signon.getSignonTitile();
		String expTitle="Welcome: Mercury Tours";
		Assert.assertEquals(expTitle, actTitle, "Invalid title");
	}
	
	

}

