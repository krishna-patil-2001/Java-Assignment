// 1. Write a program which accept string from user and accept one character . check wether that character is present in string or not.

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

    boolean ChkChar()
    {
        boolean bFlag = false;

       for(int i = 0; i < s1.length(); i++)
       {
          char CH = s1.charAt(i);

          if(CH == ch)
          {
             bFlag = true;
             break;
          }
       }
       return bFlag;
    }
}

class Assignment26_1
{
    public static void main(String[] args) 
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sName = sobj.nextLine();

        System.out.println("Enter character: ");
        char cValue = sobj.nextLine().charAt(0);

        MyString mobj = new MyString(sName,cValue);

        bRet = mobj.ChkChar();

        if(bRet == true)
        {
            System.out.println(cValue+" is present in String");
        }
        else
        {
            System.out.println(cValue+" is not present in String");
        }
    }
}