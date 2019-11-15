package nov8;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		WebElement firstnametext=driver.findElement(By.name("firstname"));
		//Get height and width of text box
		Dimension dim=firstnametext.getSize();
		System.out.println("height::"+dim.getHeight()+"width::"+dim.getWidth());
		
		WebElement lastnametext=driver.findElement(By.name("lastname"));
		Dimension dim1=lastnametext.getSize();
		System.out.println("height::"+dim1.getHeight()+"width::"+dim1.getWidth());
		
		WebElement mobiletext=driver.findElement(By.name("reg_email__"));
		Dimension dim2=mobiletext.getSize();
		System.out.println("heigssht::"+dim2.getHeight()+"width::"+dim2.getWidth());
		
		WebElement newpasswordtext=driver.findElement(By.name("reg_passwd__"));
		Dimension dim3=newpasswordtext.getSize();
		System.out.print("height::"+dim3.getHeight()+"width::"+dim3.getWidth());
		
		WebElement confirmationtext=driver.findElement(By.name("reg_email_confirmation__"));
		Dimension dim4=confirmationtext.getSize();
		System.out.println("height::"+dim4.getHeight()+"width::"+dim4.getWidth());
		
		WebElement daytext=driver.findElement(By.name("birthday_day"));
		Dimension dim5=daytext.getSize();
		System.out.println("height::"+dim5.getHeight()+"width::"+dim5.getWidth());
		
		WebElement monthtext=driver.findElement(By.name("birthday_month"));
		Dimension dim6=monthtext.getSize();
		System.out.println("height::"+dim6.getHeight()+"width::"+dim6.getWidth());
		
		WebElement yeartext=driver.findElement(By.name("birthday_year"));
		Dimension dim7=yeartext.getSize();
		System.out.println("height::"+dim7.getHeight()+"width::"+dim7.getWidth());
		
		WebElement signupbutton=driver.findElement(By.name("websubmit"));
		Dimension dim8=signupbutton.getSize();
		System.out.println("height::"+dim8.getHeight()+"width::"+dim8.getWidth());
		
		driver.close();

		
	}

}
