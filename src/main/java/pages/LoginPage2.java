package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage2 extends BaseClass {
	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//*[@id='userid']")
	private WebElement username;
	@FindBy(xpath="//*[@id='password']")
	private WebElement password;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath="//*[@id='pin']")
	private WebElement pin;
	
	
	public LoginPage2(WebDriver driver) throws IOException{
		this.driver=driver;
		wait = new WebDriverWait(driver, 50);
		PageFactory.initElements(driver, this);
	}
	public void loginWithCredentials() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();	
		
	}
	public void enterpin() {
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		pin.sendKeys(prop.getProperty("pin"));
		loginbutton.click();
	}
	
	public boolean veryfyUrl() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='submit']")));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("dashboard")) {
			return true;
		}
		else {
			return false;
		}
	}

}
