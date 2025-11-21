// 5. Write a program which returns diffrence between Even factorial and Odd factorial of given number.

import java.util.Scanner;

class Factorial
{
    int iNo;

    Factorial(int A)
    {
       this.iNo = A;
    }

    int FactorialDiff()
    {
        int EvenFact = 1;
        int Oddfact = 1;

       if(iNo < 0)
       {
         iNo = -iNo;
       }

       for(int iCnt = 1; iCnt <= iNo; iCnt++)
       {
          if(iCnt % 2 == 0)
          {
             EvenFact = EvenFact * iCnt;
          }
          else
          {
             Oddfact = Oddfact * iCnt;
          }
       }

       return EvenFact - Oddfact;
    }
}
class Assignment7_5
{
    public static void main(String[] args) 
    {
        int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Number: ");
        int iValue = sobj.nextInt();

        Factorial fobj = new Factorial(iValue);

        iRet = fobj.FactorialDiff();

        System.out.println("Factorial diffrence is : "+ iRet);

    }
}