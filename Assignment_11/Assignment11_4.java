/*   4. Accept number from user and display below patern.
    Input : 4
    Output: #  1  *  #  2  *  #  3  *  #  4  *    */

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
                 System.out.print("#  "+iCnt+"  *  ");
             }
        }
    }

   
    class Assignment11_4
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