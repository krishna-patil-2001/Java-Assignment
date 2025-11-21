// 2. Accepts N numbers from user and Accept one another number as no ,return index of last occurence of that no.


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

    int LastOcc()
    {
        int iIndex = 0;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] == iNum)
            {
                iIndex = iCnt;

                return iCnt;
            }
        }
          return -1;
    }
}

class Assignment20_3
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

        int iRet = nobj.LastOcc();

        if(iRet == -1)
        {
            System.out.println("there is no such a number");
        }
        else
        {
           System.out.println("last Occurence index of "+iValue+" is: "+iRet);
        }
    }
}