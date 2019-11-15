package nov8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("pagetitle[1]::"+driver.getTitle());
		//Click on gmail link
		driver.findElement(By.partialLinkText("Gm")).click();
		Thread.sleep(3000);
		System.out.println("pagetitle[2]::"+driver.getTitle());
		//click on back, forward and refresh buttons in browser
		driver.navigate().back();
		System.out.println("pagetitle[3]::"+driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().forward();
		System.out.println("pagetitle[4]::"+driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
		
	}

}
