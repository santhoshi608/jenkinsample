package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {

		// TODO Auto-generated method stub
        WebDriver driver;
		
		public login(WebDriver driver) {	
		this.driver=driver;
		}
		
		//By Name=By.id("username");
		//By Password=By.id("password");
		//By LoginButton=By.id("login");
		
		@FindBy(id="username")
		WebElement Name;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="login")
		WebElement login;
		
		
		
		public void findUserName() {
			Name.sendKeys("santhoshi2103");
		}
		
		public void findPassword() {
			password.sendKeys("63P3V3");
		}
		public void findLoginButton() {
			login.click();
		}


	}
