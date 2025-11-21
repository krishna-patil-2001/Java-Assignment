// 5. Accepts N numbers from user and return product of all odd elements.

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

    int Product()
    {
        int iProduct = 1;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
             if(Brr[iCnt] % 2 != 0)
             {
                iProduct  = iProduct * Brr[iCnt];
             }
        }

        return iProduct;
    }
}

class Assignment20_5
{
    public static void main(String[] args) 
    {
        int Arr[];
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements: ");
        iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter Elements: ");

        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        Number nobj = new Number(Arr, iSize);

        int iRet = nobj.Product();

        System.out.println("product of all odd elements is: "+iRet);
    }
}