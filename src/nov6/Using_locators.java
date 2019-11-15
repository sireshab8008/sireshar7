package nov6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Using_locators {

	public static void main(String[] args) {
//create instance object for variable		
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.manage().window().maximize();
		System.out.println("Current url is::"+driver.getCurrentUrl());
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
//we can click buttons in two ways
//1.using click method
		//driver.findElement(By.id("login")).click();
//2. Using keyboard keys
		driver.findElement(By.id("login")).sendKeys(Keys.ENTER);

		driver.close();
	}

}
