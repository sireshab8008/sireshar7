package nov8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args)throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.get("http://newtours.demoaut.com");
		dr.manage().window().maximize();
//Get text of register
		String acttext=dr.findElement(By.partialLinkText("REG")).getText();
//Get url of register link
		String url=dr.findElement(By.partialLinkText("REG")).getAttribute("href");
		System.out.println(url);
		String exptxt="register";
		if (acttext.equalsIgnoreCase(exptxt))
		{
		System.out.println("Text is matching::"+acttext+"  "+exptxt);
		}
		else
		{
			System.out.println("Text is not matching::"+acttext+"  "+exptxt);
		}
		Thread.sleep(5000);
		dr.close();

	}

}
