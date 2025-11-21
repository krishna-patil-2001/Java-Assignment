/*   1. Accept number from user and display below patern.
    Input : 5
    Output: A  B  C  D  E   */

import java.util.Scanner;

class Patern
    {
        int iNo;

        Patern(int A)
        {
            this.iNo = A;
        }

       void DisplayPatern()
        {
            char ch = 'A';

           for(int icnt = 1; icnt <= iNo; icnt++, ch++)
           {
              System.out.print(ch+"  ");
           }
        }
    }

    class Assignment11_1
    {
        public static void main(String[] args) 
        {
           Scanner sobj = new Scanner(System.in);

            System.out.println("Enter Number: ");
            int iValue = sobj.nextInt();

            Patern pobj = new Patern(iValue);

            pobj.DisplayPatern();

        }
    }