// 2. Accepts N numbers from user and return diffrence between frequency of even number and odd numbers.


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

    int Frequency()
    {
        int EvenCount = 0;
        int OddCount = 0;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                EvenCount++;
            }
            else
            {
                OddCount++;
            }
        }
        return EvenCount - OddCount;
    }
}

class Assignment19_2
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

        int iRet = nobj.Frequency();

        System.out.println("Result is : "+ iRet);
    }
}