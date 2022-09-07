package Default;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltohahmap {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream(".\\Datafiles\\Testdata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		
		//String key=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(key);
		
		HashMap<String, String>data= new HashMap<String,String>();
		
		//Reading data from excel to Hashmap
		
		for(int r=0;r<=rows;r++)
		{
			DataFormatter formatter = new DataFormatter();

			String key =  formatter.formatCellValue(sheet.getRow(r).getCell(0));
			String value = sheet.getRow(r).getCell(1).toString();
			
			
			 
			data.put(key, value);
			
		}
		 for(Entry<String, String> Entry :data.entrySet())
		 {
			 System.err.println(Entry.getKey()+" "+Entry.getValue());
		 }
	}
	

}
