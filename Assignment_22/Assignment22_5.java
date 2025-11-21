/* 
5. Accept Division of student from user and depends on the division display exam timing .
there are 4 division in school as A,B,C,D. exam of division  A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.asm
(Application should be case insensitive)

*/ 

import java.util.Scanner;

class Division
{
    char ch;

    Division(char A)
    {
        this.ch = A;
    }

    void DisplaySchedule()
    {
       if(ch >='a' && ch <= 'z')
       {
         ch = (char)(ch - 32);
       }

       switch(ch)
       {
          case 'A':
               System.out.println("your exam is at 7 AM");
               break;

         case 'B': 
               System.out.println("your exam is at 8.30 AM");
               break;

          case 'C': 
               System.out.println("your exam is at 9.20 AM");
               break;

          case 'D': 
               System.out.println("your exam is at 10.30 AM");
               break;

          default:
               System.out.println("Invalid Division...");
               break;
       }
   }
}


class Assignment22_5
{
    public static void main(String[] args) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter character: ");
        cValue = sobj.next().charAt(0);

        Division dobj = new Division(cValue);

        dobj.DisplaySchedule();

    }
}

