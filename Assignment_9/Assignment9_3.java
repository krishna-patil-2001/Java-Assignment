// 3. Write a program which accept number from user and count frequency of 2 in it.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   int CountTwo()
   {
      int iDigit = 0;
       int iCount = 0;

      while(iNo != 0)
      {
         iDigit = iNo % 10;

         if(iDigit == 2)
         {
            iCount++;
         }

         iNo = iNo / 10;
      }

      return iCount;
   }
}

class Assignment9_3
{
    public static void main(String[] args) 
    {
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);
        
        iRet = nobj.CountTwo();

        System.out.println(iRet);

    }
}