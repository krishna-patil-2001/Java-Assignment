// 4. Accept character from user and  check wether it is special symbol or not(!,@,#,$,%,^,&,*).

import java.util.Scanner;

class CheckChar
{
    char ch;

    CheckChar(char A)
    {
        this.ch = A;
    }

    boolean ChkSpecial()
    {
       if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' ||  ch == '*')
       {
          return true;
       }
       else
       {
          return false;
       }
    }
}

class Assignment23_4
{
    public static void main(String[] args) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter character: ");
        cValue = sobj.next().charAt(0);

        CheckChar cobj = new CheckChar(cValue);

        boolean bRet = cobj.ChkSpecial();

        if(bRet == true)
        {
            System.out.println("it is special symbol");
        }
        else
        {
            System.out.println("it is not special symbol");
        }
    }
}