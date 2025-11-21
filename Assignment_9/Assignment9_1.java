// 1. Write a program which accept number from user and display its digit in reverse order.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
        this.iNo = A;
    }

    void DisplayRev()
    {
        int iDigit;

       while(iNo != 0)
       {
          iDigit = iNo % 10;

          System.out.print(iDigit);

         iNo = iNo / 10;
       }
    }
}

class Assignment9_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.DisplayRev();
    }
}
