// 5. Write a program which accept number from user and count frequency of such a digits which are less than 6.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
        this.iNo = A;
    }

    int CountFrequency()
    {
        int iCount = 0;
        int iDigit = 0;

        while (iNo != 0)
        {
            iDigit = iNo / 10;

            if(iDigit < 6)
            {
                iCount++;
            }

            iNo = iNo / 10;
        }

        return iCount;
    }
}
public class Assignment9_5 
{
    public static void main(String[] args) 
    {
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        iRet = nobj.CountFrequency();

        System.out.println(iRet);
    }
}