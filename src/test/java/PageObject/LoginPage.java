package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="email_create") WebElement CreateEmail;
	@FindBy (id="SubmitCreate" ) WebElement clickSubmit;

	public void SetEmail(String email) {
		CreateEmail.sendKeys(email);
	}
	public void ClickSubmit() {
		clickSubmit.click();
	}
}
