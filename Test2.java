package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPO;

public class Test2{
	@Test
	public void testLogout() throws Exception{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/phatakesto/login.do");
		LoginPO lp=new LoginPO(driver);
		JavascriptExecutor r=(JavascriptExecutor) driver;
			r.executeScript("arguments[0].value='"+"khc07222"+"'",lp.actiUN());
			r.executeScript("arguments[0].value='"+"4UXYDa3a"+"'",lp.actiPWd());
			Thread.sleep(3000);
			r.executeScript("arguments[0].click();", lp.loginBtn());
		HomePage hp=new HomePage(driver);
		r.executeScript("arguments[0].click();",hp.LogoutBtn());
		
	}

}
