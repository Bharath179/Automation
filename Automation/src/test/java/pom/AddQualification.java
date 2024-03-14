package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddQualification {
	
	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper']//span[text()='Admin']")
	private WebElement adminBtn;

	@FindBy(xpath = "(//ul)[3]//li[4]")
	private WebElement qualification;
	
	@FindBy(xpath = "//ul[@role='menu']/li/a[text()='Skills']")
	private WebElement skills;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement addBtn;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement nameTextField;
	
	@FindBy(xpath = "//textarea[@placeholder='Type description here']")
	private WebElement textArea;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "//div[text()='Manual Testing']")
	private WebElement verifyName;
	
	public AddQualification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getadmin() {
		return adminBtn;
	}
	public WebElement getDetails() {
		return qualification;
	}
	public WebElement getSkills() {
		return skills;
	}
	public WebElement getAddButton() {
		return addBtn;
	}
	public WebElement getName() {
		return nameTextField;
	}
	
	public WebElement gettDescription() {
		return textArea;
	}
	public WebElement getSubmit() {
		return submitBtn;
	}
	public WebElement getActualName() {
		return verifyName;
	}
}
