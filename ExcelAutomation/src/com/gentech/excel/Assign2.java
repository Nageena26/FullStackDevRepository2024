package com.gentech.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign2
{
    public static void main(String[] args)
    {
        writeContent();
    }

    private static void writeContent() {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;

        try {
            String[] names = {
                    "Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Pink", "Brown",
                    "Gray", "Black", "White", "Cyan", "Magenta", "Teal", "Maroon", "Olive",
                    "Navy", "Turquoise", "Beige", "Lime"
            };

            // Opening an existing file
            fin = new FileInputStream("C:\\Assignments\\Assign.xlsx");
            wb = new XSSFWorkbook(fin); // Loading the existing wb

            // Creating a new sheet
            sh = wb.createSheet("Colors");

            // Creating a single row at index 9
            row = sh.createRow(9);

            // getting data from the array
            for (int i = 0; i < names.length; i++) {
                cell = row.createCell(i); // Creating a cell in the current row
                cell.setCellValue(names[i]);
            }

            // Writing the changes into the file
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


