// 3. Write a program which accept number from user and return the count of  digits in between 3 and 7.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
        this.iNo = A;
    }

    int CountRange()
    {
        int iCount = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit > 3 && iDigit < 7)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}
class Assignment10_3
{
    public static void main(String[] args) 
    {
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        iRet = nobj.CountRange();

        System.out.println(iRet);
    }
}