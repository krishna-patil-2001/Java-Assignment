// 4.Accept two numbers from user and display first number in second number of times.

import java.util.Scanner;

class Number
{
    int no1, no2;

    Number(int A, int B)
    {
       this.no1 = A;
       this.no2 = B;
    }

    void Display()
    {
        for(int i = 1; i <= no2; i++)
        {
            System.out.print(no1+" ");
        }
    }
}

class Assignment2_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second Number: ");
        int iValue2 = sobj.nextInt();

        Number nobj = new Number(iValue1, iValue2);

        nobj.Display();
    }
}