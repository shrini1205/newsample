package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.BaseClass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  extends BaseClass{
	

	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		browserLaunch("https://www.facebook.com/");
	}

	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@When("user print the page url")
	public void user_print_the_page_url() {
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
	}

	@When("user print page title")
	public void user_print_page_title() {
		driver.getTitle();
		System.out.println(driver.getTitle());
	}

}
