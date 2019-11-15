package nov8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_methods {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	//store day list box into select class
		Select daylistbox=new Select(driver.findElement(By.id("day")));
		daylistbox.selectByVisibleText("26");
		Thread.sleep(1000);
		
		Select monthlistbox=new Select(driver.findElement(By.id("month")));
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(1000);
		
		Select yearlistbox=new Select(driver.findElement(By.id("year")));
		yearlistbox.selectByVisibleText("1994");
		Thread.sleep(1000);
		
		yearlistbox.selectByIndex(20);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		
		yearlistbox.selectByValue("1994");
		System.out.println(yearlistbox.getFirstSelectedOption().getText());

		Thread.sleep(1000);
		driver.close();
	}

}
