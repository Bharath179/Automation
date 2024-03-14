package com.commerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(linkText = "Log in")
	private WebElement login;
	
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement rememberme;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginBtn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return password;
	}
	public WebElement getRemember() {
		return rememberme;
	}
	public WebElement getloginBtn() {
		return loginBtn;
	}
}
