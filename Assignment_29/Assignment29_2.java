// 2. Write a program wich accepts file name from user and count number of small characters from that file.

// Input : Demo.txt

// Output : Number of small characters are 23. 

import java.io.FileReader;
import java.util.Scanner;

class Assignment29_2
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
                if(ch >= 'a' && ch <= 'z')
                {
                    iCount++;
                }
            }
            fobj.close();
            System.out.println("Number of Small character are: "+iCount);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}