package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alllocatorsatone {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@Test
	
	public void Login()
	{
		driver.get("https://portal.apistrong.io");
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		driver.findElement(By.id("txtEmail")).sendKeys("maya@mailinator.com");
		driver.findElement(By.id("txtPassword")).sendKeys("test123");
		driver.findElement(By.className("signInButton")).click();
		driver.close();
	}
	
	@Test(enabled = false)
	public void handledropdown()
	{
		driver.get("https://portal.apistrong.io");
		driver.findElement(By.id("txtEmail")).sendKeys("maya@mailinator.com");
		driver.findElement(By.id("txtPassword")).sendKeys("test123");
		driver.findElement(By.className("signInButton")).click();
		driver.findElement(By.id("dropdownSubMenureport")).click();
		WebElement user= driver.findElement(By.id("dropdownSubMenureport"));
		Select usr= new Select(user);
		
		driver.close();

	}

}
