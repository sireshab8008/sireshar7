package nov13;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_windowhandle {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("flight")).click();
		//Thread.sleep(200);
		driver.findElement(By.id("charterTrainIcon")).click();
		//Thread.sleep(200);
		driver.findElement(By.xpath("//span[@class='allcircle circlesix']")).click();
		//Thread.sleep(200);
		driver.findElement(By.id("galleryIcon")).click();
		//Thread.sleep(200);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
// get collection of parent and child Id's
		ArrayList<String>irctc=new ArrayList<String>(driver.getWindowHandles());
		//Thread.sleep(2000);
		System.out.println(irctc);
		Iterator<String>irctcwindows=irctc.iterator();
		while (irctcwindows.hasNext()) 
		{
			String child=irctcwindows.next();
			
			if (!parent.equals(child))
			{
				String pagetitle=driver.switchTo().window(child).getTitle();
				//Thread.sleep(2000);
				System.out.println(pagetitle);
				driver.close();
				//Thread.sleep(200);
				
			}
		}
		
		//switch back to parent
		driver.switchTo().window(parent);
		//Thread.sleep(200);
		driver.close();
		
	}

}
