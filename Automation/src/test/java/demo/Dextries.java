package demo;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

public class Dextries {
	WebDriver driver;
	
/*@Test(priority = 1)
@Parameters("browser")
public void verifyIndustries(String browser) {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("firefox")){
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://dextris.in/");
	 WebElement industries = driver.findElement(By.xpath("//li//a[text()='Industries']"));
	 industries.click();
	List<WebElement> listOfIndustries = driver.findElements(By.xpath("//ul[@class='category-list clearfix']"));
	 int count=listOfIndustries.size();
		System.out.println(count);
		for (WebElement news : listOfIndustries) {
			String text=news.getText();
			System.out.println(text);
		}
		driver.quit();

}*/

@Test(priority = 2)
@Parameters("browser")
public void verifyDropdown(String browser) {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equals("firefox")){
		driver=new FirefoxDriver();
	}
	driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
	if(dropdown.isEnabled() && dropdown.isDisplayed()) {
		System.out.println("Dropdown is enabled and visible");
	}else {
		System.out.println("Dropdown is not enabled and it is not visible");
	}
	
	Select s = new Select(dropdown);
	
	if(s.isMultiple()) {
		System.out.println("Dropdown list is accepting multiple choices");
	}else {
		System.out.println("Dropdown list is not accepting multiple choices");
	}
	int dropdownSize = s.getOptions().size();
	System.out.println("dropdownSize:"+dropdownSize );
     s.selectByVisibleText("India");
     String text = s.getFirstSelectedOption().getText();
     System.out.println("optionSelected:"+ text);
     driver.quit();
}
}


