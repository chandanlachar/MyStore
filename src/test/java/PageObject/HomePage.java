package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    //Calling constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//WebElement
	@FindBy(linkText="Sign in") WebElement Signin;
	
public void ClickSignin() {
	Signin.click();
}
}
