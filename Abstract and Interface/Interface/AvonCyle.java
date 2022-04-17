package Interface;


class Vehical
{
    public String name;
    Vehical(String n)
    {
        name=n;
    }

}

 interface Cycle
 {
     int test=100;
     void applybreak();
     void speedUp();
 }
 interface HornCycle
 {
     void BlowHorn1();
     void BlowHorn2();
 }
 public class AvonCyle extends Vehical implements Cycle,HornCycle {

    AvonCyle(String s)
    {
        super(s);
    }
    public void applybreak()
     {
         System.out.println("Ruk ja bhai ");

     }
     public void speedUp()
     {
         System.out.println("Jaldi chala le bhai");
     }
     public void BlowHorn1()
     {
         System.out.println("Pee Pee Poo Poo ");
     }public void BlowHorn2()
     {
         System.out.println("bee bee boo boo ");
     }


     public static void main(String[] args) {

        AvonCyle Xsports=new AvonCyle("2 Wheeler");

        Xsports.applybreak();
        Xsports.speedUp();
        Xsports.BlowHorn1();
        Xsports.BlowHorn2();
         System.out.println(AvonCyle.test);
         System.out.println(Xsports.name);

     }


}
