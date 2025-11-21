// 5. write Application which accept file name from user and one string from user. write that string at the end of file.

// Input : Demo.txt
// Hello Word

// Write hello word at the end of demo.txt file.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

class Assignment28_5
{
    public static void main(String[] args) 
    {
        try
        {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file that you want to open : ");
        String fName = sobj.nextLine();

        System.out.println("Enter the string that you want to write at the end of file : ");
        String data = sobj.nextLine();

        FileOutputStream fobj = new FileOutputStream(fName,true);

        fobj.write(data.getBytes());

        System.out.println("Data Written Succesfully at the end of file");

        fobj.close();
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
