// 2. Write  a program which accept number from user and display its factors in decreasing order.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   void DisplayFactorRev()
   {
       for(int iCnt = iNo/2; iCnt >= 1; iCnt--)
       {
          if(iNo % iCnt == 0)
          {
             System.out.print(iCnt+"  ");
          }
       }
   }
}

class Assignment4_2
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();
 
        Number nobj = new Number(iValue);

        nobj.DisplayFactorRev();
        
    }
}