public class Number {
    public static void main(String[] args) {

        printNum(5);

    }
    static void printNum(int n)
    {
        if(n==0)
        {
            return;
        }




        System.out.println(n);
        // this is called tail recursion and we already have printed earlier and
        printNum(n-1); //---->>>this is the last statement to be executed

    }

}
