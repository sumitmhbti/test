package qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.Login;

public class TestLogin extends TestBase {
 Login loginPage ;
	public TestLogin() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initilization();
		loginPage = new Login();
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		
		loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

}
