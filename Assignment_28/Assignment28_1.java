// 1. Write Application which accept file name from user and open that file in read mode.

// Input : Demo.txt
// Outtput : file opened Succesfuly

import java.util.Scanner;
import java.io.*;

class Assignment28_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fName = sobj .nextLine();

        try
        {
            FileInputStream fobj = new FileInputStream(fName);
            System.out.println("File is open successfully .");
            fobj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error file not found..");
        }
        catch(IOException i)
        {
           System.out.println(i);
        } 
    }
}