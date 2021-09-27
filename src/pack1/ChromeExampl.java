package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver91\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://amazon.in");
		
		

	}

}
