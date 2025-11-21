// 1. Accept character from user and check wether it is alphabet or not (A-Z a-z).

import java.util.Scanner;

class CharCheck
{
    char ch;

    CharCheck(char A)
    {
        this.ch = A;
    }

    boolean ChkAlpha()
    {
        boolean bFlag = false;

        if((ch >= 'A' && ch <= 'Z')  || (ch >= 'a' && ch <= 'z' ))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class Assignment22_1
{
    public static void main(String[] args) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter character: ");
        cValue = sobj.next().charAt(0);

        CharCheck cobj = new CharCheck(cValue);

        boolean bRet = cobj.ChkAlpha();

        if(bRet == true)
        {
            System.out.println(cValue+" is a character");
        }
        else
        {
            System.out.println(cValue+" is not character");
        }
    }
}