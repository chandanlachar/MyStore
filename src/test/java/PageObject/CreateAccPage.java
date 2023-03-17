package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccPage extends BasePage{

	public CreateAccPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (id="id_gender1")  WebElement radiomr;
	@FindBy (id="customer_firstname")  WebElement txtusername;
	@FindBy (id="customer_lastname")  WebElement txtlastname;
	@FindBy (id="passwd")  WebElement txtpassword;
	@FindBy (id="days")  WebElement dropdays;
	@FindBy (id="months")  WebElement dropmonths;
	@FindBy (id="years")  WebElement dropyears;
	@FindBy (id="submitAccount") WebElement btnSubmit;
	
	public void Clickradiobtn() {
		radiomr.click();
	}
	public void SetUsername(String username) {
		txtusername.sendKeys(username);
	}
	public void Setlastname(String lastname) {
		txtlastname.sendKeys(lastname);
	}
	public void SetPassword(String password) {
		txtpassword.sendKeys(password);
	}
	public void Selectday(String number) {
		Select s=new Select(dropdays);
		s.selectByValue(number);
		}
	public void Selectmonth(String text) {
		Select s=new Select(dropmonths);
		s.selectByValue(text);
	}
	public void Selectyear(String number) {
		Select s=new Select(dropyears);
		s.selectByValue(number);
	}
	public void ClickSubmit() {
		btnSubmit.click();
	}
	

}
