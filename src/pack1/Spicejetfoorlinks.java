package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejetfoorlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement footer=driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[5]"));
	
		int fotersize=footer.findElements(By.tagName("a")).size();
		System.out.println(fotersize);
		
		for(int i =0;i<fotersize;i++) {
			
			String fotertext=footer.findElements(By.tagName("a")).get(i).getText();
			System.out.println(fotertext);
		}
				
		
		
		
	
	}

}
