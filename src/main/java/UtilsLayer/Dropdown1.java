package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
public void selectByValue(WebElement wb, String value) {
	new Select(wb).selectByValue(value);

}
public void vrushali(WebElement wb, String value) {
	
	new Select(wb).selectByVisibleText(value);
	
	
}
}


