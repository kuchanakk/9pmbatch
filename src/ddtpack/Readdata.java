package ddtpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Desktop\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//String val1=wb.getSheet("Sheet1").getRow(4).getCell(5).getStringCellValue();
		//System.out.println(val1);
		
		int rcount=wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rcount);
		//int clcount=wb.getSheet("Sheet1").getRow(1).getLastCellNum();
		//System.out.println(clcount);
		
		for(int i =0;i<=rcount;i++) {
			
			int clmcount=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
			
			System.out.println(i +" index number row contains = "+clmcount+"  clms");
		}
		
		

	}

}
