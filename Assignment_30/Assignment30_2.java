// 2. Write a program which checks wether 5th and 18th bit is on or off.

import java.util.Scanner;

class Bit
{
    int iNo;
    int iMask1;
    int iMask2;
    int iResult1;
    int iResult2;

    public Bit(int A)
    {
        this.iNo = A;
        this.iMask1 = 16;
        this.iMask2 = 131072;
        this.iResult1 = 0;
        this.iResult2 = 0;
    }

    void ChkBit()
    {
        iResult1 = iNo & iMask1;

        if(iResult1 == 0)
        {
            System.out.println("5th bit is off");
        }
        else
        {
            System.out.println("5th bit is on");
        }

        iResult2 = iNo & iMask2;

        if(iResult2 == 0)
        {
            System.out.println("18th bit is off");
        }
        else
        {
            System.out.println("18th bit is on");
        }
    }
}

class Assignment30_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Bit bobj = new Bit(iValue);

        bobj.ChkBit();
    }
}