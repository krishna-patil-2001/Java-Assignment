// 5. Accepts N numbers from user and display Sumation of digits of each number.


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

    void DigitSum()
    {
        System.out.println("Sumation of digits of each numbeer is: ");

       for(int iCnt = 0; iCnt < iLength; iCnt++)
       {
          int temp = 0;
          int iSum = 0;

          temp = Brr[iCnt];

          while (temp != 0) 
          {
             iSum = iSum + temp % 10;

             temp = temp / 10;
          }
          System.out.println(iSum);
       }
    }
}

class Assignment21_5
{
    public static void main(String[] args) 
    {
        int Arr[];
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter Number of Element: ");
       iSize = sobj.nextInt();

       Arr = new int[iSize];

       System.out.println("Enter Element: ");

       for(int iCnt = 0; iCnt < iSize; iCnt++)
       {
          Arr[iCnt] = sobj.nextInt();
       }

       Number nobj = new Number(Arr, iSize);

       nobj.DigitSum();
    }
}