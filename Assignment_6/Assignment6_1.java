/* 1.Write a program which accept number from user and if number is less than 50 then print small , 
if it is grater than 50 and less than 100 then print medium , if it is grater than 100 then print large  */

import java.util.Scanner;

class Number
{
   int iNo;

   Number(int A)
   {
      this.iNo = A;
   }

   void Print()
   {
      if(iNo < 50)
      {
        System.out.println("Small");
      }
      else if(iNo > 50 && iNo < 100)
      {
          System.out.println("Medium");
      }
     else
     {
        System.out.println("Large");
     }
   }
}

class Assignment6_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.Print();
    }
}