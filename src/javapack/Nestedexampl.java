package javapack;

public class Nestedexampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int transcount = 3;
		int Amount_withdrwal=15000;
		
		
		if(transcount<=3) {
			
			System.out.println("Enter Amount");
			
			if(Amount_withdrwal<=10000) {
				
				System.out.println("$$$$$$$CASHOUT$$$$$");
				
			}else {
				
				
				System.out.println("max withdrwl per trans should be less then 10k");
			}
			
			
			
		}else {
			
			
			System.out.println("number of trns per day limit is 3 ");
			
			
		}
		
		
		
		

	}

}
