import java.util.Scanner;

//WAP to convert the given temperature in Fahrenheit to Celsius using the
//following conversion formula C=(F*32)/1.8.
public class P5 {
    static void celTofar(int a)//(5/9*(a-32)
    {
        System.out.println("Temperature in celcius is "+(a-32)*5/9);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int celcius;
        System.out.println("Enter temperature in celcius");
        celcius=sc.nextInt();
        celTofar(celcius);
    }
}
