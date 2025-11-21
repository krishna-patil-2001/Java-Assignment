// 3. Write a program to find even factorial of given number.

import java.util.Scanner;

class Factorial
{
    int iNo;

    Factorial(int A)
    {
        this.iNo = A;
    }

    int EvenFactorial()
    {
        int iFact = 1;

       if(iNo < 0)
       {
         iNo = -iNo;
       }

       for(int iCnt = 1; iCnt <= iNo; iCnt++)
       {
          if(iCnt % 2 == 0)
          {
            iFact = iFact * iCnt;
          }
       }

       return iFact;
    }
}
class Assignment7_3
{
    public static void main(String[] args) 
    {
        int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Number: ");
        int iValue = sobj.nextInt();

        Factorial fobj = new Factorial(iValue);

        iRet = fobj.EvenFactorial();

        System.out.println("Even factorial of number is: "+iRet);

    }
}