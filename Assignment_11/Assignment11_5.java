/*   5. Accept number from user and display below patern.
    Input : 8
    Output: 2  4  6  8  10  12  14  16  */

import java.util.Scanner;

class Pattern
    {
        int iNo;

        Pattern(int A)
        {
            this.iNo = A;
        }

        void DisplayPattern()
        {
           for(int iCnt = 1; iCnt <= iNo; iCnt++)
           {
              System.out.print(iCnt * 2+"  ");
           }
        }
    }
    class Assignment11_5
    {
        public static void main(String[] args) 
        {
              Scanner sobj = new Scanner(System.in);

              System.out.println("Enter Number: ");
              int iValue = sobj.nextInt();

              Pattern pobj = new Pattern(iValue);

              pobj.DisplayPattern();
        }
    }