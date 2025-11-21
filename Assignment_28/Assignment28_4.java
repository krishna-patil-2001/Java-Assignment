// 4. Write Application which accept file name from user and disply size of file.

// Input : Demo.txt
// Output : file size is 56 bytes

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

class Assignment28_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name for open: ");

        String fName = sobj.nextLine();

        try
        {
            File fobj = new File(fName);

            if(fobj.exists())
            {
                System.out.println("File opened Succesfully");
                System.out.println("File size is "+fobj.length()+" bytes");
            }
            else
            {
                System.out.println("File not Found..");
            }
            
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }
}