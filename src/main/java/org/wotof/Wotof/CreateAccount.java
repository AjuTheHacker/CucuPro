package org.wotof.Wotof;

import java.util.List;
import java.util.Map;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CreateAccountPojo;

public class CreateAccount extends BaseClass {

	@Given("User should be lunch chrome browser and load url")
	public void user_should_be_lunch_chrome_browser_and_load_url() {
	   lunchChrome();
	   passURL("https://www.wotif.co.nz/signup?enable_registration=true&+=&uurl=e3id%3Dredr%26rurl%3D%2F");
	   maxWin();
	}
	@When("User should enter details")
	public void user_should_enter_details(io.cucumber.datatable.DataTable d) {
		CreateAccountPojo p = new CreateAccountPojo();
		List<Map<String, String>> mp = d.asMaps();
		sendKeyCall(p.getEmailAddress(), mp.get(0).get("Email"));
		sendKeyCall(p.getFirstName(), mp.get(0).get("FiratName"));
		SendKeyActionCall(p.getLastName(), mp.get(1).get("LastName"));
		sendKeyCall(p.getPassword(), mp.get(1).get("kuamr@1234"));
	    
	}
	@When("User should click on continue button")
	public void user_should_click_on_continue_button() {
		CreateAccountPojo p = new CreateAccountPojo();
		clickbtn(p.getContinuebutton());
	}
	@Then("User should can successfully create account")
	public void user_should_can_successfully_create_account() {
	    
	}
}
