//Program3: Is the following code legal?
//try { } finally { }


public class P3 {

    public static void main(String[] args) {
        int a=5,b=0;
        try {
            int c = a / b;
            System.out.println("to check the program holds here");

        }
//        }catch (ArithmeticException ae){
//            System.out.println("This is exception  :  "+ae);
//        }
        finally {
            System.out.println("This is finally block");
        }
    }



}


//////HENCE try{}finally{} is leagal
