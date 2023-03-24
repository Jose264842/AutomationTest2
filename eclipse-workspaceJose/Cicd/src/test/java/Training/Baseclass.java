package Training;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
			
public class Baseclass 
{
	public static WebDriver driver;
    
   @Test
	public void invoke() throws IOException, InterruptedException 
	{
				System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				Thread.sleep(5000);
				driver = new ChromeDriver();
				System.out.println("Browser is launched !");
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.get("https://admin:Test@123@qaenv.bollybet.net");	
     }
       
}