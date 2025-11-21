// 4. Accepts N numbers from user and display all such numbers which contains 3 digits in it.


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

    void Digit()
    {

        System.out.println("this number contains 3 digit: ");

        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            int iDigitCount = 0;

            int temp = Brr[iCnt];

            while (temp != 0)
            {
                iDigitCount++;
                temp = temp / 10; 
            } 

            if(iDigitCount == 3)
            {
                System.out.println(Brr[iCnt]);
            }
        }
    }
}

class Assignment21_4
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

        nobj.Digit();
    }
}


