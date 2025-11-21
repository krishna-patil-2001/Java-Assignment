// 5. Accepts N numbers from user and display all such elements which are  multiples of 11.


import java.util.Scanner;


class Number
{
    int iLength;
    int Brr[];

    Number(int A[], int B)
    {
        this.Brr = A;
        this.iLength = B;
    }

    void Display()
    {
        System.out.println("multiples of 11 elements are: ");
        
        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] % 11 == 0)
            {
                System.out.println(Brr[iCnt]);
            } 
       }
    }
}

class Assignment18_5
{
    public static void main(String[] args) 
    {
        int Arr[];
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Element: ");
        iSize = sobj.nextInt();

        Arr = new int[iSize];

        System.out.println("Enter Elements: ");
        
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter Elements Are: ");

        for(int iCnt = 0; iCnt < iSize; iCnt++ )
        {
            System.out.println(Arr[iCnt]);
        }

        Number nobj = new Number(Arr, iSize);

       nobj.Display();
    }
}