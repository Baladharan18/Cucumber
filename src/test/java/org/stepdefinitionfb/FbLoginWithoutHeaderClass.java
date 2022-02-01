package org.stepdefinitionfb;

import java.util.List;

import org.base.LibGlobal;
import org.fbloginpage.FbPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FbLoginWithoutHeaderClass extends LibGlobal {
	FbPojoClass f;
	@Given("User have to enter fb login page")
	public void user_have_to_enter_fb_login_page() {
		browserlaunch();
		loadUrl("https://www.facebook.com/");		
	}

	@Given("User have to maximize the screen")
	public void user_have_to_maximize_the_screen() {
		windowMaximise();		
	}
	@When("User have to enter valid email")
	public void user_have_to_enter_valid_email(io.cucumber.datatable.DataTable d) {
		f= new FbPojoClass();
		List<String> li = d.asList();
		String data = li.get(2);
		fillTextBox(f.getTxtUser(), data);
	}

	@When("User have to enter invalid password")
	public void user_have_to_enter_invalid_password(io.cucumber.datatable.DataTable d) {
		f=new FbPojoClass();
		List<List<String>> li = d.asLists();
		String data = li.get(2).get(3);
		fillTextBox(f.getTxtPass(), data);
	}
	
	@When("User have to click login")
	public void user_have_to_click_login() {
		f= new FbPojoClass();
		btnClick(f.getBtnLogin());
	}
	


}
