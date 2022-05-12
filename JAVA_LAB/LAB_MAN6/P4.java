//Program4: Write a program for exception handling with StringIndexOutOfBound
//exception


public class P4 {
    public static void main(String[] args) {
        String name="Lakshman";
        int len=name.length();
        System.out.println("last index of String NAme is "+(len-1));

        try
        {
            char c=name.charAt(10);
            System.out.println(c);
        }catch (StringIndexOutOfBoundsException sob){
            System.out.println("Exception generated is    :  "+sob);
        }

    }
}
