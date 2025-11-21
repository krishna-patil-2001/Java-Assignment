// 5. Write  a program which accept number from user and returns diffrence between summation of all factors and non factors.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   int DiffFactNonFact()
   {
       int iSumFact = 0;
       int iSumumNonFact = 0;

      for(int iCnt = 1; iCnt < iNo; iCnt++)
      {
         if(iNo % iCnt == 0)
         {
            iSumFact = iSumFact + iCnt;
         }
         else
         {
            iSumumNonFact = iSumumNonFact + iCnt;
         }
      }

      return iSumFact - iSumumNonFact;
   }
}

class Assignment4_5
{
    public static void main(String[] args) 
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        iRet = nobj.DiffFactNonFact();

        System.out.println(iRet);
    }
}