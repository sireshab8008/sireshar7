package nov7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Matching_title {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			//launch url
			driver.get("http://gmail.com");
			driver.manage().window().maximize();
			//storing expected result into one class
			String exptitle="gmail";
			//store actualresult into string class and get title of the page
			String actitle=driver.getTitle();
			//verify exptitle is equal to actitle
			if (exptitle.equalsIgnoreCase(actitle)) 
			{
				System.out.println("Title is matching: "+"  "+exptitle+"  "+actitle);
				
			}
			else
			{
			System.out.println("Title is not matching: "+"  "+exptitle+"  "+actitle);	
			}
		driver.close();
	}
}