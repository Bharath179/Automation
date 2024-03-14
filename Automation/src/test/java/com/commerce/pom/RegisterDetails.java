package com.commerce.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterDetails {

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	
	@FindBy(xpath = "//span[@class='male']/label[text()='Male']")
	private WebElement maleradioBtn;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement namefield;
	
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastname;
	
	@FindBy(xpath = "//select[@name='DateOfBirthDay']/option[text()='8']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@name='DateOfBirthMonth']/option[text()='April']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@name='DateOfBirthYear']/option[text()='1997']")
	private WebElement year;
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement conformpassword;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submitBtn;

	
	public RegisterDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getMaleRadioBtn() {
		return maleradioBtn;
	}
	public WebElement getFirstname() {
		return namefield;
	}
	public WebElement getLastName() {
		return lastname;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConPassword() {
		return conformpassword;
	}
	public WebElement getsubmit() {
		return conformpassword;
	}
}
