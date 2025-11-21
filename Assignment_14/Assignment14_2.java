/* 2. Accept number of rows and number of columns from user and display below patern. 
Input: iRow = 4   iCol = 5

Output: 2  4  6  8  10
        1  3  5  7  9
        2  4  6  8  10
        1  3  5  7  9
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
             int n1 = 1;
             int n2 = 2;

         for(int j = 1; j <= iCol; j++, n1+=2, n2+=2)
         {
             if(i % 2 == 0)
             {
                System.out.print(n1+"  ");
             }
             else
             {
                System.out.print(n2+"  ");
             }
         }

         System.out.println();

       }
    }
}

class Assignment14_2
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