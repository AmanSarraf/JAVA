//Program6: Write a suitable program for the following conditions:
//1. A try block followed by multiple catch blocks
//2. Catching multiple type of exceptions
//3. Using throws/throw keywords
//4. Using finally block
//5. Using try-with-resources
//6. User-defined exceptions

//>>>>Throw -for throwig Exception explicitly py programmers
//>>>>Throws- used to declare an exception so as to inform the program about that the method might generate Exception so better handle it


class DivException extends Exception   // user difinned Exception
{
    public String toString()
    {
        return "Can't divide by zero";
    }
    public String getString()
    {
        return"be careful";
    }
}




public class P6 {

    public static int divide(int a,int b)throws DivException
    {
        if(b==0)
        {
            throw new DivException();

        }
        else
        {
           return a/b;
        }

    }

    public static void main(String[] args)  {
        int[] arr=new int[5];
        int a=10,b=0;
        int c;
        try
        {
             c=a/b;
            System.out.println("inside try");
            System.out.println(arr[7]);

        }catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.println(ai);
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }catch(Exception e)
        {
            System.out.println("genral block "+e);
        }


        try
        {
            String s=null;
            System.out.println(s.length());
        }
        catch (NullPointerException npe)
        {
            System.out.println(npe);
        }
        finally {
            System.out.println("This will always execute");
        }
        System.out.println("Rest of the code");

        try {
        System.out.println(divide(a,b));

        }catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("code after throw block");



    }



}
