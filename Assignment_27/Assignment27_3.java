// 3. Write a program which accept string from user and copy Capital characters of that string into another string.

import java.util.Scanner;

class MyString
{
    String s1;
    String s2;

    MyString(String A, String B)
    {
       this.s1 = A;
       this.s2 = B;
    }
    
    void StrCpyCap()
    {
        char temp[] = new char[s1.length()];
        int j = 0;

        for(int i = 0; i < s1.length(); i++)
        {
             if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
             {
                 temp[j] = s1.charAt(i);
                 j++;
             }
        }
        s2 = new String(temp);

        System.out.print(s2);
    }
}

class Assignment27_3
{
    public static void main(String[] args) 
    {
         String sName2 = " ";

         Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String: ");
        String sName1 = sobj.nextLine();

        MyString mobj = new MyString(sName1, sName2);

        mobj.StrCpyCap();
    }
}