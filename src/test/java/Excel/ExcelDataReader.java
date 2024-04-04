package Excel;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class ExcelDataReader {
    @DataProvider(name = "search")
    public static String[][] getData() throws IOException {
        File excelFile = new File("C:\\Users\\REDSANTH\\eclipse-workspace\\AsianPaints\\src\\test\\resources\\AsianExcel.xlsx");
        FileInputStream fis = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getPhysicalNumberOfRows();
        String[][] data = new String[rows - 1][1];
        for (int i = 0; i < rows - 1; i++) {
            DataFormatter df = new DataFormatter();
            data[i][0] = df.formatCellValue(sheet.getRow(i + 1).getCell(0));
        }
        workbook.close();
        fis.close();
        return data;
    }
}