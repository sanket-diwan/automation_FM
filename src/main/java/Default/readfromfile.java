package Default;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readfromfile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("C:\\Automation_FM\\Datafiles\\Book1.xlsx");

		
		XSSFWorkbook book= new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheetAt(0);
		
		int rowcount= sheet.getLastRowNum();
	//System.out.println(rowcount);
		
		int colcount= sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		
			for(int i=0;i<rowcount;i++)
			{
				XSSFRow currentrow=sheet.getRow(i);
				
				for(int j=0;j<colcount;j++)
				{
					String value=currentrow.getCell(j).toString();
					System.out.println(value);
				}
				
				System.out.println();
			}
	}
	
	public void sanket()
	{
		int a =98;
	//	for(int i=0;i<n;i++)
		System.out.println("sanket diwan");
	}

}
