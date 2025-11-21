// 1. Write  a program which accept number from user and display its multiplication of factors.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   int MultiFact()
   {
    int Fact = 1;
      for(int i = 1; i <= iNo/2; i++)
      {
         if(iNo % i == 0)
         {
            Fact = Fact * i;
         }
      }
      
      return Fact;
   }
}

class Assignment4_1
{
    public static void main(String[] args) 
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();
 
        Number nobj = new Number(iValue);
        
        iRet = nobj.MultiFact();

        System.out.println(iRet);
        
    }
}