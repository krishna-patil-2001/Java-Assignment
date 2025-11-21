// 5. Accepts N numbers from user and accept one another number as no , return frequency of no from it.


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

    int Frequency()
    {
        int iCount = 0;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] == iNum)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class Assignment19_5
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

        int iRet = nobj.Frequency();

        System.out.println("Number of Count "+iValue+" is: "+iRet);
    }
}