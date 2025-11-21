 // 5. Write a program which accept number from user and return diffrence between summation of even digits and summation of odd digits.

import java.util.Scanner;

class Digit 
 {
    int iNo;

    Digit(int A)
    {
        this.iNo = A;
    }

    int CountDiff()
    {
        int iSumEvenDigit = 0;
        int iSumOddDigit = 0;
        int iDigit = 0;

        while (iNo != 0) 
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
               iSumEvenDigit = iSumEvenDigit + iDigit;
            }
            else
            {
                iSumOddDigit = iSumOddDigit + iDigit;
            }

            iNo = iNo / 10;
        }

        return iSumEvenDigit - iSumOddDigit;
    }
 }
 class Assignment10_5
 {
    public static void main(String[] args) 
    {
          int iRet = 0;

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit(iValue);

        iRet = dobj.CountDiff();

        System.out.println(iRet);
    }
 }