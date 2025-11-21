// 4. Write a program which accepts temprature in fahrenheit and convert it into celsius.(1 celsius =(fahrenheit - 32) * (5/9))

import java.util.Scanner;

class Converter
{
    double fCs;

    Converter(double A)
    {
        this.fCs = A;
    }

    double fhtoCs()
    {
        return  ((fCs - 32) * (5.0 / 9.0));
    }
}
class Assignment8_4
{
    public static void main(String[] args) 
    {
        double dRet = 0.0;
 
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter tempature in farhenhite: ");
        double dValue = sobj.nextDouble();

        Converter cobj = new Converter(dValue);

        dRet = cobj.fhtoCs();

        System.out.println(dRet);

    }
}