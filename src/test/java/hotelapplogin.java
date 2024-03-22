import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class hotelapplogin {
	
	WebDriver driver;
  @Test(dataProvider="data-provider")

  public void f(String username, String password) {
	  
	  WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
  }
  @DataProvider(name="data-provider")
	public Object[][] data(){	
  xlutilities utils=new xlutilities("\"C:\\Users\\REDSANTH\\Desktop\\login.xlxs.xlsx\"");
  int rows=utils.getRowCount(0);
  Object[][] d=new Object[5][2];
	d[0][0]="vasuvespag";
	d[0][1]="vasu1234";
	d[1][0]="Sriyaseth";
	d[1][1]="Sriya@86";
	d[2][0]="Varsharaj";
	d[2][1]="Varsharaj";
	d[3][0]="jastisrija";
	d[3][1]="oY38Rv";
	d[4][0]="chaithuuu";
	d[4][1]="12309876";
  return null;
}
}

