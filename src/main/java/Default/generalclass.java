package Default;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generalclass {
	
	static String url="https://www.google.com/intl/en-GB/gmail/about/";

	public static void main(String[] args) {
		
		launchbrowser();
	}
	
	public static void launchbrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}
}
