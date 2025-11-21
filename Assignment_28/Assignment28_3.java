// 3. Write Application which accept file name and read all data from that file and display contents on screen.

// Input : Demo.txt
// Output : Display all data of  files.

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Assignment28_3
{
   public static void main(String[] args) 
   {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the name of file that you want to open :");

      String fName = sobj.nextLine();

      try
      {
         FileReader fobj = new FileReader(fName);
         System.out.println("File is open Successfuly");

         int ch = 0;

         System.out.println("File contents are: ");

         while((ch = fobj.read()) != -1)
         {
            System.out.print((char)ch);
         }
         fobj.close();
      }
      catch(IOException e)
      {
         System.out.println("Error file not found..");
      }
   }
}