// 5. Write a program which Accept two string from user and concat second string after first string(Implement strcat() function).


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

   void StrCatX()
   {  
      char arr1[] = s1.toCharArray();
      char arr2[] = s2.toCharArray();

      char Arr[] = new char[s1.length() + s2.length()];
      int i = 0;

      for( ; i < arr1.length; i++)
      {
         Arr[i] = arr1[i];
      }

      for(int j = 0; j < arr2.length; j++, i++)
      {
         Arr[i] = arr2[j];
      }

      String finalString = new String(Arr);

      System.out.println(finalString);
   }
}

class Assignment27_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first String: ");
        String sName1 = sobj.nextLine();

        System.out.println("Enter second String: ");
        String sName2 = sobj.nextLine();

        MyString mobj = new MyString(sName1, sName2);

        mobj.StrCatX();
    }
}
