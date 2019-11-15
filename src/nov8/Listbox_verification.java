package nov8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_verification {

	public static void main(String[] args)throws Throwable {
		String expyear="2000";
		Boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();		
		
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		List<WebElement>olist=yearlistbox.getOptions();
		System.out.println("number of items::"+olist.size());
		for (int i = 1; i < olist.size(); i++)
		{
			String actitems=olist.get(i).getText();
			System.out.println(actitems);
			Thread.sleep(1000);
		if (expyear.equalsIgnoreCase(actitems)) 
		{
			itemexist=true;
			break;//to exit loop when item equals to act items
		}
		}
		//Item contains true or false. If it is true conditional part executes
		//If it is false else part executes
		if (itemexist) 
		{
			System.out.println("item found"+expyear);
		}
		else 
		{
			System.out.println("item not found"+expyear);
		}
		driver.close();
	}

}
