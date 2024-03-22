import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class today {

	
		// TODO Auto-generated method stub
	WebDriver driver;
		@Test
		@Parameters({"username","password"})
		public void login(String username, String password) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("login")).click();
			
		}

	}

