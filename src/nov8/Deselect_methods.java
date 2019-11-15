package nov8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_methods {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		Select listbox=new Select(driver.findElement(By.id("fruits")));
		Boolean value=listbox.isMultiple();
		System.out.println(value);
		listbox.selectByIndex(0);
		Thread.sleep(1000);
		listbox.selectByIndex(2);
		Thread.sleep(1000);
		listbox.selectByIndex(3);
		Thread.sleep(1000);
	//Count number of items selected
		List<WebElement>olist=listbox.getAllSelectedOptions();
		System.out.println("number of items selected"+olist.size());
		for (int i = 0; i < olist.size(); i++)
		{
			String itemname=olist.get(i).getText();
			System.out.println(itemname);
		
		}
		listbox.deselectByIndex(0);
		Thread.sleep(1000);
		listbox.deselectAll();
		Thread.sleep(1000);
		driver.close();
		}

}
