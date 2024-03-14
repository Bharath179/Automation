package com.facebook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement createBtn;
	
	@FindBy(name = "firstname")
	private WebElement firstnametextField;
	
	@FindBy(name = "lastname")
	private WebElement lastnametextField;
	
	@FindBy(name = "reg_email__")
	private WebElement emailtextField;
	
	@FindBy(id = "password_step_input")
	private WebElement passtextField;
	
	@FindBy(xpath = "//select[@name='birthday_day']/option[text()='8']")
	private WebElement day;
	
	@FindBy(xpath = "//select[@name='birthday_month']/option[text()='Apr']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@title='Year']/option[text()='1997']")
	private WebElement year;
	
	@FindBy(xpath = "//label[text()='Male']/following-sibling::input[@type='radio']")
	private WebElement selectGender;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement conformemail;
	
	@FindBy(name = "websubmit")
	private WebElement submitBtn;
	
	public SignUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateBtn() {
		return createBtn;
	}
	public WebElement getfirstnametextField() {
		return firstnametextField;
	}
	public WebElement getLNametextField() {
		return lastnametextField;
	}
	public WebElement getEmailtextField() {
		return emailtextField;
	}
	public WebElement getPasswordtextField() {
		return passtextField;
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
	public WebElement getGender() {
		return selectGender;
	}
	public WebElement getConformEmail() {
		return conformemail;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
}
