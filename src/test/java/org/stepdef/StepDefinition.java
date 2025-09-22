package org.stepdef;

import org.facebook.BaseClass;
import org.facebook.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	@Given("To user launch chrome browser")
	public void to_user_launch_chrome_browser() {
	    browserLaunch();
	}

	@When("To user enter valid url")
	public void to_user_enter_valid_url() {
	    loadUrl("https://www.facebook.com/");
	}

	@When("To user enter valid username and valid password")
	public void to_user_enter_valid_username_and_valid_password() {
	    LoginPage l=new LoginPage();
	    passTxt(l.getUsername(), dataFromExcel("task", 0, 5));
	    passTxt(l.getPassword(), dataFromExcel("task", 0, 5));
	}

	@Then("To user click login button")
	public void to_user_click_login_button() {
	    WebElement element = driver.findElement(By.name("login"));
	    btnClick(element);
	}

}
