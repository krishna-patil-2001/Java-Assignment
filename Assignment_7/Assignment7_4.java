// 4. Write a program to find odd factorial of given number.

import java.util.Scanner;

class Factorial
{
   int iNo;

   Factorial(int A)
   {
      this.iNo = A;
   }

   int OddFatorial()
   {
       int iFact = 1;
      for(int iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if((iCnt % 2) != 0)
         {
            iFact = iFact * iCnt;
         }
      }

      return iFact;
   }
}

class Assignment7_4
{
    public static void main(String[] args) 
    {
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Number: ");
        int iValue = sobj.nextInt();

        Factorial fobj = new Factorial(iValue);

        iRet = fobj.OddFatorial();

        System.out.println("Odd factorial of number is: "+iRet);
    }
}