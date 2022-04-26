package pack2;

public class Person {

    private String name;
    private int age;
    public void setName(String s)
    {
        this.name=s;

    }
    public void setAge(int a)
    {
        this.age=a;
    }
   public void getName()
    {
        System.out.println("Name = "+this.name);
    }
    public void getAge()
    {
        System.out.println("Age = "+this.age);
    }


   public Person()  // if this would not be public then it won't be accessed outside this package
    {
        System.out.println("This is person in Pack2");
    }
}
