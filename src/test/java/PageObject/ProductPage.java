package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[@class='lighter']") WebElement txt;
	@FindBy (linkText="More") WebElement Btnmore;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]") WebElement mousehover;
	
	
	public String gettitle2() {
		String	title=txt.getText();
		return title;
		}
	public void Mousehover() {
		Actions a=new Actions(driver);
		a.moveToElement(mousehover).build().perform();
		
		
	}
	public void ClickMore() {
		Btnmore.click();
	}

}
