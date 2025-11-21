// 3. Write a program which accept number from user and print its number line.

import java.util.Scanner;

class Number
{
    int iNo;

    Number(int A)
    {
      this.iNo = A;
    }

    void Print()
    {
        for(int iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+"  ");
        }
    }
}

class Assignment5_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.Print();

    }
}