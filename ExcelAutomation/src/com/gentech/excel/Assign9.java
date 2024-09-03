package com.gentech.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assign9 {
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

            original = wb.getSheet("Country");
            copied = wb.createSheet("CopyFromCountry2");


            String[] cellValues = new String[22];
            int cellIndex = 0;


            for (int r = 0; r < 11; r++)
            {
                row = original.getRow(r);
                if (row != null) {
                    for (int c = 0; c < 2; c++) {
                        cell = row.getCell(c);
                        if (cell != null) {
                            if (cell.getCellType() == CellType.STRING) {
                                cellValues[cellIndex++] = cell.getStringCellValue();
                            } else if (cell.getCellType() == CellType.NUMERIC) {
                                cellValues[cellIndex++] = String.valueOf(cell.getNumericCellValue());
                            }
                        } else {
                            cellValues[cellIndex++] = "";
                        }
                    }
                }
            }

            // Write the cell values
            for (int i = 0; i < 2; i++) {
                Row newRow = copied.createRow(i);
                for (int j = 0; j < 11; j++) {
                    Cell newCell = newRow.createCell(j);
                    int index = i * 11 + j;
                    if (index < cellValues.length) {
                        newCell.setCellValue(cellValues[index] != null ? cellValues[index] : "");
                    }
                }
            }

            fout = new FileOutputStream("C:\\Assignments\\Assign.xlsx");
            wb.write(fout);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) fin.close();
                if (fout != null) fout.close();
                if (wb != null) wb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
