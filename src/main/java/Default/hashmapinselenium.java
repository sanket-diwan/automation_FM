package Default;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class hashmapinselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://portal.apistrong.io");
		
		String credentials=Logindata().get("x");
		
		String[]arr=credentials.split("_");
		
		driver.findElement(By.id("txtEmail")).sendKeys(arr[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(arr[1]);
		driver.findElement(By.id("kc-login")).click();

	}
	
	public static HashMap<String, String> Logindata()
	{
		HashMap<String, String>map=new HashMap<String, String>();
		map.put("x", "maya@mailinator.com_test123");
		map.put(null, null);
		map.put(null, null);
		return map;
	}

}
