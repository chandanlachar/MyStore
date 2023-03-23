package TestCases;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;

import testbase.BaseClass;
import utilities.DataProviders;

public class TestCase2Verifylogindatadriven extends BaseClass{
	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
   public void Login(String EMAIL ,String PASSWORD, String EXPECTEDUSERNAME) throws InterruptedException{
		
		logger.info("My Store webportal is opened");
	   Thread.sleep(3000);
	   HomePage hp=new HomePage(driver);
	   hp.ClickSignin();
	   logger.info("Clicked on signin");
	   Thread.sleep(3000);
	   
	   LoginPage lp=new LoginPage(driver);
	   Thread.sleep(3000);
	   lp.SetuserEmail(EMAIL);
	   Thread.sleep(3000);
	   lp.SetPassword(PASSWORD);
	   Thread.sleep(3000);
	   lp.ClickSignin();
	   Thread.sleep(3000);
	   logger.info("Filled user detial ");
	   
	   
	   MyAccountPage mp=new MyAccountPage(driver);
	   String username=mp.gettitle();
	  
	   if(username.equals(EXPECTEDUSERNAME)){
		   logger.info("User Logged In");
		   Assert.assertTrue(true);
		   
		   mp.Clicksignout();
		   logger.info("User Signout");
	   }
	   else {
		   
		   logger.info("User Login Fail");
		   Assert.assertFalse(false);
	   }
		
	}
	   
   }
	

