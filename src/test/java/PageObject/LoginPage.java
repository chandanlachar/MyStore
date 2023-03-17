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
	@FindBy(id="email") WebElement Enteremail;
	@FindBy(id="passwd") WebElement Enterpassword;
	@FindBy(id="SubmitLogin") WebElement signin;

	public void SetEmail(String email) {
		CreateEmail.sendKeys(email);
	}
	public void ClickSubmit() {
		clickSubmit.click();
	}
	public void SetuserEmail(String email) {
		Enteremail.sendKeys(email);
	}
	public void SetPassword(String password) {
		Enterpassword.sendKeys(password);
	}
	public void ClickSignin() {
		signin.click();
		
	}
}
