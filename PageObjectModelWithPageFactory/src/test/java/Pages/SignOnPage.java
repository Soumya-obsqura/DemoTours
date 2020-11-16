package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {

		WebDriver driver;
		
	public SignOnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getSignonTitile() {
		return driver.getTitle();
	}
	}

