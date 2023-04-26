package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exelsheet {
	public static String read(String name, int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("E:\\SwagLab_Swapnil\\Swag_Labs\\src\\test\\resources\\SwagLabs.xlsx");
	return	WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		
	}

	
		
	}
	
	
	


