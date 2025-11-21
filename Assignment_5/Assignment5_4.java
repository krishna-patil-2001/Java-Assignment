// 4. Write a program which accept N from user and print all odd numbers up to N.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
     this.iNo = A; 
   }

   void Print()
   {
      for(int iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if(iCnt % 2 != 0)
         {
             System.out.print(iCnt+"  ");
         }
      }
   }
}

class Assignment5_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.Print();

    }
}