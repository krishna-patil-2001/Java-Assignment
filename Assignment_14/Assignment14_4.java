/* 4. Accept number of rows and number of columns from user and display below patern. 
Input: iRow = 5   iCol = 5

Output:  1    2    3    4    5
        -1   -2   -3   -4   -5
         1    2    3    4    5
        -1   -2   -3   -4   -5
         1    2    3    4    5
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
            if(i % 2 == 0)
            {
                System.out.print(-j+"  ");
            }
            else
            {
                System.out.print(j+"  ");
            }
         }
         System.out.println();
       }
    }
}

class Assignment14_4
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