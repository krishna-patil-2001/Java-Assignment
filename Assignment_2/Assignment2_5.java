// 5. Accept number from user and check whether number is even or odd.

import java.util.Scanner;

class Number
{
    int no;

    Number(int A)
    {
       this.no = A;
    }

    boolean CheckEven()
    {
        boolean bFlag = false;

        if(no % 2 == 0)
        {
            bFlag = true;
        }
        return bFlag;
    }
}
class Assignment2_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Number nobj = new Number(iValue);
        
        boolean bRet = nobj.CheckEven();

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }
        else 
        {
            System.out.println("Number is odd");
        }
    }
}