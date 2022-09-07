package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://portal.apistrong.io");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtEmail")).sendKeys("maya@mailinator.com");
		driver.findElement(By.name("Password")).sendKeys("test123");
		//driver.findElement(By.name(null)).click();

	}

}
