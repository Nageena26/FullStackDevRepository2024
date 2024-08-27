package com.gentech.string;

public class Assign4 
{
 static void comma()
 {
	 String str = "MONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAYSUNDAY";
     String[] days = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
     
     StringBuilder sb = new StringBuilder(str);

     for (String DAY : days)
     {
         int index = sb.indexOf(DAY);
         if (index != -1) 
         {
             sb.insert(index + DAY.length(), ',');
         }
     }

     int endIndex = sb.length();
     sb.delete(endIndex-1,endIndex);
     
     System.out.println(sb);
 }

	public static void main(String[] args) {
		comma();

	}

}

