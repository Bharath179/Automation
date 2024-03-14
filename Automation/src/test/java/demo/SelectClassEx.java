package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEx {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
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
