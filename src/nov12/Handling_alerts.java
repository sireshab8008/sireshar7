package nov12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_alerts {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
// Click on login button
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
// Get alert message on pop up windows
		String alertmessage=driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(2000);
// Accept alert
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}

}
