package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdrivermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//firefox invoke
		WebDriver driver = new FirefoxDriver();
		//write url in to browser
		driver.get("http://www.facebook.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
	
	}

}
