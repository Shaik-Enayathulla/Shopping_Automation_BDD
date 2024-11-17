package utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.*;

public class dataReaderutility {
	
	public static List<HashMap<String,String>> logingData(String filePath, String SheetName) throws IOException
	{
		List<HashMap<String,String>> data = new ArrayList<>();
		try 
		{
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheet(SheetName);
			XSSFRow HeaderRow = sheet.getRow(0);
			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				XSSFRow currentrow = sheet.getRow(i);
				HashMap<String,String> currentHash = new HashMap<String,String>();
				for(int j=0;j<currentrow.getPhysicalNumberOfCells();j++)
				{
					Cell currentCell = currentrow.getCell(j);
					switch(currentCell.getCellType())
					{
						case STRING:
							currentHash.put(HeaderRow.getCell(j).getStringCellValue(),currentCell.getStringCellValue());
							break;
						default: System.out.println("****Invalid data****");
					}
				}
				data.add(currentHash);
		}
			file.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
}
