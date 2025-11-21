/*   2. Accept number from user and display below patern.
    Input : 5
    Output: 5  #  4  #  3  #  2  #   1  #  */

import java.util.Scanner;

class Pattern
    {
        int iNo;

        Pattern(int A)
        {
            this.iNo = A;
        }

        void PatternDisplay()
        {
            for(int iCnt = iNo; iCnt >= 1; iCnt--)
            {
                System.out.print(iCnt+"  "+"#  ");
            }
        }
    }

    class Assignment11_2
    {
        public static void main(String[] args) 
        {
              Scanner sobj = new Scanner(System.in);

              System.out.println("Enter Number: ");
              int iValue = sobj.nextInt();

              Pattern pobj = new Pattern(iValue);

              pobj.PatternDisplay();
        }
    }