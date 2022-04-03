package pack2;
import pack1.*;  //if use particular class write just name of the class 
public class UseStudent
{
  public static void main(String args[])
  { 
      Student s1=new Student();
      s1.setName("Aman");
      s1.setAge(23);
      System.out.println("Name=="+s1.getName());
System.out.println("Name=="+s1.getAge());
   }

}