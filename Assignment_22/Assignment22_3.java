// 3. Accept character from user and check wether it is digit or not (0 - 9).


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

        if(ch >= 48  && ch <= 57)
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class Assignment22_3
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
            System.out.println(cValue+" is a  digit");
        }
        else
        {
            System.out.println(cValue+" is not digit");
        }
    }
}