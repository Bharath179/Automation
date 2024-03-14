package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagram {
@Test
public void login() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instagram.com/");
	driver.findElement(By.name("username")).sendKeys("9945471538");
	driver.findElement(By.name("password")).sendKeys("kumar@12");
	driver.findElement(By.xpath("//div//button//div[text()='Log in']")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
