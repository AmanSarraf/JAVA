package Abstract;

import java.util.Scanner;

public class Student extends Person {

     public void setDetails()
     {
         System.out.println("Enter your name Student:");

         Scanner input=new Scanner(System.in);

         super.name=input.nextLine();
         System.out.println("your age ?:");
         super.age=input.nextInt();
     }
     public void getDetails()
     {
         System.out.println("Name="+super.name);
         System.out.println("Age="+super.age);
     }


}
