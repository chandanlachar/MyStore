package testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
   public static WebDriver driver;
   public Logger logger;
	public ResourceBundle rb;
	@Parameters({"browser"})
   @BeforeClass
	public void setup(String br) {
	   
	   rb=ResourceBundle.getBundle("config");
		logger=LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase()) {
		case "edge":
			driver=new EdgeDriver();
			break;
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
			default:
				driver=null;
				break;
		}
		
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(rb.getString("URL"));
		logger.info("My Store Successfully Opened");
	}
   @AfterClass
   public void TearDown() {
	   driver.quit();
   }
   
   public String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return (generatedString);	
	}
   
   public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
   }
}
