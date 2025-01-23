package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Calender extends BaseClass{
	
	public static void handleCalender(List<WebElement> list, String value)
	{
		for(WebElement wb :list)
		{
			String actualvalue = wb.getText();
			if(actualvalue.contains(value))
			{
				WebElementUtils.clickElement(wb);
			}
		}
	}

}
