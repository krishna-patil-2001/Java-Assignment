/* 
1. Accept number of rows and nummber of columns from user and display below patern. 
 Input:  iRow = 4   iCol = 3  

 Output: *  *  *
         *  *  *
         *  *  *
         *  *  *
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

    void DisplayPattern()
    {
       for(int i = 1; i <= iRow; i++)
       {
          for(int j = 1; j <= iCol; j++)
          {
              System.out.print("*  ");
          }
          System.out.println();
       }
    }
 }

 class Assignment12_1
 {
    public static void main(String[] args) 
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern(iValue1,iValue2);

        pobj.DisplayPattern();
    }
 }