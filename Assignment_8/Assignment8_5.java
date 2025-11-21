// 5. Write a program which accepts area in square feet and convert it into square meter .(1 square feet = 0.0929 square meter)

import java.util.Scanner;

class Converter
{
    double squareFeet;

    Converter(double A)
    {
        this.squareFeet = A;
    }

    double Squaremeter()
    {
        return squareFeet * 0.0929;
    }

}

class Assignment8_5
{
    public static void main(String[] args) 
    {
        double dRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Area in square feet: ");
        double dValue = sobj.nextDouble();

        Converter cobj = new Converter(dValue);

        dRet = cobj.Squaremeter();

        System.out.println(dRet);
    }
}