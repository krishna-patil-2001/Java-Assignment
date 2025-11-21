// 4. Accepts N numbers from user and Accept range , disply all elements from that range


import java.util.Scanner;

class Number
{
    int Brr[];
    int iLength;
    int iStart;
    int iEnd;

    Number(int A[], int B, int C, int D)
    {
        this.Brr = A;
        this.iLength = B;
        this.iStart = C;
        this.iEnd = D;

    }

    void Range()
    {
        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
           if(Brr[iCnt] >= iStart && Brr[iCnt] <= iEnd)
           {
              System.out.println(Brr[iCnt]);
           }
        }    
    }
}

class Assignment20_4
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

        System.out.println("Enter the starting point : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the Ending point : ");
        int iValue2 = sobj.nextInt();

        Number nobj = new Number(Arr, iSize, iValue1, iValue2);

        nobj.Range();

    }
}