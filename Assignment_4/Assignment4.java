// 4. Accept one number and check whether is Divisible 5 or not.

import java.util.Scanner;

class Number
{
   int no;

    Number(int A)
   {
      this.no = A;
   }

   boolean CheckDivisible()
   {
      boolean bFlag = false;
      
      if(no % 5 == 0)
      {
         bFlag = true;
      }
      return bFlag;
   }
}

class Assignment4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);

        boolean bRet = nobj.CheckDivisible();

        if(bRet == true)
        {
             System.out.println("Number is Divisible by 5");
        }
        else
        {
             System.out.println("Number is not Divisible by 5");
        }
        
    }
}