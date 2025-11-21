// 4. write a program which accept file name and one character from user and count number of occurancess of that character from that file.

// Input : Demo.txt

// frequency of M is seven.

import java.io.FileReader;
import java.util.Scanner;

class Assignment29_4
{
    public static void main(String[] args) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
            

            System.out.println("Enter file name: ");
            String fName = sobj.nextLine();

            System.out.println("Enter one character: ");
            char CH = sobj.next().charAt(0);

            FileReader fobj = new FileReader(fName);

            int ch = 0;
            int iCount = 0;

            while((ch = fobj.read()) != -1)
            {
                if(ch == CH)
                {
                   iCount++;
                }
            }
            System.out.println("Frequency of "+CH+" is: "+iCount);
            fobj.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}