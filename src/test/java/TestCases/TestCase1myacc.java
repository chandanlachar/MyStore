package TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import PageObject.CreateAccPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import testbase.BaseClass;

public class TestCase1myacc extends BaseClass{
	@Test
	public void MyAccount() throws InterruptedException{
		Thread.sleep(3000);
	
		HomePage hp=new HomePage(driver);
		hp.ClickSignin();
		Thread.sleep(3000);
		logger.info("Clicked on Signin");
		
		LoginPage lp=new LoginPage(driver);
		lp.SetEmail(randomString()+"@gmail.com");
		Thread.sleep(3000);
		lp.ClickSubmit();
		Thread.sleep(3000);
		logger.info("Clicked on Submit");
		
		CreateAccPage ca=new CreateAccPage(driver);
		ca.Clickradiobtn();
		Thread.sleep(3000);
		ca.SetUsername("chandanaaa");
		Thread.sleep(3000);
		ca.Setlastname("Lsx");
		Thread.sleep(3000);
		ca.SetPassword("adc@2341");
		Thread.sleep(3000);
		ca.Selectday("21");
		Thread.sleep(3000);
		ca.Selectmonth("10");
		Thread.sleep(3000);
		ca.Selectyear("1997");
		Thread.sleep(3000);
		ca.ClickSubmit();
		Thread.sleep(3000);
		logger.info("Entered all details of user");
	
		MyAccountPage ma=new MyAccountPage(driver);
		String username=ma.gettitle();
		System.out.println(username);
		Assert.assertEquals("Chandanaaa Lsx",username);
		logger.info("User name matched");
		
	}
	
	
}
