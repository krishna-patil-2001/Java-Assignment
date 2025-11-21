// 2. Write a program which accept string from user and convert it into Upper case.


import java.util.Scanner;

class MyString
{
    String s1;

    MyString(String A)
    {
        this.s1 = A;
    }

    void StrUprx()
    {
         for(int i = 0; i < s1.length(); i++)
        {
             char ch = s1.charAt(i);

            if(ch >= 'a'  &&  ch <= 'z')
            {
                ch = (char)(ch - 32);
            }

            System.out.print(ch);
        }
    }
}

class Assignment25_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String sName = sobj.nextLine();

        MyString mobj = new MyString(sName);

        mobj.StrUprx();
    }
}