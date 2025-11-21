// 1. Write a program which accepts radius of circle from user and calculate its area. consider value of PI as 3.14(Area = PI * Radius * Radius)

import java.util.Scanner;

class Circle
{
   double fRadius;
   double PI;

   Circle(double A)
   {
      this.fRadius = A;
      this.PI = 3.14;
   }

   double CircleArea()
   {
      double fArea = 0.0;

      fArea = PI * fRadius * fRadius;

      return fArea;
   }
}

class Assignment8_1
{
    public static void main(String[] args) 
    {
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double fValue = sobj.nextFloat();
        
        Circle cobj = new Circle(fValue);

        fRet = cobj.CircleArea();

        System.out.println("Area of Circle is : "+dRet);
    }
}