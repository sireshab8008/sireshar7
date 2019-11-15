package nov7;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Using_getmethods {

	public static void main(String[] args)throws Throwable {
		HtmlUnitDriver driver=new HtmlUnitDriver();
// launch url
		driver.get("https://yahoo.com");
		driver.manage().window().maximize();
// Print title of the page and length of the title
		String pagetitle=driver.getTitle();
		System.out.println("page title is::"+pagetitle);
		System.out.println("page length is::"+pagetitle.length());
// Print current url of the page and length of the url
		String url=driver.getCurrentUrl();
		System.out.println("page url is::"+url);
		System.out.println("page url length is::"+url.length());
		Thread.sleep(5000);
		
	}

}
