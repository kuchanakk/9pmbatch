package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fcabooklinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		int linkssize=driver.findElements(By.tagName("a")).size();
		
		if(linkssize<=40) {
			
			System.out.println("test is pass as links are less then 50");
			System.out.println(linkssize);
		}
		else {
			
			System.out.println("total number of links = "+linkssize);
			System.out.println("test is fail");
			
		}

	}

}
