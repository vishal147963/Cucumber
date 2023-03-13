package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageStepDef extends BaseClass{

	@Then("user is on register page")
	public void user_is_on_register_page() {
		BaseClass.init();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}

	@When("user enter first name, last name, phone and email id")
	public void user_enter_first_name_last_name_phone_and_email_id() {
		driver.findElement(By.name("firstName")).sendKeys("sonal");
		driver.findElement(By.name("lastName")).sendKeys("patil");
		driver.findElement(By.name("phone")).sendKeys("9099909");
		driver.findElement(By.name("userName")).sendKeys("sonal@gmail.com");

	}

	@Given("user is on registe page and user should be add contact information")
	public void user_is_on_registe_page_and_user_should_be_add_contact_information() {

	}

	@When("user enter addres, city , state ,postal code and country")
	public void user_enter_addres_city_state_postal_code_and_country() {
		driver.findElement(By.name("address1")).sendKeys("Pune");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("MH");
		driver.findElement(By.name("postalCode")).sendKeys("412334");
		WebElement wb = driver.findElement(By.name("country"));
		Select sel = new Select(wb);
		sel.selectByVisibleText("INDIA");

	}

	@Given("user is on registe page and user should be add contact and mailing information")
	public void user_is_on_registe_page_and_user_should_be_add_contact_and_mailing_information() {

	}

	@When("user enter username password and confirm password")
	public void user_enter_username_password_and_confirm_password() {
		driver.findElement(By.name("email")).sendKeys("sonal@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sonal@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Sonal@123");

	}

	@Then("user click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("user will be navigate to success page")
	public void user_will_be_navigate_to_success_page() {
		String a = driver.getTitle();
		System.out.println(a);
	}
}
