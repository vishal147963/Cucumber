package Titorial5;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1 {
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
	    
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable dataTable) {
		List<List<String>> ls = dataTable.asLists();
		
		String a = ls.get(0).get(0);
		String b =ls.get(0).get(1);
		String c =ls.get(1).get(0);
		String d =ls.get(1).get(1);
		String e =ls.get(2).get(0);
		String f =ls.get(2).get(1);
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
	}


	@Then("user close the application")
	public void user_close_the_application() {
	   
	}

}
