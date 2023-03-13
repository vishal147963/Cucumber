package StepDefination1;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageStepDef extends BaseClass{

	public static ContactPage contactpage;

	@When("user click on contact link")
	public void user_click_on_contact_link() throws InterruptedException {
	    contactpage =new ContactPage();
	    contactpage.clickOnContactLink();
	}
	@Then("validate user is on contact page")
	public void validate_user_is_on_contact_page() {
		Assert.assertEquals(contactpage.verifyUserOnContactPage().contains("contacts"), true);
	}
	@Then("user click on create button")
	public void user_click_on_create_button() {
		contactpage.clickOnCreatebutton();
	}
	@Then("user fill up different personal information as like fname,last name, middle name and emial id")
	public void user_fill_up_different_personal_information_as_like_fname_last_name_middle_name_and_emial_id() {
		contactpage.createUser("amit", "patil", "abc", "amit@gmail.com");
	}
	@Then("user click on save button")
	public void user_click_on_save_button() {
		contactpage.clickOnSaveButton();
	}
	@Then("we validate is created or not")
	public void we_validate_is_created_or_not() {
	   
	}

}
