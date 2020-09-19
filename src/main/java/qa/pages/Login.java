package qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class Login extends TestBase {

	public Login() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "username")
	WebElement username ;
	
	@FindBy(name = "password")
	WebElement password ;
	
	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	WebElement captcha ;
	
	@FindBy(id = "login")
	WebElement loginBtn ;
	
	public void login(String un, String pwd) throws InterruptedException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		captcha.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		loginBtn.click();
	}
}
