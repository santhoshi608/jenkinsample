import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

@Test
public class BeforeAfter {
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter extentRep;
	ExtentTest testCase;
	String ExceptedText="Hello vasuvespag!";
	
  public void f() {
	  testCase=extent.createTest("Validate Greeting");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://adactinhotelapp.com/");
	  driver.findElement(By.id("username")).sendKeys("Sudeepthi01");
		driver.findElement(By.id("password")).sendKeys("Pizza#2002");
		driver.findElement(By.id("login")).click();
		String Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
				
				if(Greeting.equalsIgnoreCase(ExceptedText)){
					testCase.log(Status.PASS, "Actual Greeting!");
				}
				else {
					testCase.log(Status.FAIL, " Not Actual Greeting!");
				}
	 File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 try {
		 FileUtils.copyFile(srcFile, new File("C:/Vasu/Capgemini/exteAttachScreenshot.png"));
	 }catch (IOException e) {
		 e.printStackTrace();
	 }
  }
  @BeforeSuite
  public void beforeSuite() { 
	  
	  extent=new ExtentReports();
	  extentRep =new ExtentSparkReporter("target/exHtml.html");
	  extent.attachReporter(extentRep);
	  
  }

  @AfterSuite
  public void afterSuite() {
	 testCase.addScreenCaptureFromPath("C:/Vasu/Capgemini/exteAttachScreenshot.png") ;
	 driver.quit();
	 extent.flush();
	  
  }

}
