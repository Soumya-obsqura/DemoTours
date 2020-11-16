package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;

public LoginPage(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

public String getTitle()
{
return driver.getTitle();
}


@FindBy(name="userName")
WebElement username;

@FindBy(name="password")
WebElement passWord;

@FindBy(name="submit")
WebElement Submit;

public void enterUsername(String Username) {
	username.sendKeys(Username);
}

public void enterPassword(String Password) {
	passWord.sendKeys(Password);
}

public SignOnPage clickonSubmit() {
	Submit.click();
return new SignOnPage(driver);
}

}
