// 2. program to print 5 times "Marvellous" on screen.

class Print
{
    int no;

    Print(int A)
    {
       this.no = A;
    }

     void Display()
    {
        for(int i = 1; i <= no; i++)
        {
            System.out.println("Marvellous");
        }
    }
}

class Assignment2
{
    public static void main(String[] args) 
    {
        
       Print obj = new Print(5);

       obj.Display();

    }
   
}