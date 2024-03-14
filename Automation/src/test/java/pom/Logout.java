package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement logoutBtn;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogout() {
		logoutBtn.click();
	}
}
