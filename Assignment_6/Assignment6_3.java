// 3. Write a program to find factorial of given number.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
        this.iNo = A;
    }

    int Factorial()
    {
        int iFact = 1;

       if(iNo < 0)
       {
         iNo = -iNo;
       }

       for(int iCnt = 1; iCnt <= iNo; iCnt++)
       {
          iFact = iFact * iCnt;
       }

       return iFact;
    }
}
class Assignment6_3
{
    public static void main(String[] args) 
    {
          int iRet = 0;

          Scanner sobj = new Scanner(System.in);

         System.out.println("Enter Number: ");
         int iValue = sobj.nextInt();

         Number nobj = new Number(iValue);

         iRet = nobj.Factorial();

         System.out.println(iRet);

         
    }
}