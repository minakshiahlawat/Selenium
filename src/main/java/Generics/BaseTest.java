package Generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant {

	public WebDriver driver;
	@BeforeMethod
	
	public void openApp()
	{
		System.setProperty(chrome_key, Chrome_Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		
				
	}
	
	
	
}

