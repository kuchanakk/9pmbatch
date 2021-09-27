package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isispld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		/*
		 * boolean
		 * oneway=driver.findElement(By.id("ctl00_mainContent_ddl_originStation2_CTXT"))
		 * .isDisplayed(); System.out.println(oneway);
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();
		 * 
		 * boolean
		 * mcity=driver.findElement(By.id("ctl00_mainContent_ddl_originStation2_CTXT")).
		 * isDisplayed(); System.out.println(mcity);
		 */
	
		int e=driver.findElements(By.id("ctl00_mainContent_ddl_originnjn")).size();
		System.out.println(e);
	}

}
