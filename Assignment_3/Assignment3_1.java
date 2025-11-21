// 1. write a program which accept one number from user and print that number of even number on screen.

import java.util.Scanner;

class Number
{
   int no;

   Number(int A)
   {
     this.no = A;
   }

   void PrintEven()
   {
      for(int i = 1; i <= no; i++)
      {
         System.out.print(i*2+"  ");
      }
   }
}
class Assignment3_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(4);

        nobj.PrintEven();
    }
}