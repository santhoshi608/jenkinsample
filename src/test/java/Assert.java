import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class Assert {
	
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  System.out.println("jenkin commit");
	  System.out.println("hi");
	  
	  int a=5;
	  int b=10;
	  SoftAssert sa=new SoftAssert();
		sa.assertEquals(a,b);
  }
}
