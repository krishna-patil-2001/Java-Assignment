// 1. Write a program which accept string from user and count number of capital characters.

import java.util.Scanner;

class MyString
{
    String s1;

    MyString(String A)
    {
        this.s1 = A;
    }

    int CountSmall()
    {
        int iCount = 0;

       for(int i = 0; i < s1.length(); i++)
       {
           char ch = s1.charAt(i);

           if(ch >= 'a' && ch <= 'z')
           {
              iCount++;
           }
       }
       return iCount;
    }
}

class Assignment24_2
{
    public static void main(String[] args) 
    {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter String: ");
       String sName = sobj.nextLine();

       MyString mobj = new MyString(sName);

       int iRet = mobj.CountSmall();

       System.out.println("Number of capital letters are : "+iRet);
    }
}