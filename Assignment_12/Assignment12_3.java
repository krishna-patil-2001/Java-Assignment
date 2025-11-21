/* 
3. Accept number of rows and nummber of columns from user and display below patern. 
 Input:  iRow = 3   iCol = 5 

 Output: 5  4  3  2  1
         5  4  3  2  1
         5  4  3  2  1
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
        for(int j = iCol; j >= 1; j--)
        {
            System.out.print(j+"  ");
        }
        System.out.println();
       }
    }
 }

 class Assignment12_3
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