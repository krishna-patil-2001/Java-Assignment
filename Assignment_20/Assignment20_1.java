// 1. Accepts N numbers from user and Accept one another number as no ,check wether  no is present or not.


import java.util.Scanner;

class Number
{
    int Brr[];
    int iLength;
    int iNum;

    Number(int A[], int B, int C)
    {
        this.Brr = A;
        this.iLength = B;
        this.iNum = C;
    }

    boolean check()
    {
        boolean bFlag = false;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] == iNum)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

class Assignment20_1
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

        System.out.println("Enter the Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(Arr, iSize, iValue);

        boolean bRet = nobj.check();

        if(bRet == true)
        {
            System.out.println(iValue+" is present");
        }
        else
        {
            System.out.println(iValue+" is not present");
        }
    }
}