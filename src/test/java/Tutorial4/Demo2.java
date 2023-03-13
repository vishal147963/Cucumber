package Tutorial4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	WebDriver driver;

	@Given("user is on free crm login page")
	public void user_is_on_free_crm_login_page() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://ui.cogmento.com/");
	}

	@When("user enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String uname, String pass) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}

	@Then("user is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		Thread.sleep(5000);
		String a = driver.findElement(By.xpath("(//div[@class='right menu']/span)[1]")).getText();
		System.out.println(a);
		Thread.sleep(5000);

	}

	@Then("user click on contact link and createbutton")
	public void user_click_on_contact_link_and_createbutton() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href='/contacts/new']")).click();

	}

	@Then("user enter {string} and {string} and {string}")
	public void user_enter_and_and(String fname, String lname, String mname) throws InterruptedException {
		driver.findElement(By.name("first_name")).sendKeys(fname);
		driver.findElement(By.name("last_name")).sendKeys(lname);
		driver.findElement(By.name("middle_name")).sendKeys(mname);
		Thread.sleep(5000);

	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		driver.quit();

	}
	
	
}
