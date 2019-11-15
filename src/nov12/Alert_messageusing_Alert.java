package nov12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_messageusing_Alert {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
//click on alert in toolsqa
		driver.findElement(By.name("cusid")).sendKeys("59980");
		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
// Using alert Interface we were creating 
		Alert alert=driver.switchTo().alert();
		Thread.sleep(1000);
//Get text in pop up window
		String alertmessage=alert.getText();
		System.out.println(alertmessage);
		Thread.sleep(1000);
//click on cancel button
		alert.dismiss();
		Thread.sleep(1000);
		driver.close();
	}

}
