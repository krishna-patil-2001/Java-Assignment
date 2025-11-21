// 4. Write a program which accept string from user and display  only digits from that string.


import java.util.Scanner;

class MyString
{
   String s1;

   MyString(String A)
   {
      this.s1 = A;
   }

   void DisplayDigit()
   {
       for(int i = 0; i < s1.length(); i++)
       {
          char ch = s1.charAt(i);

          if(ch >='0' && ch <= '9')
         {
            System.out.print(ch+"  ");
         }
       }
   }
}

class Assignment25_4
{
    public static void main(String[] args) 
    {
         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        mobj.DisplayDigit();
    }
}