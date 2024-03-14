package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

	@FindBy(name="username")
	private WebElement userNametextfield;
	
	@FindBy(name="password")
	private WebElement passwordBtn;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setlogin(String un,String pw) {
		userNametextfield.sendKeys(un);
		passwordBtn.sendKeys(pw);
		loginBtn.click();
	}
}
