// 2. write a program which search Last occurence of particular element from singly linear linked list.

// function should return position at which element is found.

class node
{
    public int data;
    public node next;
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    void InsertFirst(int no)
    {
       node newn = new node();

       newn.data = no;
       newn.next = null;

       if(first == null)
       {
          first = newn;
       }
       else
       {
          newn.next = first;
          first = newn;
       }
       iCount++;
    }

    void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println();
    }

    int SearchLastOccurence(int iNo)
    {
        node temp = first;
        int Lastposition = -1;
        int pos = 1;

        while(temp != null)
        {
            if(temp.data == iNo)
            {
               Lastposition = pos;
            }
             pos++;
            temp = temp.next;     
        }
        return Lastposition;
    }
}

class Assignment34_2
{
    public static void main(String[] args) 
    {
        int iRet = 0;

        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(22);
        sobj.InsertFirst(34);
        sobj.InsertFirst(13);
        sobj.InsertFirst(65);
        sobj.InsertFirst(21);
        sobj.InsertFirst(13);
        sobj.InsertFirst(18);

        sobj.Display();

        iRet = sobj.SearchLastOccurence(13);

        if(iRet == -1)
        {
            System.out.println("Number not found");
        }
        System.out.println("Last occurrence of 13 is at position: "+iRet);
    }
}