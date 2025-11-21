// 5. Accept on character from user and checkwhether that character is vowle(a,e,i,o,u) or not .

import java.util.Scanner;

class Character
{
    char ch;

    Character(char C)
    {
       this.ch = C;
    }

    boolean CheckVowelorNot()
    {
        boolean bFlag = false;

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
           bFlag =true;
        }
        
        return bFlag;
    }
}
class Assignment3_5
{
    public static void main(String[] args) 
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter one character : ");
        char cValue = sobj.next().charAt(0);

        Character cobj = new Character(cValue);

        bRet = cobj.CheckVowelorNot();

        if(bRet == true)
        {
            System.out.println("it is vowel");
        }
        else
        {
            System.out.println("it is not vowel");
        }
    }
}