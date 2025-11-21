/* 
2. Accept character from user. if character is small display its  corresponding capital character, 
and if  it capital then display its corresponding small.
 in other cases display as it is .
  */

import java.util.Scanner;

class CheckChar
{
    char ch;

    CheckChar(char A)
    {
       this.ch = A;
    }

    void Display()
    {
       if(ch >= 'A' &&  ch <= 'Z')
       {
           ch = (char)(ch + 32);
           System.out.println(ch); 
       }
       else if(ch >= 'a'  &&  ch <= 'z')
       {
            ch = (char)(ch - 32);
           System.out.println(ch);
       }
       else
       {
           System.out.println(ch);
       }
    }
}

  class Assignment23_2
  {
    public static void main(String[] args) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter character: ");
        cValue = sobj.next().charAt(0);

        CheckChar cobj = new CheckChar(cValue);

        cobj.Display();
    }
  }