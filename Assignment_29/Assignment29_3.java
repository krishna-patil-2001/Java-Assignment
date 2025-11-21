// 3. Write a program wich accepts file name from user and count nnumber of  white spaces  from that file.

// Input : Demo.txt

// Output : Number of white spaces are 13.

import java.io.FileReader;
import java.util.Scanner;

class Assignment29_3
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

            while((ch = fobj.read()) != -1)
            {
               if(ch == ' ')
               {
                  iCount++;
               }
            }
            System.out.println("Numer of white spaces are: "+iCount);

            fobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}