// 2. Write a program which accept number from user and print number till that number. 

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
      for(int iCnt = 1; iCnt <= iNo; iCnt++)
      {
         System.out.print(iCnt+"  ");
      }
   }
}

class Assignment5_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Numer: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.Print();
    }
}