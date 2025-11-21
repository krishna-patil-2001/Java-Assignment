// 1. Write a program which checks wether 15th bit is on or off.

import java.util.Scanner;

class Bit
{
    int iNo;
    int iMask;
    int iResult;

    public Bit(int A)
    {
        this.iNo = A;
        this.iMask = 16384;
        this.iResult = 0;
    }

    boolean ChkBit()
    {
       iResult = iNo & iMask;

       if(iResult == 0)
       {
          return false;
       }
       else
       {
         return true;
       }
    }
}
class Assignment30_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Bit bobj = new Bit(iValue);

        boolean bRet = bobj.ChkBit();

        if(bRet == true)
        {
            System.out.println("15th bit is ON");
        }
        else
        {
            System.out.println("15th bit is Off");
        }
    }
}