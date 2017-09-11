import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Basic {
public static void main(String[] args) {
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet=wb.createSheet("Test");
	 Object[][] bookData = {
             {"Head First Java", "Kathy Serria", 79},
             {"Effective Java", "Joshua Bloch", 36},
             {"Clean Code", "Robert martin", 42},
             {"Thinking in Java", "Bruce Eckel", 35},
     };
	 int rowCount = 0;
	 for (Object [] obj : bookData) {
		 Row row=sheet.createRow(rowCount++);
		 int  count=0;
		 
		 for(Object field : obj) {
			 Cell cell=row.createCell(count++);
			 
			 
			 
		 }
		 
	 }
}
}
