package day_6;


import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Xcel {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\gagan\\Downloads\\sample-csv-files-sample-4.csv");
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }

            workbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("Excel file not found.");
        } catch (IOException e) {
            System.out.println("Error reading Excel file.");
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Error closing Excel file.");
            }
        }
    }
}