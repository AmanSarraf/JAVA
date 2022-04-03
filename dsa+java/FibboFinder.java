public class FibboFinder {
    static double fibofinder(int n)
    {
        return (double)(Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5);
    }

    public static void main(String[] args) {
        System.out.println(fibofinder(10));
    }

}

