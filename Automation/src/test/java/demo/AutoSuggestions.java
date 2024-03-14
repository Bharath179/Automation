package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().activeElement().sendKeys("selenium");
	List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
	int count = sugg.size();
	System.out.println(count);
	for (WebElement autoSuggestions : sugg) {
		String text = autoSuggestions.getText();
		System.out.println(text);
	}
	driver.quit();
}
}
