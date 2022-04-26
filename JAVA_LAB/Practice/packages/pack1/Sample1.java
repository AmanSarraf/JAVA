package pack1;




public class Sample1 {

    public String name;
     public void setName(String name)
     {
         this.name=name;
     }
     public void getName()
     {
         System.out.println("Your Name ="+this.name);
     }




    public static void main(String[] args) {
        System.out.println("This is sample 1");
        Sample1 obj=new Sample1();
        obj.setName("Aman");
        obj.getName();
    }

}
