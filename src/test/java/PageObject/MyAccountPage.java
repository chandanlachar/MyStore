package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath="//a[@title='View my customer account']") WebElement title;

	public String gettitle() {
	String s=title.getText();
	return s;
	}
}
