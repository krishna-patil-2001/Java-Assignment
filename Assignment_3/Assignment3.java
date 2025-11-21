// 3. program to print 5 to 1 on screen.


class Print
{
   int no;

   Print(int A)
   {
      this.no = A;
   }

   void Display()
   {
     for(int i = no; i >= 1; i--)
     {
        System.out.println(i);
     }
   }
}

 class Assignment3
{
    public static void main(String[] args) 
    {
        Print obj = new Print(5);

        obj.Display();
    }
}