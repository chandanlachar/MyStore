package TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import testbase.BaseClass;

public class TestCase5AddtoCompare extends BaseClass {
	@Test
	public void AddtoCompare() throws InterruptedException {
		//myaccout page
		//product page
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

		MyAccountPage ap=new MyAccountPage(driver);
		ap.ClickonTshirt();
		Thread.sleep(3000);
		ap.Mousehoverdress();
		Thread.sleep(3000);
		ap.ClickonCompare();
		Thread.sleep(3000);
		logger.info("Tshirt add to compare");
		ap.ClickonDresses();
		Thread.sleep(3000);
		ap.Mousehoverprinteddress();
		Thread.sleep(3000);
		ap.ClickonCompare2();
		Thread.sleep(3000);
		logger.info("dress add to compare");
		ap.ClickonBtnCompare();
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "Products Comparison - My Store");
		logger.info("procuct compared");
	
		
		
		
	}

}
