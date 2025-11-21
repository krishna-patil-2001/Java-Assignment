// 2. Write Application which accept file name from user and create that file.

// Input : Demo.txt
// Output : file create Succesfuly

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Assignment28_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file that you want to careate : ");
        String fName = sobj.nextLine();

        try
        {
            File fobj = new File(fName);

            if(fobj.createNewFile())
            {
                System.out.println("File created succesfuly : "+fobj.getName());
            }
            else
            {
                System.out.println("File allready exist..");
            }

        }
        catch(IOException e)
        {
           System.out.println(e);
        }
    }
}