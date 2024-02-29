package DataReader;

import Utilities.BaseClass;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataReader extends BaseClass {

    @DataProvider(name = "Login Data from Excel")
    public Object [][] loginData() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\conne\\IdeaProjects\\Practice\\src\\test\\ExternalData\\ExcelData.xlsx");

        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet("LoginInfo");

        int rowCount = sheet.getPhysicalNumberOfRows();

        int colmCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object [][] data = new Object[rowCount][colmCount];

        for(int i =0; i<rowCount; i++){
            XSSFRow row = sheet.getRow(i);
            for(int j=0; j<colmCount; j++){
                data[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }

        return data;
    }



}
