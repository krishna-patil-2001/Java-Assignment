// 5. Write a program which accept string from user and count number of white spaces.

import java.util.Scanner;

class MyString
{
    String s1;

    MyString(String A)
    {
       this.s1 = A;
    }

    int CountWhite()
    {
        int iCount = 0;

       for(int i = 0; i < s1.length(); i++)
       {
          char ch = s1.charAt(i);

          if(ch == ' ')
          {
             iCount++;
          }
       }
       return  iCount;
    } 
}

class Assignment25_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        int iRet = mobj.CountWhite();

        System.out.println("White spaces are: "+iRet);
    }
}