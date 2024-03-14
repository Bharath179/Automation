package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath = "//li[@class='oxd-main-menu-item-wrapper']//span[text()='Admin']")
	private WebElement adminBtn;
	
	@FindBy(xpath = "//div[@class='orangehrm-header-container']/child::button[@type='button']")
	private WebElement addBtn;
	
	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::div[@class='oxd-select-text--after'])[1]")
	private WebElement selectUser;
	
	@FindBy(xpath = "//div[@role='option']//span[text()='Admin']")
	private WebElement selectESS;
	
	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']/descendant::div[@class='oxd-select-text--after'])[2]")
	private WebElement statusSelect;
	
	@FindBy(xpath = "//div[@role='option']//span[text()='Enabled']")
	private WebElement selectedEnabled;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employTextField;
	
	@FindBy(xpath = "(//input[@autocomplete='off'])[1]")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passTextField;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement conpassTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getadmin() {
		return adminBtn;
	}
	public WebElement getaddBtn() {
		return addBtn;
	}
	public WebElement getuser() {
		return selectUser;
	}
	public WebElement getEss() {
		return selectESS;
	}
	public WebElement getStatus() {
		return statusSelect;
	}
	public WebElement getEnabledoption() {
		return selectedEnabled;
	}
	public WebElement getEmpname() {
		return employTextField;
	}
	public WebElement getUsername() {
		return usernameTextField;
	}
	public WebElement getPassword() {
		return passTextField;
	}
	public WebElement getConpassword() {
		return conpassTextField;
	}
	public WebElement getSave() {
		return saveBtn;
	}
	
}
