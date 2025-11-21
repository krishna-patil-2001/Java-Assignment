/* 
2. Accept number of rows and nummber of columns from user and display below patern. 
 Input:  iRow = 4   iCol = 4 

 Output: A  B  C  D
         a  b  c  d
         A  B  C  D
         a  b  c  d
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

        char ch1 = 'A';
        char ch2 = 'a';

        for(int j = 1; j <= iCol; j++, ch1++ ,ch2++)
        {
            if(i % 2 == 0)
            {
               System.out.print(ch2+"  ");
            }  
            else
            {
               System.out.print(ch1+"  ");
            }
        }

        System.out.println();
       }
    }
}

 class Assignment13_2
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