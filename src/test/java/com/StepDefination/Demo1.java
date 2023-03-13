package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
public static WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
//	    WebDriverManager.chromedriver().setup();
//	    driver =new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
	    Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
}
