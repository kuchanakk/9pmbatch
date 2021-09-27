package testngpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngexampl1 {
	
	@Test(priority =0)
	public static void login() {
		
		System.out.println("Login script-----@test");
		
	}
	
	@Test(priority =1)
public static void compemail() {
		
		System.out.println("comemail script----@test");
		
	}
	
	@Test(enabled=false)
	public static void delemail() {
		
		System.out.println("del email script----@test");
	}
	
	
	@BeforeTest
	public static void openbrowser() {
		
		System.out.println("open browser script------@beforetest");
	}
	
	@AfterTest
	public static void aftertest() {
		
		System.out.println("close browser scrip----@Aftertest");
	}

	@BeforeMethod
	public static void beforemethod() {
		System.out.println("before method script");
	}
			
	@AfterMethod
	public static void aftermethod() {
		System.out.println("after method script");
	}
		
	
}
