// 5. Write a program which accept N from user and print first 5 multiples of N.

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
      for(int icnt = 1; icnt <= 5; icnt++)
      {
         System.out.print(iNo * icnt+"  ");
      }
   }
}

class Assignment5_5
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