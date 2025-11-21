/* 3. Accept character from user. if it is capital then display all the character from the input character till Z.
 if input character is  small then print all the characters in reverse order till a.in other cases return directly. */

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
       if(ch >= 'A' && ch <= 'Z')
       {
          while(ch <= 'Z')
          {
             System.out.print(ch+"  ");
             ch++;
          }
       }
       else if(ch >= 'a' && ch <= 'z')
       {
          while (ch >= 'a') 
          {
             System.out.print(ch+"  ");
             ch--;
          }
       }
       else
       {
            System.out.println(ch);
       }
    }
 }

 class Assignment23_3
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