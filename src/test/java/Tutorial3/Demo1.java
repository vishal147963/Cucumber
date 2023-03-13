package Tutorial3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 extends BaseClass {
	
	@Given("user is on fb register page")
	public void user_is_on_fb_register_page() {
//		WebDriverManager.chromedriver().setup();
//		driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		
		Demo1.init();
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String fname, String lname) {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		
	}

	@When("user enter valid {int}")
	public void user_enter_valid(Integer abc) {
		driver.findElement(By.name("reg_email__")).sendKeys(abc.toString());
	}

	@When("user enter valid {int} and {string}")
	public void user_enter_valid_and(Integer abc, String pass) {
		driver.findElement(By.name("reg_email__")).sendKeys(abc.toString());
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);

	}
	@When("user enter {int} and {string} and {int}")
	public void user_enter_and_and(Integer date, String month, Integer year) {
	  
		WebElement dayWb = driver.findElement(By.name("birthday_day"));
		WebElement monthWb = driver.findElement(By.name("birthday_month"));
		WebElement yearWb = driver.findElement(By.name("birthday_year"));
		
		Select sel1 =new Select(dayWb);
		sel1.selectByVisibleText(date.toString());
		
		Select sel2 =new Select(monthWb);
		sel2.selectByVisibleText(month);
		
		Select sel3 =new Select(yearWb);
		sel3.selectByVisibleText(year.toString());
		
	}
	
	
	@Then("user click on Register button")
	public void user_click_on_register_button() {

	}

}
