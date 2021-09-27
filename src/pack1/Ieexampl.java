package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ieexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\kiran\\Downloads\\IEDriver\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.google.com");
		
	
	
	}

}
