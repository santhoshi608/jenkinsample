package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {

		// TODO Auto-generated method stub
		WebDriver driver;

		public SearchHotel(WebDriver driver) {	
			this.driver=driver;
			
			}
		By locationDropDown=By.id("location");
		public void selectLocation(String value) {
			WebElement ele = driver.findElement(locationDropDown);
			Select location  = new Select(ele);
			
			
			location.selectByVisibleText(value);
		}
				
		      

	}

