// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//Implementation of Stack Data Structre using Array
/* methods involved:
   1.Push
   2.Pop
   3.peek
   4.size*/
import java.util.*;
class Stack

{   
    private int top;
    private int capacity; //max size
    private int a[];

     // Constructor to initialize the stack

Stack(int size)
{
  a=new int[size];
 capacity=size;
 top=-1;
}

   

    void push()
     {

       if(top==capacity-1)
       {
          System.out.println("Overflow");

        }
        else
        {
          System.out.println("Enter data");
          Scanner scan=new Scanner(System.in);
          int data=scan.nextInt();
          top++;
          a[top]=data;
 
          System.out.println("Item Inserted");
        }
      }

     void pop()
      {
            if(top==-1)
             {
               System.out.println("Underflow");
              }
            else
          {
              top=top-1;
              System.out.println("Pop Successful");
 
          }

       }


     void peek()

  {
            if(top==-1)
             {
               System.out.println("Underflow");
              }
            else
          {
              top=top-1;
              System.out.println(a[top]);
 
          }

       }

void size()

 {
  System.out.println("Size of the Stack is"+ (top+1));
 }

}



 class StackArray
{
    public static void main(String args[])

{
  
  Stack S1=new Stack(5);
   
  S1.push();
  S1.push();
  S1.push();
  S1.peek();
  S1.pop();
  S1.peek();
  s1.size();
  System.out.println("Bye");
  
}



}