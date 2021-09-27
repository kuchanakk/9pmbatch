package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locexampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//*************id********************
		//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		//*************Name*****************
		//driver.findElement(By.name("pass")).sendKeys("nj9897");
		//**********Link Text*********
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//********Plinktext**********
		//driver.findElement(By.partialLinkText("Create a")).click();
		
		// total number of links in fb page
		// *********tagname************
	//	int linksize=driver.findElements(By.tagName("a")).size();
		// System.out.println("total number of links in fb page = "+driver.findElements(By.tagName("a")).size());
		
	
		//int inpusize=driver.findElements(By.className("inputtext")).size();
		//System.out.println(inpusize);
		
		//*******Xpath**************
		
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("njnjn");
	
	}

}
