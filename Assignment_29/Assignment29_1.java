// 1. Write a program wich accepts file name from user and count number of capital characters from that file.

// Input : Demo.txt

// Output : Number of capital characters are 23. 

import java.io.FileReader;
import java.util.Scanner;

class Assignment29_1
{
    public static void main(String[] args) 
    {
        try
        {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fName = sobj.nextLine();

        FileReader fobj = new FileReader(fName);

        int ch = 0;
        int iCount = 0;
  
        while ((ch = fobj.read()) != -1) 
        {
            if(ch >= 'A'  && ch <= 'Z')
            {
               iCount++;
            }
        }
         System.out.println("Number of capital characters are : " + iCount);
        fobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}