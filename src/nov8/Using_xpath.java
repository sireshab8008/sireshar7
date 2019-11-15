package nov8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpath {

	public static void main(String[] args)throws Throwable {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com");
		//Store username and password textbox into webelement
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.clear();
		username.sendKeys("Admin");
		Thread.sleep(1000);
		
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.clear();
		password.sendKeys("Qedgetech123!@#");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//verify url contains dash after login
		if (driver.getCurrentUrl().contains("dash")) 
		{
			System.out.println("login success");
		}
		else
		{
			String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(message+"  "+"login fail");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
