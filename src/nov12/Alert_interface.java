package nov12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_interface {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" ");
		driver.manage().window().maximize();
// Click on me button
		driver.findElement(By.xpath("")).click();
// Creating alert interface for an object
		Alert alert=driver.switchTo().alert();
//Get alert message on pop up window
		String alertmessage=alert.getText();
		System.out.println(alertmessage);
// Enter some text in alert window
		alert.sendKeys("");
//Accept alert
		alert.accept();
// After accepting again we will get a message in web page get that text
		String message=driver.findElement(By.xpath("")).getText();
		System.out.println(message);
		driver.close();
		
	}

}
