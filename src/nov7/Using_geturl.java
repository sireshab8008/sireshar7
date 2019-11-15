package nov7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_geturl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//Launch URL
		driver.get("https://google.com");
		driver.manage().window().maximize();
//Store expected url into a string class
		String expurl="https://";
//Store actual url and get current url
		String acturl=driver.getCurrentUrl();
		
//Verify url starts with https://
		if (acturl.startsWith(expurl))
		{
			System.out.println("url is secured:"+expurl+"  "+acturl);
			
		}
		else {
			System.out.println("url is not secured:"+expurl+"  "+acturl);
		}
		driver.close();
	}

}
