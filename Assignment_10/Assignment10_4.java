// 4. Write a program which accept number from user and return multiplication of all digits.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
        this.iNo = A;
    }

    int MultDigits()
    {
        int iDigit = 0;
        int Multi = 1;

        while(iNo != 0)
        {
            iDigit = iNo  % 10;

            if(iDigit == 0)
            {
                iDigit = 1;
            }

            Multi = Multi * iDigit;

            iNo = iNo / 10;
        }

        return Multi;
    }
}
class Assignment10_4
{
    public static void main(String[] args)
    {
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        iRet = nobj.MultDigits();

        System.out.println(iRet);
    }
}