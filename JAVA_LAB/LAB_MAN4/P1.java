/*
Program1: Discover what error messages the compiler produces when you make each of
the following mistakes. How many unique error messages are you able to cause the
compiler to produce?
1. Naming your file incorrectly, then compiling.
2. Forgetting a keyword such as void or class
3. Forgetting a quotation mark "
4. Forgetting a parenthesis ( or )
5. Forgetting a dot .
6. Using too many or too few braces { or }
*/


public class P1 {

    public static void main(String[] args) {

        /*
        1. Naming your file incorrectly, then compiling.
        >>if the class inside program is default then keeping different .java file name and class name will not
         create any error
         but if we have a public class with name differrnt then that of .java file it will throw error
        A.java:1: error: class B is public, should be declared in a file named B.java
        public class B
        */

        //2. Forgetting a keyword such as void or class
        //it will throw error class enum interface or record expected


        //3. Forgetting a quotation mark "
         // unclosed string literal



        //4. Forgetting a parenthesis ( or )
          // it will suggest that one ) is expected at line no. if both () missing then it will show not a statement

         //5. Forgetting a dot .

        // will throw error that . or ; expected


        //6. Using too many or too few braces { or }

        //will throw error class enum interface or record expected







    }




}
