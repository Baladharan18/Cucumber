package org.stepdefinitionfb;

import org.base.LibGlobal;
import org.fbloginpage.FbPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFb extends LibGlobal{
	FbPojoClass f;
	@Given("User have to enter facebook login page")
	public void user_have_to_enter_facebook_login_page() {
		browserlaunch();
		loadUrl("https://www.facebook.com/");
	}

	@Given("User have to maximize the window")
	public void user_have_to_maximize_the_window() {
		windowMaximise();
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {
		 f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), "Bal@gmail.com");
		fillTextBox(f.getTxtPass(), "1990193");
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() {
		btnClick(f.getBtnLogin());
		toWaitimplicit();
	}

	@Then("User have to be in invalid credentials page")
	public void user_have_to_be_in_invalid_credentials_page() {
		currentUrl();
		if (currentUrl().contains("privacy_mutation_token")) {
			System.out.println("Invalid Page");
			
		} 
		else {
			System.out.println("Valid Page");
		}
	}
	@Given("user have to hit the Fb Url")
	public void user_have_to_hit_the_Fb_Url() {
		browserlaunch();
		loadUrl("https://www.facebook.com/");
	}

	@Given("user need to maximise the screen")
	public void user_need_to_maximise_the_screen() {
		windowMaximise();
	}

	@When("user need to pass the username{string}")
	public void user_need_to_pass_the_username(String user) {
		f=new FbPojoClass();
		fillTextBox(f.getTxtUser(), user);
	}

	@When("user need to pass the password{string}")
	public void user_need_to_pass_the_password(String pass) {
		f=new FbPojoClass();
		fillTextBox(f.getTxtPass(), pass);
	}

	@Then("user have to enter login button")
	public void user_have_to_enter_login_button() {
	  btnClick(f.getBtnLogin());	
	}
}
