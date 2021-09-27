package ddtpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Datadrivenfw {

	//@Test
	//public static void exceltest() {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Desktop\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int rcount=wb.getSheet("Sheet6").getLastRowNum();
		
		for(int i =1;i<=rcount;i++) {
			
			String username=wb.getSheet("Sheet6").getRow(i).getCell(0).getStringCellValue();
			String password=wb.getSheet("Sheet6").getRow(i).getCell(1).getStringCellValue();
			
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\kiran\\\\Downloads\\\\geckodrive29\\\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://advantageonlineshopping.com/#/");
			Thread.sleep(10000);
			driver.findElement(By.id("menuUser")).click();
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			Thread.sleep(5000);
			driver.findElement(By.id("sign_in_btnundefined")).click();
			Thread.sleep(5000);
			String actualvalue=driver.findElement(By.xpath("//*[@id=\"menuUserLink\"]/span")).getText();
			
			if(username.equals(actualvalue)) {
				
				System.out.println("test is pass");
				wb.getSheet("Sheet6").getRow(i).createCell(2).setCellValue("valid data");
				
			}else {
				
				System.out.println("test is failed");
				wb.getSheet("Sheet6").getRow(i).createCell(2).setCellValue("invalid data");

			}

			FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\kiran\\\\Desktop\\\\testdata.xlsx");
			wb.write(fos);
			fos.close();
		driver.close();	
			
			
		}
		

	}

}
