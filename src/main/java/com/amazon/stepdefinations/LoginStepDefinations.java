package com.amazon.stepdefinations;

import com.amazon.pages.LoginPage;
import com.amazon.util.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinations extends BaseTest {
	LoginPage loginpage = new LoginPage();
	

	@Given("^user opens browser$")
	public void user_opens_browser() {
		BaseTest.initialization();    
	}

	@Then("^user is at homepage$")
	public void user_is_at_homepage() {
		String tital = loginpage.validateLoginPage();
		//Assert.assertEquals(expected, actual);
		System.out.println(tital);
	   	}
	
	@Then("^user hovers at login option and clicks on login$")
	public void user_hovers_at_login_option_and_clicks_on_login() throws InterruptedException  {
		loginpage.signinMouseHover();
		loginpage.clicksignin();
	    
	}

	@When("^user is at login page$")
	public void user_is_at_login_page()  {
	    System.out.println(driver.getTitle());
	}

	@Then("^user enters <username> and <password>$")
	public void user_enters_username_and_password()  {
		loginpage.enterusername(prop.getProperty("username"));
		loginpage.enterpwd(prop.getProperty("passsword"));
		loginpage.clicksigninbtn();
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    
	}


}
