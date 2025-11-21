// 1. Accepts N numbers from user and return diffrence between sumation of even elements and  sumation of odd elements.

import java.util.Scanner;


class Number
{
    int iLength;
    int Brr[];

    Number(int A[], int B)
    {
        this.Brr = A;
        this.iLength = B;
    }

    int Diffrence()
    {
        int iSumEven = 0;
        int iSumOdd = 0;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iSumEven = iSumEven + Brr[iCnt];
            }
            else
            {
                iSumOdd = iSumOdd + Brr[iCnt];
            }
        }

        return iSumEven - iSumOdd;
    }
}

class Assignment18_1
{
    public static void main(String[] args) 
    {
        int Arr[];
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Element: ");
        iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter Elements: ");
        
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter Elements Are: ");

        for(int iCnt = 0; iCnt < iSize; iCnt++ )
        {
            System.out.println(Arr[iCnt]);
        }

        Number nobj = new Number(Arr, iSize);

       int iRet = nobj.Diffrence();

       System.out.println("Result is: "+iRet);
    }
}