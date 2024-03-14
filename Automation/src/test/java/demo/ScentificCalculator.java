package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScentificCalculator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.calculator.net/scientific-calculator.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='5']")).click();
	driver.findElement(By.xpath("//span[text()='×']")).click();
	driver.findElement(By.xpath("//span[text()='5']")).click();
	String actualText ="25";
	String expectedText = driver.findElement(By.id("sciOutPut")).getText();
	System.out.println("actualText:"+actualText);
	System.out.println("expectedText:"+expectedText);
	if(actualText.equals(expectedText)) {
		System.out.println("The result is correct and it is verified");
	}else {
		System.out.println("The result is correct and it is verified");
	}
	Thread.sleep(2000);
	driver.quit();
}
}
