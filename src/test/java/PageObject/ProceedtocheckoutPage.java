package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProceedtocheckoutPage extends BasePage{

	public ProceedtocheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Proceed to checkout") WebElement proceed;
	
	public void Clickonproceedtocheckout() {
		proceed.click();
	}

}
