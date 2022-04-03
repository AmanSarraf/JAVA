public class FibooOneLine {
    static double fibofinder(int n)
    {
        return (double)(((1+Math.sqrt(5))/2)-((1-Math.sqrt(5))/2))/Math.sqrt(5);
    }

    public static void main(String[] args) {
        System.out.println(fibofinder(3));
    }

}
