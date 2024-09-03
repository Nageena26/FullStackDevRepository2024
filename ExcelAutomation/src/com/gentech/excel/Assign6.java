package com.gentech.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign6 {
    public static void main(String[] args) {
        copyContent();
    }

    private static void copyContent() {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet original = null;
        Sheet copied = null;
        Row row = null;
        Cell cell = null;

        try {
            fin = new FileInputStream("C:\\Assignments\\Assign.xlsx");
            wb = new XSSFWorkbook(fin);

            // Original Sheet Object
            original = wb.getSheet("Flowers");

            // Create Copied Sheet Object
            copied = wb.createSheet("CopyFromFlowers");

            // Row Count
            int rc = original.getPhysicalNumberOfRows();
            for (int r = 0; r < rc; r++) {
                row = original.getRow(r);
                Row newRow = copied.createRow(r); // Creating same row in the copied

                int cc = row.getPhysicalNumberOfCells();
                for (int c = 0; c < cc; c++) {
                    cell = row.getCell(c);
                    Cell newCell = newRow.createCell(c); // Creating same cell in the copied

                    if (cell.getCellType() == CellType.BLANK) {
                        newCell.setBlank();
                    } else if (cell.getCellType() == CellType.STRING) {
                        newCell.setCellValue(cell.getStringCellValue());
                    } else if (cell.getCellType() == CellType.NUMERIC) {
                        newCell.setCellValue(cell.getNumericCellValue());
                    }
                    // Add more conditions for other cell types if needed
                }
            }

            // Writing changes to the file
            fout = new FileOutputStream("C:\\Assignments\\Assign.xlsx");
            wb.write(fout);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fin.close();
                fout.close();
                wb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
