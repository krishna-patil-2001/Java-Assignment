// 1. Write  a aprogram which accept number from user and display below patern.

 // Input : 3

// Output : *    *    *    #    #    #

import java.util.Scanner;


class Patern
{
    int iNo;

    Patern(int A)
    {
        this.iNo = A;
    }

    void Display()
    {
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*    "+"    ");
        }

         for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#    "+"    ");
        }
    }
}
class Assignment7_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

         System.out.println("Enter Number: ");
         int iValue = sobj.nextInt();

         Patern pobj = new Patern(iValue);

         pobj.Display();

    }
}