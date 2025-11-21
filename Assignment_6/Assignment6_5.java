// 4. Write a program which accept number from user and display its table in revers order.

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
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
       for(int iCnt = 10; iCnt >= 1; iCnt--)
       {
          System.out.println(iNo * iCnt);
       }
    }
}

class Assignment6_5
{
    public static void main(String[] args)
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter Number: ");
         int iValue = sobj.nextInt();

         Number nobj = new Number(iValue);

         nobj.Display();

    }
}