/* 
3. Accept number of rows and nummber of columns from user and display below patern. 
 Input:  iRow = 3   iCol = 5 

 Output: A  A  A  A  A
         B  B  B  B  B
         C  C  C  C  C
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
        char ch = 'A';

        for(int i = 1; i <= iRow; i++, ch++)
        {

            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"  ");
            }

            System.out.println();
        }
    }
}

 class Assignment13_3
 {
    public static void main(String[] args) 
    {
          Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no.of rows : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter no.of column : ");
        int iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern(iValue1, iValue2);

        pobj.Display();
    }
 }