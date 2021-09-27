package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertexampl {
	
	
	@Test
	public static void  fbtitle() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		String actttile=driver.getTitle();
		String exptitle = "Facebook – log in";
		
		//Assert.assertEquals(actttile, exptitle);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actttile, exptitle);
		
		
		System.out.println(" script after assert");
		sa.assertAll();
		
	}
	
	
	@Test
	public static void nexttest() {
		
		System.out.println(" next test script");
	}

}
