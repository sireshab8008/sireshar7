package nov12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	// Get parent window
		String parent=driver.getWindowHandle();
		System.out.println(parent);
	// click on help, privacy, terms
		driver.findElement(By.partialLinkText("Help")).click();
		driver.findElement(By.partialLinkText("Priva")).click();
		driver.findElement(By.partialLinkText("Terms")).click();
	// Get collection of all windows opened by selenium
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		for (String each:allwindows) 
		{
			// parent window should not be equal to child window
			if (!parent.equals(each))
			{
			    String pagetitle=driver.switchTo().window(each).getTitle();
			    Thread.sleep(1000);
			    System.out.println(pagetitle);
			    Thread.sleep(1000);
			    driver.close();
			    Thread.sleep(1000);
			   
			} 
		} 

			 // Switch back to parent
		    driver.switchTo().window(parent);
		    Thread.sleep(1000);
			driver.findElement(By.id("identifierId")).sendKeys("sireesha261294");
			driver.close();
			
			
		
	}

}
