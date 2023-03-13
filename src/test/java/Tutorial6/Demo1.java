package Tutorial6;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {


static WebDriver driver;

@Given("user is on Login Page")
public void user_is_on_login_page() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://ui.cogmento.com/");
}

@When("user enter valid username and password")
public void user_enter_valid_username_and_password(DataTable dataTable) {

	List<Map<String, String>> ls = dataTable.asMaps();

	String uname = ls.get(0).get("username");

	String pass = ls.get(0).get("password");

	driver.findElement(By.name("email")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(pass);
}

@Then("user click on login button")
public void user_click_on_login_button() {
	driver.findElement(By.xpath("//div[text()='Login']")).click();
}

@Then("user validate home page title")
public void user_validate_home_page_title() {
	String a = driver.getTitle();
	Assert.assertEquals(a, "Cogmento CRM");
}
}
