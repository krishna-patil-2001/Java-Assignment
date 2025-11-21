// 3. Accepts N numbers from user and return the diffrence between largest and smallest number.


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

    int Diffrence()
    {
        int iMax = Brr[0];
        int iMin = Brr[0];

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
             if(Brr[iCnt] > iMax)
             {
                iMax  = Brr[iCnt];
             }
             else if(Brr[iCnt] < iMin)
             {
                iMin = Brr[iCnt];
             }
        }

        return iMax - iMin;
    }
}

class Assignment21_3
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

        int iRet = nobj.Diffrence();

        System.out.println("Diffrence is: "+iRet);
    }
}


