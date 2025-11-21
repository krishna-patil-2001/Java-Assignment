// 4. Write a program which accept string from user and check wether it contains vowels in it or not.

import java.util.Scanner;

class MyString
{
   String s1;

   MyString(String A)
   {
       this.s1 = A;
   }

   boolean ChkVowel()
   {
      boolean bFlag = false;
      
      for(int i = 0; i < s1.length(); i++)
      {
          char ch = s1.charAt(i);

          if(ch == 'A'  ||  ch == 'E'  || ch == 'I' ||  ch == 'O'  || ch == 'U'  ||
             ch == 'a'  ||  ch == 'e'  || ch == 'i' ||  ch == 'o'  || ch == 'u')
             {
                 bFlag = true;
                 break;
             }
      }
      return bFlag;
   }
}

class Assignment24_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        boolean bRet = mobj.ChkVowel();

        if(bRet == true)
        {
            System.out.println("it contains vowel");
        }
        else
        {
            System.out.println("it not contains vowel");
        }
    }
}