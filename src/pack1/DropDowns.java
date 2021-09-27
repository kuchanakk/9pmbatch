package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		WebElement crncy=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//classname obj = new classname
		Select sc=new Select(crncy);
		//sc.selectByIndex(2);
		//sc.selectByVisibleText("AED");
		//sc.selectByValue("USD");
		int itesze=sc.getOptions().size();
		System.out.println(itesze);
		
		for(int i=0;i<itesze;i++) {
			
			String itemtext=sc.getOptions().get(i).getText();
			System.out.println(itemtext);
		}
		
		
		
	}

}
