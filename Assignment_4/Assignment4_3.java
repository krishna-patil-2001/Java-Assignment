// 3. Write  a program which accept number from user and display all its non factor.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
       this.iNo = A;
    }

   void NonFact()
    {
       for(int iCnt = 1; iCnt <= iNo/2; iCnt++)
       {
          if(iNo % iCnt != 0)
          {
             System.out.print(iCnt+"  ");
          }
       }
    }
}

class Assignment4_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");

        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.NonFact();
    }
}