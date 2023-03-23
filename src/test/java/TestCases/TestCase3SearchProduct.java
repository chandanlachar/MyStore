package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import PageObject.ProductPage;

import testbase.BaseClass;

public class TestCase3SearchProduct extends BaseClass {
	
	@Test
   public void SearchProduct() throws InterruptedException {
		try {
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
		   
		   MyAccountPage ma=new MyAccountPage(driver);
		   ma.EnterSearchBox("T-shirt");
		   Thread.sleep(3000);
		   ma.ClickSearchbtn();
		   Thread.sleep(3000);
		   logger.info("Searched for T-shirt");
		   
		   ProductPage pp=new ProductPage(driver);
		   String producttitle=pp.gettitle2();
		   if(producttitle.equals( "T SHIRTS")) {
			   logger.info("Matched");
		   }else {
			   logger.info("fail to match");
		   }}
		catch(Exception e) {
			Assert.fail();
		}
		   		
	   
   }
}
