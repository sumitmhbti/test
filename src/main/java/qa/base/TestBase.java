package qa.base;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver ;
	public static Properties prop ;
//	public static Base base ;
	
    public TestBase() throws IOException
    {
    
    	prop = new Properties();
    	FileInputStream ip = new FileInputStream ("C:\\Users\\Sumit\\eclipse-workspace\\test\\src\\main\\java\\qa\\config\\config.properties");	
    	prop.load(ip);
    }
    
    public static void initilization ()
    {
    	// String browserName = prop.getProperty("browser");
    	 System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Java/chromedriver.exe");
    		
         //Instantiating driver object
          driver = new ChromeDriver();
    
       driver.manage().window().maximize();
      // driver.get(prop.getProperty("url"));
     driver.get(prop.getProperty("url"));
     
   //   driver.get(prop.getProperty("url"));
    }  
}
