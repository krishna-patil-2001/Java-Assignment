// 1. Accepts N numbers from user and return frequency of even numbers.

import java.util.Scanner;

class Number
{
    int Brr[];
    int iLength;

    Number(int A[], int B)
    {
        this.Brr = A;
        this.iLength = B;
    }

    int CountEven()
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Assignment19_1
{
    public static void main(String[] args) 
    {
        int Arr[];
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements: ");
        iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter Elements: ");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Your Enter elements are: ");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        Number nobj = new Number(Arr, iSize);

        int iRet = nobj.CountEven();

        System.out.println("Even number Count is : "+ iRet);
    }
}