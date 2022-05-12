//WAP to print area of rectangle and circle using interface

interface Area
{
     void area();
}
class Rectangle implements Area
{
     int length,bredth;
     Rectangle(){}
    Rectangle(int length,int bredth)
    {
        this.length=length;
        this.bredth=bredth;
    }
    @Override
    public void area() {

        System.out.println("The area of Rectangle is "+(length*bredth));

    }
}

class Circle implements Area
{
    int radius;
    final float pi;

    {
        pi = 3.14f;
    }
    Circle(int radius)
    {
        this.radius=radius;
    }
    Circle(){}

    @Override
    public void area() {
        System.out.println("The area of Circle is "+(pi*Math.pow(radius,2)));
    }
}



public class P1 {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle(2,3);
        Circle c1=new Circle(4);

        r1.area();

        c1.area();


    }


}
