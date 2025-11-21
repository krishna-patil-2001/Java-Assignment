// 1. Write a program which accept string from user and copy the contents of that string into another string. (implement strcpy() function)

import java.util.Scanner;

class MyString
{
    String s1;
    String s2;

    MyString(String A, String B)
    {
        this.s1 = A;
        this.s2 = B;
    }

    void strCpy()
    {
        char temp[] = new char[s1.length()];

       for(int i = 0; i < s1.length(); i++)
       {
          temp[i] = s1.charAt(i);
       }
       s2 = new String(temp);

       System.out.println("Copied string are : "+s2);
    }
}

class Assignment27_1
{
    public static void main(String[] args) 
    {
        String sName2 = " ";

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sName1 = sobj.nextLine();

        MyString mobj = new MyString(sName1, sName2);

        mobj.strCpy();

        
    }
}