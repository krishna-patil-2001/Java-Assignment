// 4. Write a program which accept number from user and display its table.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
        this.iNo = A;
    }

    void Display()
    {
       for(int iCnt = 1; iCnt <= 10; iCnt++)
       {
          System.out.println(iNo * iCnt);
       }
    }
}
class Assignment6_4
{
    public static void main(String[] args) 
    {
          int iRet = 0;

         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter Number: ");
         int iValue = sobj.nextInt();

         Number nobj = new Number(iValue);

         nobj.Display();

    }
}