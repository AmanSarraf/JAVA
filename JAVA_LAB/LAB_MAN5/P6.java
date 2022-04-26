//Program6: Describe abstract class called Shape which has three subclasses say Triangle,
//        Rectangle, Circle. Define one method area() in the abstract class and override this area() in
//        these three subclasses to calculate for specific object i.e. area() of Triangle subclass should
//        calculate area of triangle etc. Same should be for Rectangle and Circle.



abstract class Shape
{
    public abstract int area();
}
class Triangle extends Shape
{
    private int b,h;
    Triangle()
    {}
    Triangle(int b,int h)
    {
        this.b=b;
        this.h=h;
    }
    public int area()
    {
        return (int)((b*h)/2);
    }

}class Rectangle extends Shape
{
    private int l,b;
    Rectangle()
    {}
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public int area()
    {
        return (int)(l*b);
    }

}
class Circle extends Shape
{
    final float pi=3.14f;
    private float radius;
    Circle(){}
    Circle(float r)
    {
        this.radius=r;
    }
    public int area()
    {
        return(int)(pi*(radius*radius));
    }
}


public class P6 {
    public static void main(String[] args) {
        Circle c1=new Circle(7);
        Triangle t1=new Triangle(2,4);
        Rectangle r1=new Rectangle(5,8);
        System.out.println(c1.area());
        System.out.println(r1.area());
        System.out.println(t1.area());
    }

}
