//Program to Check weather a number is palindrom or not

import java.util.*;

class Main
{

   public static void main(String args[])
 {
   int remainder, reverse=0, actual;

     Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to check :");
      
       int num = sc.nextInt();

        actual=num;

      while(num!=0)
      {
          remainder=num%10;
          reverse=(reverse*10)+remainder;
          num=num/10;

       }
       
       
       System.out.println(reverse);


      if(actual==reverse)
       {

         System.out.println("Palindrom");


       }
       else
       {

         System.out.println("Not Palindrom");
       }




 }


}