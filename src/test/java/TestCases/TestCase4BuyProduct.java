package TestCases;

import org.testng.annotations.Test;

import PageObject.FadedtshirtPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MyAccountPage;
import PageObject.ProceedtocheckoutPage;
import PageObject.ProductPage;
import PageObject.ShopcartsummaryPage;
import testbase.BaseClass;

public class TestCase4BuyProduct extends BaseClass {
	@Test
	public void BuyProduct() throws InterruptedException {

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
	  pp.Mousehover();
	  Thread.sleep(3000);
	  pp.ClickMore();
	  Thread.sleep(3000);
	  
	  FadedtshirtPage ft=new FadedtshirtPage(driver);
	  ft.ClickPluse();
	  Thread.sleep(3000);
	  ft.SelectMedium();
	  Thread.sleep(3000);
	  ft.ClickAddtocart();
	  Thread.sleep(3000);
	   
	  ProceedtocheckoutPage pc=new ProceedtocheckoutPage(driver);
	  pc.Clickonproceedtocheckout();
	  Thread.sleep(3000);
	  
	  ShopcartsummaryPage sc=new ShopcartsummaryPage(driver);
	  sc.Clickonproceedtobuy();
	  Thread.sleep(3000);
	  sc.Clickonproceedtobuy2();
	  Thread.sleep(3000);
	  sc.ClickonCheckbox();
	  Thread.sleep(3000);
	  sc.Clickonproceedtobuy3();
	  Thread.sleep(3000);
	  sc.ClickonPaybycheque();
	  Thread.sleep(3000);
	  sc.ClickonOrderconfirm();
	  Thread.sleep(3000);
	 String ordertitle=sc.Capturetitleorder();
	  if(ordertitle.equals("Your order on My Store is complete.")) {
		  logger.info("Order Confirmed");
	  }else {
		  logger.info("Order fail");
	  }
	}
	
}
