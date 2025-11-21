// 5. Write a program which accept files name and one count from user and read that number of characters for starting position.

// Inpput : Demo.txt

// Display first 12 characters from Demo.txt.

import java.io.FileReader;
import java.util.Scanner;

class Assignment29_5
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter file name: ");
            String fName = sobj.nextLine();

            System.out.println("Enter Count number: ");
            int iValue = sobj.nextInt();

            FileReader fobj = new FileReader(fName);

            int ch = 0;
            int iCount = 0;

            while((ch = fobj.read()) != -1  && iValue > iCount)
            {
                System.out.print((char)ch);
                iCount++;
            }
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
}