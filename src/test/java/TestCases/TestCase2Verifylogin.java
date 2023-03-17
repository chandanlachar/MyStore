package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;

import testbase.BaseClass;

public class TestCase2Verifylogin extends BaseClass{
	
	@Test
   public void Login() throws InterruptedException{
		logger.info("My Store webportal is opened");
	   Thread.sleep(3000);
	   HomePage hp=new HomePage(driver);
	   hp.ClickSignin();
	   logger.info("Clicked on signin");
	   Thread.sleep(3000);
	   
	   LoginPage lp=new LoginPage(driver);
	   Thread.sleep(3000);
	   lp.SetuserEmail("chandanlchandu217@gmail.com");
	   Thread.sleep(3000);
	   lp.SetPassword("CHANDANvidya");
	   Thread.sleep(3000);
	   lp.ClickSignin();
	   Thread.sleep(3000);
	   logger.info("Filled user detial ");
	   
	   MyAccountPage mp=new MyAccountPage(driver);
	   String username=mp.gettitle();
	  
	   if(username.equals("Chandan L")){
		   logger.info("User Logged In");
	   }
	   else {
		   logger.info("User Login Fail");
	   }
	   
	   Thread.sleep(3000);
	}
	   
   }
	

