/* 1. Accept number of rows and number of columns from user and display below patern. 
Input: iRow = 4   iCol = 4

Output: 1  2  3  4 
        5  6  7  8
        9  1  2  3 
        4  5  6  7
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
        int no = 1;

       for(int i = 1; i <= iRow; i++)
       {
         for(int j = 1; j <= iCol; j++, no++)
         {
            if(no == 10)
            {
                no = 1;
            }
             System.out.print(no+"  ");
         }
         System.out.println();
       }
    }
}

class Assignment14_1
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no.of rows: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter no.of rows: ");
        int iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern(iValue1, iValue2);

        pobj.Display();
    }
}