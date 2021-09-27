/*Testname:kiran k kumar
date:29/7
first selenium example */


package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxexample {

	public static void main(String[] args) {
		//information realted to driver path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//firefox invoke
		WebDriver driver = new FirefoxDriver();
		//write url in to browser
		driver.get("http://www.facebook.com");
		
 	
	
	
	}

}
