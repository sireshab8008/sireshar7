package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_multiple {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	//store day list box into select class
		Select daylistbox=new Select(driver.findElement(By.id("day")));
	//Verify list boxes are single or multi selection list boxes
		Boolean value=daylistbox.isMultiple();
		System.out.println("listbox is::"+value);
		Thread.sleep(1000);
		
		Select monthlistbox=new Select(driver.findElement(By.id("month")));
		Boolean value1=monthlistbox.isMultiple();
		System.out.println("listbox is::"+value1);
		Thread.sleep(1000);
		
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		Boolean value2=yearlistbox.isMultiple();
		System.out.println("listbox is::"+value2);
		Thread.sleep(1000);
		
	//get collection of items in list box
		List<WebElement> list=daylistbox.getOptions();
		System.out.println("number of items are::"+list.size());
		for (int i = 1; i < list.size(); i++) 
		{
			String listname=list.get(i).getText();
			System.out.println(listname);
			Thread.sleep(1000);
			list.get(i).click();
			
		}
		Thread.sleep(1000);
		driver.close();
	}

}
