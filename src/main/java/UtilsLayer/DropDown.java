package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public void selectByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
		
	}
	
	public void Vrushali(WebElement wb, String value) {
		
//		driver.findElement(By.class.arrayType()..value.);
//		Select sl= new Select(wb);
//		sl.selectByVisibleText(value);
		new Select(wb).selectByVisibleText(value);
		
	}
	
	
}
