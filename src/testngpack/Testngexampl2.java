package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngexampl2 {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void teststart() {
		
		System.out.println("*********TEST START**********");
	}
	
	@BeforeMethod
	public static void openbrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void amzon() {
		
driver.get("http://www.amazon.in");
	System.out.println(driver.getTitle());
	
	}
	@Test
public static void fb() {
	
	driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
}

	@AfterMethod
public static void closebrowser() {
	
	driver.close();
}

	
	@AfterTest
	public static void testend() {
		
		System.out.println("*********TEST end**********");
	}
	
	
	
	
}


