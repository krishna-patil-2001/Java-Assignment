// 2. Accepts N numbers from user and return the smallest number.


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

    int Minimum()
    {
        int iMin = Brr[0];

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
             if(Brr[iCnt] < iMin)
             {
                iMin  = Brr[iCnt];
             }
        }

        return iMin;
    }
}

class Assignment21_2
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

        int iRet = nobj.Minimum();

        System.out.println("Smallest number is: "+iRet);
    }
}

