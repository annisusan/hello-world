package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.LoginPO;

public class Test1 {
@Test
public void testError() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/phatakesto/login.do");
	LoginPO lp=new LoginPO(driver);
	
	/*JavascriptExecutor r=(JavascriptExecutor) driver;
	r.executeScript("arguments[0].click()",lp.loginBtn());*/
	((JavascriptExecutor) driver).executeScript("arguments[0].click()",lp.loginBtn());
	
	//lp.loginBtn().click();
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(lp.errMSG()));
			Assert.assertEquals(lp.errMSG().isDisplayed(), true);
			driver.quit();
}





}
