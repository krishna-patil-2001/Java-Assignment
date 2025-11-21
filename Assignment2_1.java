// 1. Accept one number from user and print that number of * on screen.

import java.util.Scanner;

class Print
{
   int no;

   Print(int A)
   {
       this.no = A;
   }

   void Display()
   {
      int i = 1;

      while(i <= no)
      {
         System.out.print("* ");
         i++;
      }
   }
}

class Assignment2_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Print pobj = new Print(iValue);

        pobj.Display();
    }
}