package pack1;

public class Sample2 extends Sample1{

    public int age;
    public void setAge(int age)
    {
        this.age=age;
    }
    public void getDetails()
    {
        System.out.println("Name = "+super.name);
        System.out.println("Name = "+this.age);
    }

    public static void main(String[] args) {
        Sample1 obj1=new Sample1();

        Sample2 obj=new Sample2();
        obj.setName("chaman");
        obj.setAge(22);
        obj.getDetails();
        obj1.name="Raman";
        obj1.getName();
    }


}
