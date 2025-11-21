// 2. Write a program which accept string from user and accept one character . return frequency of that character.

import java.util.Scanner;

class MyString
{
    String s1;
    char ch;

    MyString(String A, char B)
    {
       this.s1 = A;
       this.ch = B;
    }

    int CountChar()
    {
        int iCount = 0;

       for(int i = 0; i < s1.length(); i++)
       {
          char CH = s1.charAt(i);

          if(CH == ch)
          {
             iCount++;
          }
       }
       return iCount;
    }
}

class Assignment26_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sName = sobj.nextLine();

        System.out.println("Enter character: ");
        char cValue = sobj.nextLine().charAt(0);

        MyString mobj = new MyString(sName, cValue);

        int iRet = mobj.CountChar();

        System.out.println("character frequency is: "+iRet);
    }
}