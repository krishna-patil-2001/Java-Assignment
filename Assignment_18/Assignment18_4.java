// 4. Accepts N numbers from user and display all such elements which are  divisible by 3 and 5.


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
        System.out.println("divisible by 3 and 5 elements are: ");
        
        for(int iCnt = 0; iCnt < iLength; iCnt++)
        {
            if(Brr[iCnt] % 3 == 0  &&  Brr[iCnt] % 5 == 0)
            {
                System.out.println(Brr[iCnt]);
            } 
       }
    }
}

class Assignment18_4
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