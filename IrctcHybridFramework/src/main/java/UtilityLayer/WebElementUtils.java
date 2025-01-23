package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class WebElementUtils extends BaseClass{
	
	public static void sendKeys(WebElement wb , String value)
	{
		
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
		
	}
	
	public static void clickElement(WebElement wb)
	{
		Actions act = new Actions(driver);
		
		if(wb.isDisplayed() && wb.isEnabled())
		{
			act.click(wb).perform();
		}
	}
	
	

}
