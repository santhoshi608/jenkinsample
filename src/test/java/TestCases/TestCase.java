package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.login;
import Pages.SearchHotel;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com");
			//login obj=new login(driver);
			login obj =PageFactory.initElements(driver,login.class);
			obj.findUserName();
			obj.findPassword();
			obj.findLoginButton();
			
			SearchHotel obj1=new SearchHotel(driver);
			obj1.selectLocation("Sydney");
			
			

		}

	}

