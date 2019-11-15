package nov8;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_location {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://facebook.com");
	driver.manage().window().maximize();
	WebElement mobiletextbox=driver.findElement(By.name("reg_email__"));
	Point p=mobiletextbox.getLocation();
	System.out.println("location from x coordinator::"+p.getX()+"\n"+"location from y coordinator::"+p.getY());
	driver.close();
	}

}
