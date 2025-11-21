/* 1. Accept number of rows and number of columns from user and display below patern. 
Input: iRow = 4  iCol = 4

Output: *
        *  *
        *  *  *
        *  *  *  *
*/

import java.util.Scanner;

class Pattern
{
    int iRow;
    int iCol;

    Pattern(int A, int B)
    {
        this.iRow = A;
        this.iCol = B;
    }

    void Display()
    {
        for(int i = 1; i <= iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                if(i >= j)
                {
                    System.out.print("*  ");
                }
                else
                {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}

class Assignment16_1
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no.of rows: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter no.of column: ");
        int iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern(iValue1, iValue2);

        pobj.Display();
    }
}