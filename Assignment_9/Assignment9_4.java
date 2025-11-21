// 4. Write a program which accept number from user and count frequency of 4 in it.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   int CountFour()
   {
      int iCount = 0;
      int iDigit = 0;

      while(iNo != 0)
      {
         iDigit = iNo % 10;

         if(iDigit == 4)
         {
            iCount++;
         }

         iNo = iNo / 10;
      }

      return iCount;
   }
}

class Assignment9_4
{
    public static void main(String[] args) 
    {
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);
        
        iRet = nobj.CountFour();

        System.out.println(iRet);
    }
}