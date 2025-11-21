// 5. Write a program which accept string from user reverse that string in place.

import java.util.Scanner;

class MyString
{
   String s1;

   MyString(String A)
   {
      this.s1 = A;
   }

   void StrRev()
   {
       int iStart = 0;
       int iEnd = s1.length()-1;
       char temp;

       char CH[] = s1.toCharArray();

     while(iStart < iEnd)
     {
         temp =  CH[iStart];
         CH[iStart] = CH[iEnd];
         CH[iEnd] = temp;

         iStart++;
         iEnd--;  
     }
     System.out.print(new String(CH));
   }
}

class Assignment26_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        mobj.StrRev();
    }
}
