import java.util.Scanner;

//Program3: WAP to compute the area of circle. Given that the radius of the circle is 10.8.
public class P3 {

    public static void main(String[] args) {

        System.out.println("Enter the radius ");
        Scanner scan=new Scanner(System.in);
        float radius=scan.nextFloat();
        area(radius);


    }
    static void area(float f)
    {
        System.out.println("Area of the circle is ="+(float)(3.14*(f*f)));
    }
}
