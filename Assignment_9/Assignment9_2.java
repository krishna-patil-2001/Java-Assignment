// 2. Write a program which accept number from user and check whether it contains 0 in it or not.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   boolean ChkZero()
   {
      boolean bFlag = false;
      int iDigit = 0;

      while(iNo != 0)
      {
         iDigit = iNo % 10;

         if(iDigit == 0)
         {
            bFlag = true;
         }

         iNo = iNo / 10;
      }

      return bFlag;
   }
}

class Assignment9_2
{
    public static void main(String[] args) 
    {
        boolean bRet = false;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        bRet = nobj.ChkZero();

        if(bRet == true)
        {
            System.out.println("it contains zero");
        }
        else
        {
            System.out.println("there is no zero");
        }
    }
}