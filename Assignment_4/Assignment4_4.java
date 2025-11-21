// 4. Write  a program which accept number from user and returns summation of all its non factors.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   int SumNonFact()
   {
      int iSum = 0;

      for(int iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if(iNo % iCnt != 0)
         {
            iSum = iSum + iCnt;
         }
      }

      return iSum;
   }
}

class Assignment4_4
{
    public static void main(String[] args) 
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");

        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        iRet = nobj.SumNonFact();

        System.out.println(iRet);

    }
}