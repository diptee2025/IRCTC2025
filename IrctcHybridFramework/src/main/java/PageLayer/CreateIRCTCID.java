package PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilityLayer.Calender;
import UtilityLayer.HandleDropDown;
import UtilityLayer.HandleRadioButton;
import UtilityLayer.WebElementUtils;

public class CreateIRCTCID extends BaseClass{
	
	public void personalDetails(String Name, String Month, String Year, String Date, String Gender)
	{
		
		WebElement name = driver.findElement(By.xpath("//div[@class='inptFld']/child::p[text()='Name*']/following-sibling::div/child::input"));
		WebElementUtils.sendKeys(name, Name);
		
//		WebElement cal = driver.findElement(By.xpath("//span[@class='cm__sprite calIcn']"));
//		WebElementUtils.clickElement(cal);
		
//		WebElement mm = driver.findElement(By.xpath("//button[@class='DayPickerDdCont-cstBtn']"));
//		WebElementUtils.clickElement(mm);
		
//		List<WebElement> month = driver.findElements(By.xpath("//ul[@class='DayPicker-monthDdListCont']/child::li"));
//		Calender.handleCalender(month, Month);
		
//		WebElement yy = driver.findElement(By.xpath("//button[text()='1943']"));
//		WebElementUtils.clickElement(yy);
		
//		List<WebElement> year = driver.findElements(By.xpath("//ul[@class='DayPicker-yrDdListCont']/child::li"));
//		Calender.handleCalender(year, Year);
		
//		List<WebElement> date = driver.findElements(By.xpath("//span[@class='DayPicker-Day  txtCenter']"));
//		Calender.handleCalender(date, Date);
		
		List<WebElement> gender = driver.findElements(By.xpath("//span[text()='Female']"));
		HandleRadioButton.radioButton(gender, Gender);
		
		
		
	}

}
