// 2. Write a program which accepts Width and Height of Rectangle from user and calculate its area (Area = Width * Height)

import java.util.Scanner;

class Rectangle
{
   double dWidth;
   double dHeight;

   Rectangle(double A, Double B)
   {
     this.dWidth = A;
     this.dHeight = B;
   }

   double RectArea()
   {
      return dWidth * dHeight;
   }
}

class Assignment8_2
{
    public static void main(String[] args) 
    {
        double dRet = 0.0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter width: ");
        double dValue1 = sobj.nextDouble();

        System.out.println("Enter Height: ");
        double dValue2 = sobj.nextDouble();

        Rectangle robj = new Rectangle(dValue1, dValue2);

        dRet = robj.RectArea();

        System.out.println("Area of Rectangle is : "+dRet);
    }
}