// 3. Accepts N numbers from user and check wether that numbers comtains 11 in it or not.


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

    boolean check()
    {
        boolean bFlag = false;

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] == 11)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

class Assignment19_3
{
    public static void main(String[] args) 
    {
        int Arr[];
        int iSize = 0;
        boolean bRet = false;

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

        bRet = nobj.check();

        if(bRet == true)
        {
            System.out.println("11 is present");
        }
        else
        {
            System.out.println("11 is not present");
        }
    }
}