package BaseLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1 {
public static void main(String[] args) throws IOException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot ts= (TakesScreenshot)driver;
	File f = ts.getScreenshotAs(OutputType.FILE);
	SimpleDateFormat s= new SimpleDateFormat("DDMMYYY");
	FileUtils.copyFile(f, new File("D:\\Auto\\Jan23_Auto\\ScreenShoot\\s.png"));
	driver.quit();
}
}
