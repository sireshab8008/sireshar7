package nov6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutinterface {

	public static void main(String[] args)throws Throwable {
//write a script to register application of webtours without using webdriver interface

		
//creating object for browser class
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		System.out.println("print current url::"+driver.getCurrentUrl());
//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
Thread.sleep(1000);
//fill register form
		driver.findElement(By.name("firstName")).sendKeys("siresha");
		driver.findElement(By.name("lastName")).sendKeys("reddy");
		driver.findElement(By.name("phone")).sendKeys("80080");
		driver.findElement(By.name("userName")).sendKeys("siri");
		driver.findElement(By.name("address1")).sendKeys("bollarum");
		driver.findElement(By.name("address2")).sendKeys("hyderabad");
		driver.findElement(By.name("city")).sendKeys("hyd");
		driver.findElement(By.name("state")).sendKeys("ts");
		driver.findElement(By.name("postalCode")).sendKeys("50010");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		driver.findElement(By.name("email")).sendKeys("siri");
		driver.findElement(By.name("password")).sendKeys("siresha");
		driver.findElement(By.name("confirmPassword")).sendKeys("siresha");
		driver.findElement(By.name("register")).click();
Thread.sleep(1000);
		driver.close();
		
		
		
		
	}

}
