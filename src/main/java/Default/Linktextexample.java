package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.className("button")).click();
		//driver.findElement(By.linkText("Learn more")).click();
		//driver.findElement(By.partialLinkText("Learn")).click();
		driver.close();
	}

}
