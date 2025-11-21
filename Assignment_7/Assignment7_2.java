// Accept amount in US dollar and return its correspoinding value in indian currency. consider 1$ as 70 rupees.

import java.util.Scanner;

class CurrencyConversion
{
   int iNo;

   CurrencyConversion(int A)
   {
      this.iNo = A;
   }

   int DollarToINR()
   {
       return iNo * 70;
   }
}

class Assignment7_2
{
    public static void main(String[] args) 
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of USD: ");
        int iValue = sobj.nextInt();

        CurrencyConversion obj = new CurrencyConversion(iValue);

       iRet = obj.DollarToINR();

       System.out.println(iRet);
    }
}