// 3. Write a program which accept string from user and return diffrenc between frequency of small characters and frequency of capital characters.

import java.util.Scanner;

class MyString
{
    String s1;

    MyString(String A)
    {
        this.s1 = A;
    }

    int Diffrence()
    {
        int iSmall = 0;
        int iCapital = 0;

        for(int i = 0; i < s1.length(); i++)
        {
            char ch = s1.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                iSmall++;
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
               iCapital++;
            }
        }

        return iSmall - iCapital;
    }
}

class Assignment24_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        int iRet = mobj.Diffrence();

        System.out.println("Diffrence is: "+iRet);
    }
}