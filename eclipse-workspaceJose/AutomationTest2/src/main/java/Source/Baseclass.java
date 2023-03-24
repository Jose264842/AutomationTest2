package Source;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
		
		
public class Baseclass 
{
			public static WebDriver driver;	
			public static void invoke() throws IOException 
			{
				
				try 
					{
						System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
						WebDriverManager.chromedriver().setup();
						Thread.sleep(5000);
						driver = new ChromeDriver();
						System.out.println("Browser is launched !");
						driver.manage().window().maximize();
						driver.get("https://admin:Test@123@qaenv.bollybet.net");
					}catch (Exception e) 
				    {
						e.printStackTrace();
			            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			            FileUtils.copyFile(src, new File ("D:\\Baseclass.png"));
				    }
	}

}
