package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void selectByVisibleText(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	public void selectByValue(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void movetoElement(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element);
		
	}
}

