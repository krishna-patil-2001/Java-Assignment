// 3. Accept the number from user if number is less than 10 then print "Hello" otherwise print "Demo".

import java.util.Scanner;

class Number
{
   int no;

   Number(int A)
   {
      this.no = A;
   }

   void CheckNumber()
   {
      if(no < 10)
      {
         System.out.println("Hello");
      }
      else
      {
        System.out.println("Demo");
      }
   }
}

class Assignment2_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        nobj.CheckNumber();
    }
}