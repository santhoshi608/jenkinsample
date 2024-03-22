import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SampleLogin {
	@Test(retryAnalyzer=retry.class)    
	public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://adactinhotelapp.com/");
	  driver.findElement(By.id("username")).sendKeys("Sudeepthi01");
		driver.findElement(By.id("password")).sendKeys("Pizza#2002");
		driver.findElement(By.id("login")).click();
		assertEquals(2+2,5);
  }
}
