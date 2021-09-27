package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement dragitem=driver.findElement(By.id("draggable"));
		
		WebElement dropitem=driver.findElement(By.id("droptarget"));

		Actions ac = new Actions(driver);
		//ac.dragAndDrop(dragitem, dropitem).build().perform();
	
		ac.clickAndHold(dragitem).moveToElement(dropitem).release().build().perform();
		
		
	
	}
	
	

}
