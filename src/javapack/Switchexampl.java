package javapack;

public class Switchexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser ="safari";
		
		switch(browser)
		{
		
		case "chrome":
			System.out.println(" launch chrome browser");
			break;
		case "firefox":
			System.out.println("launch firefox browser");
			break;
		case "ie":
			System.out.println("launch ie browser");
			break;
			
		case "opera":
			System.out.println("launch opera browser");
		break;
		
		default:
			System.out.println(browser +" browser is not avilable");
		
		
		}
	}

}
