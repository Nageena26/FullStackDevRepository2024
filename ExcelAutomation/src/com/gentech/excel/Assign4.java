package com.gentech.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assign4
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
                    "Flowers", " ", "Rose", "Tulip", "Lily", "Orchid", "Daisy", "Sunflower",
                    "Iris", "Jasmine", "Marigold", "Peony", "Carnation", "Dahlia", "Lotus",
                    "Lavender", "Poppy", "Aster", "Geranium", "Zinnia", "Hibiscus", "Begonia",
                    "Colors", " ", "Red", "Blue", "Green", "Yellow", "Purple", "Orange",
                    "Pink", "Brown", "Gray", "Black", "White", "Cyan", "Magenta", "Teal",
                    "Maroon", "Olive", "Navy", "Turquoise"
            };

            fin = new FileInputStream("C:\\Assignments\\Assign.xlsx");
            wb = new XSSFWorkbook(fin);

            sh = wb.createSheet("FlowersAndColors");

            for (int i = 0; i < names.length; i++)
            {
                row = sh.createRow(i);
                cell = row.createCell(1);
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
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
