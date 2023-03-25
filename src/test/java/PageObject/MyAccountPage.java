package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath="//a[@title='View my customer account']") WebElement title;
	@FindBy (linkText="Sign out") WebElement Signout;
	@FindBy(id="search_query_top") WebElement Searchbox;
	@FindBy(name="submit_search") WebElement Searchbtn;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")  WebElement tshirt;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]") WebElement dresses;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]") WebElement ttitle;
	@FindBy(xpath="//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[3]/div[1]/a[1]") WebElement compare;
	@FindBy(xpath="//div[@class='content_sortPagiBar']//span[1]") WebElement btncompare;
	
	

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
	public void ClickonTshirt() {
		tshirt.click();
	}
	public void Mousehoverdress() {
		Actions a=new Actions (driver);
		a.moveToElement(ttitle).build().perform();
	}
	public void ClickonCompare() {
		compare.click();
	}
	public void ClickonDresses() {
		dresses.click();
	}
	public void Mousehoverprinteddress() {
		Actions a=new Actions(driver);
		a.moveToElement(ttitle).build().perform();		
	}
	public void ClickonCompare2() {
		compare.click();
		
	}
	public void ClickonBtnCompare() {
		btncompare.click();
	}
	
}
