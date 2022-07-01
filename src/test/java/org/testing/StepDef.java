package org.testing;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CreateAccountPojo;
import pageObject.LoginPage;

public class StepDef extends BaseClass {

	@Given("User should be  lunch the Chrome browser and User load the url")
	public void user_should_be_lunch_the_chrome_browser_and_user_load_the_url() {
		// lunchChrome();
		  //passURL("https://www.wotif.co.nz/login?ckoflag=0&uurl=e3id%3Dredr%26rurl%3D%2F");
		   //maxWin();
		}
	

	@When("User should click on login link")
	public void user_should_click_on_login_link() {
LoginPage p = new LoginPage();
		
	    //clickbtn(p.getSignButton());
	   // WaitImpcitwaitCall(5);
	    //clickbtn(p.getSignlink());
	}

	@When("User should enter the Username and password")
	public void user_should_enter_the_username_and_password() {
	   ///
	}

	@When("User can see sign in button is not visible")
	public void user_can_see_sign_in_button_is_not_visible() {
	///
	}



	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String string1, String string2) {
		LoginPage p = new LoginPage();
		sendKeyCall(p.getUsername(), string1);
		sendKeyCall(p.getPassword(), string2);
	}

	@Then("User should get text message under the Email address box")
	public void user_should_get_text_message_under_the_email_address_box() {
		LoginPage p = new LoginPage();
		 WaitImpcitwaitCall(5);
		   SoftAssert s = new SoftAssert();
		   String actual12 = p.getEmailIdError().getText();
		   String expected12 = "Enter a valid email address";
		   s.assertEquals(actual12, expected12);
		   s.assertAll();
	}

	@When("User should click on login button")
	public void user_should_click_on_login_button() {
		WaitImpcitwaitCall(10);
		LoginPage p = new LoginPage();
		clickbtn(p.getLoginButton());
	    
	}

	

	@Then("User get text message  Email address box")
	public void user_get_text_message_email_address_box() {
		LoginPage p = new LoginPage();
		   SoftAssert s = new SoftAssert();
		   WaitImpcitwaitCall(5);
		   String actual12 = p.getEmailIdError().getText();
		   String expected12 = "Enter a valid email address";
		   s.assertEquals(actual12, expected12);
		  s.assertAll();
	    
	}

	

	

	@Then("User should see sign in button is not visiable")
	public void user_should_see_sign_in_button_is_not_visiable() {
	    
	}

	@Then("User should get text message under the Password box")
	public void user_should_get_text_message_under_the_password_box() {
		LoginPage p = new LoginPage();
		   SoftAssert s = new SoftAssert();
		   WaitImpcitwaitCall(5);
		   String actual2 = p.getPasswordError().getText();
		   String expected2 = "Enter a password";
		   s.assertEquals(actual2, expected2);
		   s.assertAll();
	    
	}

	@Then("User should get text message under the Email address box and Password box")
	public void user_should_get_text_message_under_the_email_address_box_and_password_box() {
		LoginPage p = new LoginPage();
		   SoftAssert s = new SoftAssert();
		   WaitImpcitwaitCall(5);
		   String actual1 = p.getEmailIdError().getText();
		   String expected1 = "Enter a valid email address";
		   String actual2 = p.getPasswordError().getText();
		   String expected2 = "Enter a password";
		   s.assertEquals(actual1, expected1);
		   s.assertEquals(actual2, expected2);
		  s.assertAll();
	}

@Then("User should get text error message")
public void user_should_get_text_error_message() {
	LoginPage p = new LoginPage();
	   SoftAssert s = new SoftAssert();
	   WaitImpcitwaitCall(5);
	   String actual21 = p.getEmailAndPasswordNotMatched().getText();
	   String expected21 = "Email and password don't match. Try again.";
	   s.assertEquals(actual21, expected21);
	   s.assertAll();
    
}
@Then("User Should navigate to homepage")
public void user_should_navigate_to_homepage() {
	LoginPage p = new LoginPage();
	   SoftAssert s = new SoftAssert();
	   WaitImpcitwaitCall(5);
	   String actual211 = getTitlecall();
	   String expected211 = "Wotif - Hotels, Flights, Holiday Packages & Travel Deals";
	   s.assertEquals(actual211, expected211);
	   s.assertAll();
    
	}
//****************************************************************
@Given("User should be lunch chrome browser and load url")
public void user_should_be_lunch_chrome_browser_and_load_url() {
   lunchChrome();
   passURL("https://www.wotif.co.nz/signup?enable_registration=true&+=&uurl=e3id%3Dredr%26rurl%3D%2F");
   maxWin();
}
@When("User should enter details")
public void user_should_enter_details(io.cucumber.datatable.DataTable d) {
	CreateAccountPojo p = new CreateAccountPojo();
	//Assert.assertTrue(false);
	
	List<Map<String, String>> mp = d.asMaps();
	sendKeyCall(p.getEmailAddress(), mp.get(2).get("Email"));
	sendKeyCall(p.getFirstName(), mp.get(1).get("FiratName"));
	sendKeyCall(p.getLastName(), mp.get(2).get("LastName"));
	sendKeyCall(p.getPassword(), mp.get(2).get("Password"));
	
    
}
@When("User should click on continue button")
public void user_should_click_on_continue_button() {
	CreateAccountPojo p = new CreateAccountPojo();
	clickbtn(p.getContinuebutton());
}
@Then("User should can successfully create account")
public void user_should_can_successfully_create_account() {
	CreateAccountPojo p = new CreateAccountPojo();
	//WebElement verification = p.getVerification();
	//String text = verification.getText();
//	System.out.println(text);
	
}
}