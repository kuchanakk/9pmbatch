package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookinksexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		//firefox invoke
		WebDriver driver = new FirefoxDriver();
		//write url in to browser
		driver.get("http://www.facebook.com");
		int linksize=driver.findElements(By.tagName("a")).size();
		System.out.println("total number of links in fb page = "+ linksize);
		
		for(int i =0;i<linksize;i++) {
			
			String linktext=driver.findElements(By.tagName("a")).get(i).getText();
			String hreftext=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			
			System.out.println(i +"  index link text =***** "+linktext+" ***** and href = ****** "+hreftext+" ******");
			
		}
		
		

	}

}
