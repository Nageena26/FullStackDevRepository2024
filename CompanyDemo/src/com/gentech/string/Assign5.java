package com.gentech.string;

public class Assign5 
{
    static void removeDay() 
    {
    	  String str = "MONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAYSUNDAY";
          String remove = "DAY";

          // Create a StringBuilder from the initial string
          StringBuilder sb = new StringBuilder(str);

          int index = sb.indexOf(remove); // Find the first occurrence of "DAY"

          while (index != -1) 
          {
             
              sb.delete(index, index + remove.length());
              
              index = sb.indexOf(remove);
          }

        
          System.out.println(sb.toString());
    }
     
    public static void main(String[] args) {
        removeDay();
    }
}


