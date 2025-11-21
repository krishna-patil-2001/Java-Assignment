// 1. program to divide two numbers

class Arithmetic
{
    int no1, no2, Ans;

    Arithmetic(int A, int B)
    {
        this.no1 = A;
        this.no2 = B;
        Ans = 0;
    }
    public int Division()
    {
          Ans = no1/no2;

          return Ans;
    }
}
class Assignment1
{
   public static void main(String[] args) 
   {
       int value1 = 10, value2 = 5;

       Arithmetic aobj = new Arithmetic(value1, value2);

       int iRet = aobj.Division();

       System.out.println("Division is: "+iRet);

       
   }
}