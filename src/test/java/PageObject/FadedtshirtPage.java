package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FadedtshirtPage extends BasePage{

	public FadedtshirtPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
   @FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']//span") WebElement btnpluse;
   @FindBy(id="group_1") WebElement Sizedd;
   @FindBy(name="Submit") WebElement Addtocart;
   
   public void ClickPluse() {
	   btnpluse.click();
   }
   public void SelectMedium() {
	   Select s=new Select(Sizedd);
	   s.selectByVisibleText("M");   
   }
   public void ClickAddtocart() {
	   Addtocart.click();
   }
}
