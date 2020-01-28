package POM;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generics.AutoConstant;
import Generics.BasePage;
import Generics.ExcelLibrary;

public class PomFacebookSignup extends BasePage implements AutoConstant {
	public WebDriver driver;
	//declaration
			@FindBy(xpath="//input[@name='firstname']")
			public WebElement FirstName;
			
			@FindBy(xpath="//input[@name='lastname']")
			private WebElement LastName;
			
			@FindBy(xpath="//input[@name='reg_email__']")
			private WebElement MobileNumber;
			
			@FindBy(xpath="//input[@name='reg_passwd__']")
			private WebElement NewPassword;
			
			@FindBy(id="month")
			private WebElement MonthDropDownList;
			
			@FindBy(id="day")
			private WebElement DayDropDownList;
			
			@FindBy(id="year")
			private WebElement YearDropDownList;
			
			@FindBy(xpath="(//input[@name='sex'])[1]")
			private WebElement FemaleRadioButton;
			
			@FindBy(id="email")
			private WebElement emailField;
			
			@FindBy(id="username")
			public WebElement actitimeUsername;
			
			@FindBy(xpath="//body")
			public WebElement Body;
			
		//initialization
			
			public PomFacebookSignup(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
		//utilization
			
			public void fillForm() throws IOException, InterruptedException
			{
				//Thread.sleep(5000);
				
				WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(emailField));
				FirstName.sendKeys(ExcelLibrary.getCellValue(Excel_path, Sheet_name, 1, 0));
				Thread.sleep(5000);
				LastName.sendKeys(ExcelLibrary.getCellValue(Excel_path, Sheet_name, 1, 1));
				Thread.sleep(5000);
				MobileNumber.sendKeys(ExcelLibrary.getCellValue(Excel_path, Sheet_name, 1, 2));
				Thread.sleep(5000);
				NewPassword.sendKeys(ExcelLibrary.getCellValue(Excel_path, Sheet_name, 1, 3));
				Thread.sleep(5000);
				selectByVisibleText(MonthDropDownList, "Apr");
				Thread.sleep(5000);
				selectByValue(DayDropDownList, "3");
				Thread.sleep(5000);
				selectByValue(YearDropDownList, "1986");
				Thread.sleep(5000);
				FemaleRadioButton.click();
				
			}
			
			public void keyEnumeration() throws IOException
			{
				WebDriverWait wait=new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(emailField));
				FirstName.sendKeys(ExcelLibrary.getCellValue(Excel_path, Sheet_name, 1, 0));
				for(int i=0;i<=5;i++)
				{
				FirstName.sendKeys(Keys.ARROW_LEFT);
				}
				for(int j=0;j<=2;j++) {
				FirstName.sendKeys(Keys.BACK_SPACE);// from minakshi to akshi using backspace
				}
				LastName.sendKeys(Keys.chord(Keys.LEFT_SHIFT,"minakshi"));//to make letters capital
				
			}
}

