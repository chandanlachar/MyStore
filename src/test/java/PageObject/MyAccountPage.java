package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath="//a[@title='View my customer account']") WebElement title;
	@FindBy (linkText="Sign out") WebElement Signout;
	@FindBy(id="search_query_top") WebElement Searchbox;
	@FindBy(name="submit_search") WebElement Searchbtn;
	

	public String gettitle() {
	String s=title.getText();
	return s;
	}
	public void Clicksignout() {
		Signout.click();
	}
	public void EnterSearchBox(String Enter) {
		Searchbox.sendKeys(Enter);
	}
	public void ClickSearchbtn() {
		Searchbtn.click();
	}
}
