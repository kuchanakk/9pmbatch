package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Isenabled {

	@Test
	//public static void main(String[] args) throws InterruptedException {
	public static void test1() throws InterruptedException {	
	// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com/#/");
		Thread.sleep(10000);
		driver.findElement(By.id("menuUser")).click();
		boolean before=driver.findElement(By.id("sign_in_btnundefined")).isEnabled();
		System.out.println(before);
		driver.findElement(By.name("username")).sendKeys("kirank");
		//Actions ac = new Actions(driver);
		//ac.moveToElement(driver.findElement(By.name("username"))).sendKeys(Keys.TAB).sendKeys("0123456kK").build().perform();
		driver.findElement(By.name("password")).sendKeys("0123456kk");
		boolean after=driver.findElement(By.id("sign_in_btnundefined")).isEnabled();
		System.out.println(after);
		
		
		Assert.assertFalse(after);
		
		
	}

}
