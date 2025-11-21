// 3. write a program which accepts number from user and print even factors of that number.

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   void DisplayEvenFactor()
   {
      for(int i = 1; i <= iNo/2; i++)
      {
         if((iNo % i == 0) && (i % 2 == 0))
         {
            System.out.print(i+"  ");
         }
      }
   }
}

class Assignment3_3
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(12);

        nobj.DisplayEvenFactor();
    }
}