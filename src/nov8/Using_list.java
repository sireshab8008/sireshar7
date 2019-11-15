package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_list {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		//Get collection of links in a page which are under html tag vale a
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are::"+links.size());
		Thread.sleep(1000);
		for (int i = 0; i < links.size(); i++)
		{
		 //Get each link text
			String linkname=links.get(i).getText();
		//Get each link url's
			String urlname=links.get(i).getAttribute("href");
			System.out.println(linkname+"\n"+urlname);
			
		}
		Thread.sleep(1000);
		driver.close();
	}

}
