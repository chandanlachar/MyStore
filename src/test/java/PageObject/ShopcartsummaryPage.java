package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopcartsummaryPage extends BasePage{

	public ShopcartsummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Proceed to checkout") WebElement clickproceed;
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]") WebElement clickproceed2;
	@FindBy(id="cgv") WebElement checkbox;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]/i[1]") WebElement clickproceed3;
	@FindBy(xpath="//a[@title='Pay by check.']") WebElement paycheque;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]") WebElement orderconfirm;
    @FindBy(xpath="//p[contains(text(),'Your order on My Store is complete.')]") WebElement title;
	
	public void Clickonproceedtobuy() {
		clickproceed.click();
	}

	public void Clickonproceedtobuy2() {
		clickproceed2.click();
	}
	public void ClickonCheckbox() {
		checkbox.click();
	}
	public void Clickonproceedtobuy3() {
		clickproceed3.click();
	}
	public void ClickonPaybycheque() {
		paycheque.click();
	}
	public void ClickonOrderconfirm() {
		orderconfirm.click(); 
	}
	public String Capturetitleorder() {
		String ordertitle=title.getText();
		return ordertitle;
		
	}
}
