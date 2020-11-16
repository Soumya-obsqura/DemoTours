package automationcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

public WebDriver driver;

public void initializeBrowser(String Browser) throws Exception {
if (Browser.equalsIgnoreCase("Chrome")) {
System.setProperty("webdriver.chrome.driver", "F:/seleniumdrivers/chromedriver.exe");
driver = new ChromeDriver();
} else if (Browser.equalsIgnoreCase("firefox")) {
System.setProperty("webdriver.gecko.driver","F:/seleniumdrivers/geckodriver.exe");
driver = new FirefoxDriver();
} else {
throw new Exception("Invaid Browser");
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
}


@BeforeMethod
public void setUP() throws Exception
{
initializeBrowser("Chrome");
driver.get("http://demo.guru99.com/test/newtours/");

}

@AfterMethod
public void tearDown()
{
driver.close();
}


}