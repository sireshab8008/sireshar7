package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_foreachloop {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://thehindu.com");
		driver.manage().window().maximize();
		//Get collection of links in a page which are under html tag vale a
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Number of links are::"+links.size());
		Thread.sleep(100);
		for (WebElement each:links)
		{
			String linkname=each.getText();
			String linkurl=each.getAttribute("href");
			System.out.println(linkname+"\n"+linkurl);
		}
		driver.close();
	}

}
