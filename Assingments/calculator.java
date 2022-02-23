
import java.util.Scanner;

class Conditionals {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int result=0;


        while(true)  // infinite while loop
        {

            System.out.println("Enter the operation ");

            char ch = in.next().trim().charAt(0);  /// for taking character as input
            if(ch=='+'||ch=='-'||ch=='*'||ch=='%'||ch=='/')
            {
                System.out.println("Enter two numbers ");

                int num1 =in.nextInt();
                int num2 =in.nextInt();


                if(ch=='+')
                {
                    result=num1+num2;
                }if(ch=='-')
            {
                result=num1-num2;
            }if(ch=='*')
            {
                result=num1*num2;
            }if(ch=='/')
            {
                if(num2!=0) {
                    result = num1 + num2;
                }
                else

                {
                    System.out.println("Cannot divide by Zero");
                }
            }if(ch=='%')
            {
                result=num1%num2;
            }
            }
            else if(ch=='x'||ch=='X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid operator");
            }


            System.out.println(result);
        }

    }
}
