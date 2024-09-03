package com.gentech.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign3
{
    public static void main(String[] args)
    {
        writeContent();
    }

    private static void writeContent()
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;

        try
        {
            String[] names = {
                    "New York", "Los Angeles", "Chicago", "Houston", "Phoenix",
                    "Philadelphia", "San Antonio", "San Diego", "Dallas", "San Jose"
            };

            fin = new FileInputStream("C:\\Assignments\\Assign.xlsx");
            wb = new XSSFWorkbook(fin);

            sh = wb.createSheet("Diagonal");

            for (int r = 0; r < names.length; r++)
            {
                row = sh.createRow(r);
                cell = row.createCell(r);
                cell.setCellValue(names[r]);
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
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
