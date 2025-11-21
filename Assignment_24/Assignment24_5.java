// 5. Write a program which accept string from user and display it in reverse order.

import java.util.Scanner;

class MyString
{
   String s1;

   MyString(String A)
   {
      this.s1 = A;
   }

   void Reverse()
   {
      for(int i = s1.length()-1; i >= 0; i--)
      {
         char ch = s1.charAt(i);

         System.out.print(ch);
      }
   }
}

class Assignment24_5
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        mobj.Reverse();
    }
}