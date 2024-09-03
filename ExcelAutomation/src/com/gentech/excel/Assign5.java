package com.gentech.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assign5
{
    public static void main(String[] args)
    {
        writeContent();
    }

    private static void writeContent()
    {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;
        FileInputStream fin = null;

        try
        {

            String[] names = {"Lily", "John", "Alice", "Mark", "Sophia", "James", "Emma", "Lucas", "Olivia", "Noah"};


            fin = new FileInputStream("C:\\Assignments\\Assign.xlsx");
            wb = new XSSFWorkbook(fin);
            sh = wb.createSheet("PersonName");


            for (int i = 0; i < names.length; i++) {
                row = sh.createRow(i);
                cell = row.createCell(9);
                cell.setCellValue(names[i]);
            }


            fout = new FileOutputStream("C:\\Assignments\\Assign.xlsx");
            wb.write(fout);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                fout.close();
                wb.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
